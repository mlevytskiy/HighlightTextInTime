package github.com.highlightTextInTime;

import android.content.*;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.TextView;

import java.util.List;

import github.com.highlightTextInTime.impl.HighlightTextInTime;
import github.com.highlightTextInTime.impl.OnlyOneChoiceBackgroundColorSpan;

/**
 * Created by max on 18.10.15.
 */
public class HighlightSomeTextTextView extends TextView {

    private OnlyOneChoiceBackgroundColorSpan colorSpan;
    private HighlightTextInTime highlightTextInTime;

    public HighlightSomeTextTextView(Context context) {
        super(context);
        init(context);
    }

    public HighlightSomeTextTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public HighlightSomeTextTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        //do nothing
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        colorSpan = null;
        highlightTextInTime = null;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        colorSpan = new OnlyOneChoiceBackgroundColorSpan();
        highlightTextInTime = new HighlightTextInTime();
    }

    public void setText(CharSequence text, BufferType type) {
        if (colorSpan == null) {
            super.setText(text, type);
        } else {
            super.setText(text, TextView.BufferType.SPANNABLE);
            colorSpan.setSpannable((Spannable) getText());
            highlightTextInTime.setOnlyOneChoiceBackgroundColorSpan(colorSpan);
        }
    }

    public void setWords(List<HighlightedText> words) {
        highlightTextInTime.setWords(words);
    }

    public void play() {
        highlightTextInTime.play();
    }

    public void pause() {
        highlightTextInTime.stop();
    }

    public void resume(long millis) {
        highlightTextInTime.seekTo(millis);
    }

    public void seekTo(long millis) {
        highlightTextInTime.seekTo(millis);
    }

    public void highlightNextWord() {

    }

    public void highlightPrevWord() {

    }

}
