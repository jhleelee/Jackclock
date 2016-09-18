package com.jackleeentertainment.jackclock.ui.util;

import android.content.Context;

import com.jackleeentertainment.jackclock.R;

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


}
