package com.jackleeentertainment.jackclock.ui.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.jackleeentertainment.jackclock.App;
import com.jackleeentertainment.jackclock.firebase.storage.FStorageNode;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;


public class JM {
    static boolean VERBOSE = false;





    public static int getDeviceDpi(){
        DisplayMetrics metrics = App.getContext().getResources().getDisplayMetrics();
        return  metrics.densityDpi;
    }

    public static String getFbaseStorageSecondNodeWithDeviceDpi(){

        switch (getDeviceDpi()){
            case DisplayMetrics.DENSITY_LOW :
                return FStorageNode.FileNameResolution.R075;

            case DisplayMetrics.DENSITY_DEFAULT :
                return FStorageNode.FileNameResolution.R100;

            case DisplayMetrics.DENSITY_HIGH :
            case DisplayMetrics.DENSITY_280 :

                return FStorageNode.FileNameResolution.R150;

            case DisplayMetrics.DENSITY_XHIGH :
            case DisplayMetrics.DENSITY_360 :
            case DisplayMetrics.DENSITY_400 :
            case DisplayMetrics.DENSITY_420 :

                return FStorageNode.FileNameResolution.R200;

            case DisplayMetrics.DENSITY_XXHIGH :
            case DisplayMetrics.DENSITY_560 :

                return FStorageNode.FileNameResolution.R300;

            case DisplayMetrics.DENSITY_XXXHIGH :
                return FStorageNode.FileNameResolution.R300;

            default:
                return null;
        }
    }

    /********************************
     * Getting Resources
     ********************************/

    public static String strById(int intId) {
        return App.getContext().getResources().getString(intId);
    }

    public static String strById(int intId, Context context) {
        return context.getResources().getString(intId);
    }


    public static int colorById(int intId) {
        return ContextCompat.getColor(App.getContext(), intId);
    }

    public static int colorById(int intId, Context context) {
        return ContextCompat.getColor(context, intId);
    }

    public static Drawable drawableById(int intId, Context context) {
        return ContextCompat.getDrawable(context, intId);
    }


    /********************************
     * Applying Resources
     ********************************/

    public static void BGC(View view, int intId) {

        view.setBackgroundColor(
                ContextCompat.getColor(App.getContext(), intId)
        );

    }


    public static void BGD(View view, int intId) {

        view.setBackgroundDrawable(
                null
        );

        view.setBackgroundDrawable(
                ContextCompat.getDrawable(App.getContext(), intId)
        );

    }


    public static void ID(ImageView iv, int intId) {

        iv.setImageDrawable(
                null
        );

        iv.setImageDrawable(
                ContextCompat.getDrawable(App.getContext(), intId)
        );

    }

    public static void ID(ImageView iv, int intIdtrue, int intIdfalse, boolean bool) {

        iv.setImageDrawable(
                null
        );
        if (bool) {
            ID(iv, intIdtrue);
        } else {
            ID(iv, intIdfalse);
        }
    }


    public static void BGD(ImageView iv, int intId) {

        iv.setBackground(
                null
        );

        iv.setBackground(
                ContextCompat.getDrawable(App.getContext(), intId)
        );
    }


    public static void BGD(ImageView iv, int intIdtrue, int intIdfalse, boolean bool) {

        iv.setImageDrawable(
                null
        );
        if (bool) {
            BGD(iv, intIdtrue);
        } else {
            BGD(iv, intIdfalse);
        }
    }


    public static void TC(TextView view, int intId) {

        view.setTextColor(
                ContextCompat.getColor(App.getContext(), intId)
        );

    }

    public static void TT(TextView tv, int intId) {

        tv.setText(
                App.getContext().getResources().getString(intId)
        );

    }


    /********************************
     * data manipulation
     ********************************/

    public static ByteArrayInputStream getByteArrayInputStreamFromBitmap(Bitmap bitmap) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 0 /*ignored for PNG*/, bos);
        byte[] barBitmap = bos.toByteArray();
        return new ByteArrayInputStream(barBitmap);
    }


    /********************************
     * visibility
     ********************************/

    public static void visibleOrGone(View v, boolean b) {
        if (b) {
            JM.V(v);
        } else {
            JM.G(v);
        }
    }

    public static void V(@NonNull View view) {
        view.setVisibility(View.VISIBLE);
    }

    public static void IV(@NonNull View view) {
        view.setVisibility(View.INVISIBLE);
    }

    public static void G(@NonNull View view) {
        view.setVisibility(View.GONE);
    }


    /********************************
     * tint
     ********************************/


    public static void tint(ImageView iv, int intId) {
        iv.setColorFilter(ContextCompat.getColor(
                App.getContext(), intId),
                android.graphics.PorterDuff.Mode.MULTIPLY);
    }


    public static void tint(ImageView iv, int intId, Context context) {
        iv.setColorFilter(ContextCompat.getColor(
                context, intId),
                android.graphics.PorterDuff.Mode.MULTIPLY);
    }


    public static void tint(ImageView iv, int intTrueColor, int intFalseColor, boolean bool, Context context) {
        if (bool) {
            iv.setColorFilter(ContextCompat.getColor(context, intTrueColor), android.graphics.PorterDuff.Mode.MULTIPLY);
        } else {
            iv.setColorFilter(ContextCompat.getColor(context, intFalseColor), android.graphics.PorterDuff.Mode.MULTIPLY);
        }
    }

}
