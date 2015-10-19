package github.com.sample;

import java.util.ArrayList;
import java.util.List;

import github.com.highlightTextInTime.HighlightedText;
import github.com.sample.buisnessObject.ArticleWord;

/**
 * Created by max on 19.10.15.
 */
public class ArticleWordsToHighlightedTextsConverter {

    public static List<HighlightedText> convert(List<ArticleWord> list, String text) {
        StringBuilder strBuilder = new StringBuilder(text);
        int lastIndex = 0;

        List<HighlightedText> highlightedTexts = new ArrayList<>();
        for (ArticleWord word : list) {
            if (word.getTimeMin() != null) {
                highlightedTexts.add(word);
                String str = word.getWord();
                int startPos = strBuilder.indexOf(str, lastIndex);
                lastIndex = startPos + str.length();
                word.setStartPositionInArticle(startPos);
                word.calculateDurationTime();
            }
        }

        return highlightedTexts;
    }
}
