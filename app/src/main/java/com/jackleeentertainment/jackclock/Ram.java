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


    public static void initHmapPosts() {
        hmapPosts = new HashMap<>();
    }


    public static void initHmapProfiles() {
        hmapProfiles = new HashMap<>();
    }


    public static void initHmapAlarmOwners() {
        hmapAlarmOwners = new HashMap<>();
    }

    private void addPost(String postId, Post post) {
        if (Ram.hmapPosts == null){
            Ram.initHmapPosts();
        }
        Ram.hmapPosts.put(postId, post);
    }

    private void addProfile(String uid, Profile profile) {
        if (Ram.hmapProfiles == null){
            Ram.initHmapProfiles();
        }
        Ram.hmapProfiles.put(uid, profile);
    }

    private void addAlarmOwner(String aid, AlarmOwner alarmOwner) {
        if (Ram.hmapAlarmOwners == null){
            Ram.initHmapAlarmOwners();
        }
        Ram.hmapAlarmOwners.put(aid, alarmOwner);
    }


}
