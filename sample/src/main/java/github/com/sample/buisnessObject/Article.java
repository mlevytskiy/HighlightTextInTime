package github.com.sample.buisnessObject; /**
 * Copyright (c) 2015, INREADO LLC All rights reserved.
 * <p/>
 * @author Sergey Bushnyak, sigrlami.eu, sergey.bushnyak@sigrlami.eu
 */

import java.io.Serializable;
import java.util.List;

/**
 *
 */
public class Article implements Serializable {

    public String language;
    public String contentShort; // local field - 25% of text
    public String content;
    public String source;
    public String author;
    public String hyperlink;
    public List<ArticleWord> words;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getContentShort() {
        return contentShort;
    }

    public void setContentShort(String contentShort) {
        this.contentShort = contentShort;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getHyperlink() {
        return hyperlink;
    }

    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    public List<ArticleWord> getWords() {
        return words;
    }

    public void setWords(List<ArticleWord> words) {
        this.words = words;
    }

}
