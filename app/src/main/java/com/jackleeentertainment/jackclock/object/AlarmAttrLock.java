package com.jackleeentertainment.jackclock.object;

import java.io.Serializable;

/**
 * Created by Jacklee on 2016. 9. 11..
 */
public class AlarmAttrLock {

    boolean islocked;
    String uid;
    long ts;

    public AlarmAttrLock() {
        super();
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public boolean getIslocked() {
        return islocked;
    }

    public void setIslocked(boolean islocked) {
        this.islocked = islocked;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}
