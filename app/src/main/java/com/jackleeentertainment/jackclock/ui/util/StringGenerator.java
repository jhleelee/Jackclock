package com.jackleeentertainment.jackclock.ui.util;

import android.content.Context;

import com.jackleeentertainment.jackclock.R;
import com.jackleeentertainment.jackclock.generalutil.J;

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

        if (msgNum==1){
            return name + " " + JM.strById(R.string.sent, context) +" " + JM.strById(R.string.message, context);
        } else {
            return name + " " + JM.strById(R.string.sent, context) +" " + J.st(msgNum) + " " + JM.strById(R.string.message, context);
        }

    }

}
