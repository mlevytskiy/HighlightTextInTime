package github.com.sample.buisnessObject; /**
 * Copyright (c) 2015, INREADO LLC All rights reserved.
 * <p/>
 * @author Sergey Bushnyak, sigrlami.eu, sergey.bushnyak@sigrlami.eu
 */

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Translation implements Serializable{

    @SerializedName("idLanguage")
    public int idLang;
    @SerializedName("languageShortName")
    public String langShort;
    @SerializedName("languageLongName")
    public String lang;
    @SerializedName("translation")
    public String translation;

}
