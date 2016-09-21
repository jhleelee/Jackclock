package com.jackleeentertainment.jackclock.object;

/**
 * Created by Jacklee on 2016. 9. 21..
 */

public class JackOwner extends Jack {

    String owner_uid;
    String owner_name;
    Post owner_mostrecentpost;

    public JackOwner() {
        super();
    }

    public String getOwner_uid() {
        return owner_uid;
    }

    public void setOwner_uid(String owner_uid) {
        this.owner_uid = owner_uid;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public Post getOwner_mostrecentpost() {
        return owner_mostrecentpost;
    }

    public void setOwner_mostrecentpost(Post owner_mostrecentpost) {
        this.owner_mostrecentpost = owner_mostrecentpost;
    }

}
