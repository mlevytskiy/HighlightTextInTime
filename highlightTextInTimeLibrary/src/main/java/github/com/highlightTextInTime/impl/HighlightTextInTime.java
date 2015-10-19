package github.com.highlightTextInTime.impl;

import android.os.Handler;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import github.com.highlightTextInTime.HighlightedText;

/**
 * Created by max on 17.10.15.
 */
public class HighlightTextInTime {

    private List<HighlightedText> words;
    private BlockingQueue<HighlightedTextDelayed> queue = new DelayQueue<>();
    private long startPlayArticleTime;
    private volatile AtomicLong progressTime = new AtomicLong();
    private OnlyOneChoiceBackgroundColorSpan onlyOneChoiceBackgroundColorSpan;

    public HighlightTextInTime() {
        final Handler handler = new Handler();
        ExecutorHolder.STACK_EXECUTOR.execute(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        HighlightedTextDelayed delayed = queue.take();
                        progressTime.set(delayed.getHighlightedText().getStartTime());
                        final int startPos = delayed.getHighlightedText().startPositionInArticle();
                        final int endPos = startPos + delayed.getHighlightedText().getLength();
                        if (onlyOneChoiceBackgroundColorSpan != null) {
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    onlyOneChoiceBackgroundColorSpan.choice(startPos, endPos);
                                }
                            });
                        } else {
                            //do nothing
                        }

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public void play() {
        startPlayArticleTime = TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
        seekTo(0);
    }

    public void seekTo(long progressTime) {
        for (HighlightedText word : words) {
            if (word.getStartTime() > progressTime) {
                queue.add(new HighlightedTextDelayed(startPlayArticleTime, word));
            }
        }
    }

    public void stop() {
        queue.clear();
    }

    public long getProgressTime() {
        return progressTime.get();
    }

    public void setOnlyOneChoiceBackgroundColorSpan(OnlyOneChoiceBackgroundColorSpan onlyOneChoiceBackgroundColorSpan) {
        this.onlyOneChoiceBackgroundColorSpan = onlyOneChoiceBackgroundColorSpan;
    }

    public void setWords(List<HighlightedText> words) {
        this.words = words;
    }

}
