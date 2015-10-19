package github.com.sample.buisnessObject; /**
 * Copyright (c) 2015, INREADO LLC All rights reserved.
 * <p/>
 * @author Sergey Bushnyak, sigrlami.eu, sergey.bushnyak@sigrlami.eu
 */

import java.io.Serializable;

/**
 *
 */
public class Context implements Serializable{
    private int idLanguage;
    private String languageShortName;
    private String languageLongName;
    private String translation;

    public int getIdLanguage() {
        return idLanguage;
    }

    public void setIdLanguage(int idLanguage) {
        this.idLanguage = idLanguage;
    }

    public String getLanguageShortName() {
        return languageShortName;
    }

    public void setLanguageShortName(String languageShortName) {
        this.languageShortName = languageShortName;
    }

    public String getLanguageLongName() {
        return languageLongName;
    }

    public void setLanguageLongName(String languageLongName) {
        this.languageLongName = languageLongName;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }
}
