package com.jackleeentertainment.jackclock.object;

/**
 * Created by Jacklee on 2016. 9. 21..
 */

public class JackOwnerMe extends JackOwner {

    String my_uid;
    String my_name;

    public JackOwnerMe() {
        super();
    }

    public String getMy_name() {
        return my_name;
    }

    public void setMy_name(String my_name) {
        this.my_name = my_name;
    }

    public String getMy_uid() {
        return my_uid;
    }

    public void setMy_uid(String my_uid) {
        this.my_uid = my_uid;
    }

}
