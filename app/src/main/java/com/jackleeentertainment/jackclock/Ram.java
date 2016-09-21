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

    static public HashMap<String, Post> hmapPosts;
    static public HashMap<String, Profile> hmapProfiles;
    static public HashMap<String, AlarmOwner> hmapAlarmOwners;


    void init() {
        hmapPosts = new HashMap<>();
        hmapProfiles = new HashMap<>();
        hmapAlarmOwners = new HashMap<>();
    }




}
