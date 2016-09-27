package com.jackleeentertainment.jackclock;

import com.jackleeentertainment.jackclock.object.AlarmOwner;
import com.jackleeentertainment.jackclock.object.Post;
import com.jackleeentertainment.jackclock.object.Profile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 * Created by Jacklee on 2016. 9. 20..
 */

public class Ram {

    static public Profile myProfile;

    static public ArrayList<Post> arlPosts;
    static public HashMap<String, Long> hmapKeyPostOIdValueLastTs;
    static public HashMap<String, Post> hmapPosts;
    static public HashMap<String, Profile> hmapProfiles;
    static public HashMap<String, AlarmOwner> hmapAlarmOwners;

    public static void initArlPosts() {
        arlPosts = new ArrayList<>();
    }

    public static void initHmapKeyPostOIdValueLastTs() {
        hmapKeyPostOIdValueLastTs = new HashMap<>();
    }

    public static void initHmapPosts() {
        hmapPosts = new HashMap<>();
    }


    public static void initHmapProfiles() {
        hmapProfiles = new HashMap<>();
    }


    public static void initHmapAlarmOwners() {
        hmapAlarmOwners = new HashMap<>();
    }




    public static void addPost(Post post) {
        if (Ram.arlPosts == null){
            Ram.initArlPosts();
        }
        Ram.arlPosts.add(post);
    }



    public static void addKeyPostOIdValueLastTs(String postId, long ts) {
        if (Ram.hmapKeyPostOIdValueLastTs == null){
            Ram.initHmapKeyPostOIdValueLastTs();
        }
        Ram.hmapKeyPostOIdValueLastTs.put(postId, ts);
    }


    public static void addPost(String postId, Post post) {
        if (Ram.hmapPosts == null){
            Ram.initHmapPosts();
        }
        Ram.hmapPosts.put(postId, post);
    }

    public static void addProfile(String uid, Profile profile) {
        if (Ram.hmapProfiles == null){
            Ram.initHmapProfiles();
        }
        Ram.hmapProfiles.put(uid, profile);
    }

    public static void addAlarmOwner(String aid, AlarmOwner alarmOwner) {
        if (Ram.hmapAlarmOwners == null){
            Ram.initHmapAlarmOwners();
        }
        Ram.hmapAlarmOwners.put(aid, alarmOwner);
    }

     public static void sortArlPostsByTs(){
         //sort by Ts
         Collections.sort(Ram.arlPosts, new Comparator<Post>() {
             @Override
             public int compare(Post o1, Post o2) {
                 return ((Long)o1.getTs()).compareTo((Long)o2.getTs());
             }
         });
     }



}
