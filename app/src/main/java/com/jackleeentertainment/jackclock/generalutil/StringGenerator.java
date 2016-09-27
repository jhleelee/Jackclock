package com.jackleeentertainment.jackclock.generalutil;

import android.content.Context;

import com.jackleeentertainment.jackclock.R;
import com.jackleeentertainment.jackclock.object.Post;
import com.jackleeentertainment.jackclock.object.PostT;
import com.jackleeentertainment.jackclock.ui.util.JM;

/**
 * Created by Jacklee on 2016. 9. 10..
 */
public class StringGenerator {


    public static String snoozeXMinutes(int snzMinute, Context context) {

        // get locale

        String sentence = JM.strById(R.string.snooze, context) + " " + snzMinute + " " +
                JM.strById(R.string.min, context);

        return JStringUtil.toUpperCase1stLetterOfSentenceEN(sentence);

    }

    public static String xSentMessage(String name, int msgNum, Context context) {

        // get locale

        if (msgNum == 1) {
            return name + " " + JM.strById(R.string.sent, context) + " " + JM.strById(R.string.message, context) + ".";
        } else {
            return name + " " + JM.strById(R.string.sent, context) + " " + J.st(msgNum) + " " + JM.strById(R.string.message, context) + "s.";
        }

    }


    public static String postedx(Post post) {

        // get locale

        return JM.strById(R.string.posted) + " " + postT(post) + ".";
    }


    public static String xPostedx(String name, Post post, int postNum, Context context) {

        // get locale

        if (postNum == 1) {
            return name + " " + JM.strById(R.string.posted, context) + " " + postT(post) + ".";
        } else {
            return name + " " + JM.strById(R.string.posted, context) + " " + J.st(postNum) + " " + postT(post) + "s.";
        }

    }

    public static String postT(Post post) {
        switch (post.getPosttype()) {
            case PostT.NONE:
                return JM.strById(R.string.post);

            case PostT.PHOTO:
                return JM.strById(R.string.photo);

            case PostT.VIDEO:
                return JM.strById(R.string.video);

            default:
                return null;

        }
    }


}
