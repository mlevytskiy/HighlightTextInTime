package github.com.sample.buisnessObject; /**
 * Copyright (c) 2015, INREADO LLC All rights reserved.
 * <p/>
 * @author Sergey Bushnyak, sigrlami.eu, sergey.bushnyak@sigrlami.eu
 */

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import github.com.highlightTextInTime.HighlightedText;


/**
 *
 */
public class ArticleWord implements Serializable, HighlightedText {

    private String NER;
    private String POS;
    private String word;
    private Long timeMin;
    private Long timeMax;
    private SynonymGroup synonymGroup;
    private String lemma;
    private Integer indexInSentence;
    private Boolean isNewLineSymbol;
    private Boolean isPunctuationMark;
    private Integer indexInText;
    private Integer incrementId;
    private Integer sentenceWordId;
    private Integer idLink;
    private Integer id;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private long durationTime;

    private int startPositionInArticle;

    public String getNER() {
        return NER;
    }

    public void setNER(String NER) {
        this.NER = NER;
    }

    public String getPOS() {
        return POS;
    }

    public void setPOS(String POS) {
        this.POS = POS;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Long getTimeMin() {
        return timeMin;
    }

    public void setTimeMin(Long timeMin) {
        this.timeMin = timeMin;
    }

    public Long getTimeMax() {
        return timeMax;
    }

    public void setTimeMax(Long timeMax) {
        this.timeMax = timeMax;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public SynonymGroup getSynonymGroup() {
        return synonymGroup;
    }

    public void setSynonymGroup(SynonymGroup synonymGroup) {
        this.synonymGroup = synonymGroup;
    }

    public String getLemma() {
        return lemma;
    }

    public void setLemma(String lemma) {
        this.lemma = lemma;
    }

    public Integer getIndexInSentence() {
        return indexInSentence;
    }

    public void setIndexInSentence(Integer indexInSentence) {
        this.indexInSentence = indexInSentence;
    }

    public Boolean getIsNewLineSymbol() {
        return isNewLineSymbol;
    }

    public void setIsNewLineSymbol(Boolean isNewLineSymbol) {
        this.isNewLineSymbol = isNewLineSymbol;
    }

    public Boolean getIsPunctuationMark() {
        return isPunctuationMark;
    }

    public void setIsPunctuationMark(Boolean isPunctuationMark) {
        this.isPunctuationMark = isPunctuationMark;
    }

    public Integer getIndexInText() {
        return indexInText;
    }

    public void setIndexInText(Integer indexInText) {
        this.indexInText = indexInText;
    }

    public Integer getIncrementId() {
        return incrementId;
    }

    public void setIncrementId(Integer incrementId) {
        this.incrementId = incrementId;
    }

    public Integer getSentenceWordId() {
        return sentenceWordId;
    }

    public void setSentenceWordId(Integer sentenceWordId) {
        this.sentenceWordId = sentenceWordId;
    }

    public Integer getIdLink() {
        return idLink;
    }

    public void setIdLink(Integer idLink) {
        this.idLink = idLink;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public int getLength() {
        return word.length();
    }

    @Override
    public int startPositionInArticle() {
        return startPositionInArticle;
    }

    @Override
    public long getStartTime() {
        return timeMin;
    }

    public long getEndTime() {
        return timeMax;
    }

    public void setStartPositionInArticle(int startPositionInArticle) {
        this.startPositionInArticle = startPositionInArticle;
    }

    public long getDurationTime() {
        return durationTime;
    }

    public void calculateDurationTime() {
        durationTime = timeMax - timeMin;
    }

}
