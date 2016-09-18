package com.jackleeentertainment.jackclock.ui.layout.fragment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.jackleeentertainment.jackclock.R;
import com.jackleeentertainment.jackclock.object.AlarmOwnerMe;
import com.jackleeentertainment.jackclock.object.Post;
import com.jackleeentertainment.jackclock.object.SndVib;
import com.jackleeentertainment.jackclock.ui.layout.viewholder.AlarmViewHolder;

import java.util.List;

/**
 * Created by Jacklee on 2016. 9. 14..
 */
public class MainFrag0 extends ListFrag {

    public MainFrag0() {
        super();
    }

    @NonNull
    public static MainFrag0 newInstance() {
        return new MainFrag0();
    }


    @Override
    void initAdapter() {
        super.initAdapter();
        firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<AlarmOwnerMe, MyAlarmHolder>(AlarmOwnerMe.class, R.layout.i_alarm_more_action, MyAlarmHolder.class, mRef) {
            @Override
            public void populateViewHolder(MyAlarmHolder myAlarmHolder, AlarmOwnerMe alarmOwnerMe, int position) {

        /*
        AlarmOwner (Profile)
         */

                myAlarmHolder.setOwnerPhoto(alarmOwnerMe.getOwner_uid());

                myAlarmHolder.setOwnerName(alarmOwnerMe.getOwner_name());

        /*
        AlarmBody
         */

                myAlarmHolder.setAlarmTitle(alarmOwnerMe.getTitle());

                myAlarmHolder.setAlarmRepeatText(alarmOwnerMe.getRtype(), alarmOwnerMe.getRweek(), alarmOwnerMe.getRdates());

                myAlarmHolder.setAlarmBackgroundMedia(alarmOwnerMe.getVideo());

                myAlarmHolder.setJoinedNumber(alarmOwnerMe.getJoined());

                myAlarmHolder.setVideoTakerTakenAt(alarmOwnerMe.getVideo());

                myAlarmHolder.setSound(alarmOwnerMe.getSound());

                myAlarmHolder.setVibe(alarmOwnerMe.getVibe());

                myAlarmHolder.setTag(alarmOwnerMe.getTags());

                myAlarmHolder.setDetail(alarmOwnerMe.getDetail());
        /*
        MyAlarmStatus
         */

                myAlarmHolder.setMyClock(alarmOwnerMe.getMy_when());

                myAlarmHolder.setMyPower(alarmOwnerMe.getMy_power_on());

                myAlarmHolder.setMySoundVibe(alarmOwnerMe.getMy_sound_on(), alarmOwnerMe.getMy_vibe_on());

            }
        };

        recyclerView.setAdapter(firebaseRecyclerAdapter);

    }

    public static class MyAlarmHolder extends AlarmViewHolder{

        public MyAlarmHolder(View itemView) {
            super(itemView);
            //all the same, so nothing to modify
        }

    }


}
