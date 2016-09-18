package com.jackleeentertainment.jackclock.ui.layout.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.jackleeentertainment.jackclock.R;

/**
 * Created by Jacklee on 2016. 9. 14..
 */
public class MainFrag3 extends ListFrag {
    String TAG = this.getClass().getSimpleName();
    View view;


    public MainFrag3() {
        super();
    }

    @NonNull
    public static MainFrag3 newInstance() {
        return new MainFrag3();
    }



}
