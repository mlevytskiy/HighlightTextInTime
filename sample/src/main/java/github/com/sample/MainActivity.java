package github.com.sample;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.gson.Gson;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.List;

import github.com.highlightTextInTime.HighlightSomeTextTextView;
import github.com.highlightTextInTime.HighlightedText;
import github.com.sample.buisnessObject.Article;
import github.com.sample.buisnessObject.ArticleWord;


public class MainActivity extends AppCompatActivity {

    private boolean isPlaying = false;
    private HighlightSomeTextTextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AsyncTask<Void, Void, Article>() {

            @Override
            protected Article doInBackground(Void... params) {
                try {
                    return new Gson().fromJson(IOUtils.toString(getAssets().open("article.json")),
                            Article.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(Article article) {
                super.onPostExecute(article);

                textView = (HighlightSomeTextTextView) findViewById(R.id.highlight_text_view);

                String text = article.content;
                List<ArticleWord> words = article.getWords();

                fillTextView(text, words);

            }
        }.execute();

    }

    private void fillTextView(String text, List<ArticleWord> words) {
        List<HighlightedText> highlightedTexts = ArticleWordsToHighlightedTextsConverter.convert(words, text);
        textView.setText(text);
        textView.setWords(highlightedTexts);
    }

    public void onClickPlayPause(View view) {
        FloatingActionButton button = (FloatingActionButton) view;
        isPlaying = !isPlaying;
        if (isPlaying) {
            textView.play();
            Drawable pauseDrawable = getResources().getDrawable(android.R.drawable.ic_media_pause);
            button.setImageDrawable(pauseDrawable);
        } else {
            textView.pause();
            Drawable playDrawable = getResources().getDrawable(android.R.drawable.ic_media_play);
            button.setImageDrawable(playDrawable);
        }
    }
}
