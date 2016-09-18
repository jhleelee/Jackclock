package com.jackleeentertainment.jackclock.object;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Jacklee on 2016. 9. 11..
 */
public class SndVib {

    //Object
    private String oid;
    private String otitle;
    private String odetail;
    long ts;

    //UId
    private String uid;
    private String uname;

    //Like
    private List<String> like_uids;
    private List<String> select_oids;
    private List<RateComment> ratecomments;


    public SndVib() {
        super();
    }

    public List<RateComment> getRatecomments() {
        return ratecomments;
    }

    public void setRatecomments(List<RateComment> ratecomments) {
        this.ratecomments = ratecomments;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getOtitle() {
        return otitle;
    }

    public void setOtitle(String otitle) {
        this.otitle = otitle;
    }

    public String getOdetail() {
        return odetail;
    }

    public void setOdetail(String odetail) {
        this.odetail = odetail;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public List<String> getLike_uids() {
        return like_uids;
    }

    public void setLike_uids(List<String> like_uids) {
        this.like_uids = like_uids;
    }

    public List<String> getSelect_oids() {
        return select_oids;
    }

    public void setSelect_oids(List<String> select_oids) {
        this.select_oids = select_oids;
    }

}
