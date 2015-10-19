package github.com.highlightTextInTime.impl;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

import github.com.highlightTextInTime.HighlightedText;


/**
 * Created by max on 18.10.15.
 */
public class HighlightedTextDelayed implements Delayed {

    private long startArticleTime;
    private long delay;
    private HighlightedText highlightedText;

    public HighlightedTextDelayed(long startArticleTime,
                                  HighlightedText highlightedText) {
        delay = highlightedText.getStartTime();
        this.startArticleTime = startArticleTime;
        this.highlightedText = highlightedText;
    }

    public HighlightedText getHighlightedText() {
        return this.highlightedText;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long currentTime = TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
        return unit.convert( delay - ( currentTime - startArticleTime ),
                TimeUnit.MILLISECONDS );
    }

    @Override
    public int compareTo(Delayed another) {
        if( another == this ) {
            return 0;
        }
        long d = ( getDelay( TimeUnit.MILLISECONDS ) - another.getDelay( TimeUnit.MILLISECONDS ) );
        return ( ( d == 0 ) ? 0 : ( ( d < 0 ) ? -1 : 1 ) );
    }

}
