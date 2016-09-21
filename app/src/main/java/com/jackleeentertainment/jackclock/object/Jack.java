package com.jackleeentertainment.jackclock.object;

import java.util.List;

/**
 * Created by Jacklee on 2016. 9. 21..
 */

public class Jack {

    String oid;
    String title;
    String detail;
    List<String> tags;

    public Jack() {
        super();
    }


    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
