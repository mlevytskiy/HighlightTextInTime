package github.com.highlightTextInTime.impl;

import android.graphics.Color;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;

/**
 * Created by max on 17.10.15.
 */
public class OnlyOneChoiceBackgroundColorSpan {
    
    private static final int DEFAULT_COLOR = Color.LTGRAY;
    private Spannable spannable;
    private BackgroundColorSpan last = null;
    private int color = DEFAULT_COLOR;
    private boolean colorWasChange = false;

    public void setSpannable(Spannable spannable) {
        this.spannable = spannable;
    }

    public void setColor(int color) {
        this.color = color;
        colorWasChange = true;
    }

    public void choice(int startIndex, int endIndex) {
        if (last == null) {
            last = new BackgroundColorSpan(color);
        } else {
            spannable.removeSpan(last);
            if (colorWasChange) {
                last = new BackgroundColorSpan(color);
                colorWasChange = false;
            }
        }
        spannable.setSpan(last, startIndex, endIndex,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
    }

    public void removeAllSpan() {
        Object spansToRemove[] = spannable.getSpans(0, spannable.length(), Object.class);
        for(Object span: spansToRemove){
            if(span instanceof CharacterStyle)
                spannable.removeSpan(span);
        }
    }

}
