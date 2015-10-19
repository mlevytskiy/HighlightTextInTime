package github.com.sample.buisnessObject; /**
 * Copyright (c) 2015, INREADO LLC All rights reserved.
 * <p/>
 * @author Sergey Bushnyak, sigrlami.eu, sergey.bushnyak@sigrlami.eu
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class SynonymGroup implements Serializable {

    private String baseFormName;
    private List<Context> context = new ArrayList<Context>();
    private String baseFormTranscription;
    private Integer baseFormPronunciationFile;
    private Integer idSynonymGroup;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The baseFormName
     */
    public String getBaseFormName() {
        return baseFormName;
    }

    /**
     *
     * @param baseFormName
     * The baseFormName
     */
    public void setBaseFormName(String baseFormName) {
        this.baseFormName = baseFormName;
    }

    /**
     *
     * @return
     * The context
     */
    public List<Context> getContext() {
        return context;
    }

    /**
     *
     * @param context
     * The context
     */
    public void setContext(List<Context> context) {
        this.context = context;
    }

    /**
     *
     * @return
     * The baseFormTranscription
     */
    public String getBaseFormTranscription() {
        return baseFormTranscription;
    }

    /**
     *
     * @param baseFormTranscription
     * The baseFormTranscription
     */
    public void setBaseFormTranscription(String baseFormTranscription) {
        this.baseFormTranscription = baseFormTranscription;
    }

    /**
     *
     * @return
     * The baseFormPronunciationFile
     */
    public Integer getBaseFormPronunciationFile() {
        return baseFormPronunciationFile;
    }

    /**
     *
     * @param baseFormPronunciationFile
     * The baseFormPronunciationFile
     */
    public void setBaseFormPronunciationFile(Integer baseFormPronunciationFile) {
        this.baseFormPronunciationFile = baseFormPronunciationFile;
    }

    /**
     *
     * @return
     * The idSynonymGroup
     */
    public Integer getIdSynonymGroup() {
        return idSynonymGroup;
    }

    /**
     *
     * @param idSynonymGroup
     * The idSynonymGroup
     */
    public void setIdSynonymGroup(Integer idSynonymGroup) {
        this.idSynonymGroup = idSynonymGroup;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
