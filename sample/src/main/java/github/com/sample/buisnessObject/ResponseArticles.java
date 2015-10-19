package github.com.sample.buisnessObject; /**
 * Copyright (c) 2015, INREADO LLC All rights reserved.
 * <p/>
 * @author Sergey Bushnyak, sigrlami.eu, sergey.bushnyak@sigrlami.eu
 */

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ResponseArticles {

    @SerializedName("items")
    public ArrayList<Article> articles;
    @SerializedName("count")
    public int count;

}
