package com.jackleeentertainment.jackclock.ui.util;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Vibrator;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.CursorLoader;
import android.widget.ImageView;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class JM {
    static boolean VERBOSE = false;

    public static String strById(int intId, Context context) {
        return context.getResources().getString(intId);
    }
    public static int colorById(int intId, Context context) {
        return ContextCompat.getColor(context, intId);
    }
    public static Drawable drawableById(int intId, Context context) {
        return ContextCompat.getDrawable(context, intId);
    }

    /*tint*/
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
