package com.jackleeentertainment.jackclock;

import com.jackleeentertainment.jackclock.object.AlarmOwner;
import com.jackleeentertainment.jackclock.object.Post;
import com.jackleeentertainment.jackclock.object.Profile;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jacklee on 2016. 9. 20..
 */

public class Ram {

    HashMap<String, Post> hmapPosts;
    HashMap<String, Profile> hmapProfiles;
    HashMap<String, AlarmOwner> hmapAlarmOwners;

    public Ram() {
        super();
        init();
    }



    void init() {
        hmapPosts = new HashMap<>();
        hmapProfiles = new HashMap<>();
        hmapAlarmOwners = new HashMap<>();
    }


    /*
    Getter , Setter
     */
    public HashMap<String, AlarmOwner> getHmapAlarmOwners() {
        return hmapAlarmOwners;
    }

    public void setHmapAlarmOwners(HashMap<String, AlarmOwner> hmapAlarmOwners) {
        this.hmapAlarmOwners = hmapAlarmOwners;
    }

    public HashMap<String, Post> getHmapPosts() {
        return hmapPosts;
    }

    public void setHmapPosts(HashMap<String, Post> hmapPosts) {
        this.hmapPosts = hmapPosts;
    }

    public HashMap<String, Profile> getHmapProfiles() {
        return hmapProfiles;
    }

    public void setHmapProfiles(HashMap<String, Profile> hmapProfiles) {
        this.hmapProfiles = hmapProfiles;
    }

}
