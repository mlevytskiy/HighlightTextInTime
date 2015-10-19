package github.com.sample.buisnessObject; /**
 * Copyright (c) 2015, INREADO LLC All rights reserved.
 * <p/>
 * @author Sergey Bushnyak, sigrlami.eu, sergey.bushnyak@sigrlami.eu
 */

import java.io.Serializable;

/**
 *
 */
public class SelectedWord extends ArticleWord implements Serializable {

    private long countClick;
    private long timeChange;

    public SelectedWord() {
        super();
    }

    public long getCountClick() {
        return countClick;
    }

    public void setCountClick(long countClick) {
        this.countClick = countClick;
    }

    public long getTimeChange() {
        return timeChange;
    }

    public void setTimeChange(long timeChange) {
        this.timeChange = timeChange;
    }
}
