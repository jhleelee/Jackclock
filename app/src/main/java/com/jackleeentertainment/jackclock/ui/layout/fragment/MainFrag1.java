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

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.jackleeentertainment.jackclock.R;
import com.jackleeentertainment.jackclock.object.AlarmOwner;
import com.jackleeentertainment.jackclock.object.AlarmOwnerMe;
import com.jackleeentertainment.jackclock.object.Post;
import com.jackleeentertainment.jackclock.ui.layout.viewholder.AlarmViewHolder;
import com.jackleeentertainment.jackclock.ui.util.JM;

import java.util.List;

/**
 * Created by Jacklee on 2016. 9. 14..
 */
public class MainFrag1 extends ListFrag {


    public MainFrag1() {
        super();
    }

    @NonNull
    public static MainFrag1 newInstance() {
        return new MainFrag1();
    }


    @Override
    void initAdapter() {
        super.initAdapter();
        firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<AlarmOwner, PublicAlarmViewHolder>(AlarmOwner.class, R.layout.i_alarm_more_action, PublicAlarmViewHolder.class, mRef) {
            @Override
            public void populateViewHolder(PublicAlarmViewHolder myAlarmHolder, AlarmOwner alarmOwner, int position) {

        /*
        AlarmOwner (Profile)
         */

                myAlarmHolder.setOwnerPhoto(alarmOwner.getOwner_uid());

                myAlarmHolder.setOwnerName(alarmOwner.getOwner_name());

        /*
        AlarmBody
         */

                myAlarmHolder.setAlarmTitle(alarmOwner.getTitle());

                myAlarmHolder.setAlarmRepeatText(alarmOwner.getRtype(), alarmOwner.getRweek(), alarmOwner.getRdates());

                myAlarmHolder.setAlarmBackgroundMedia(alarmOwner.getVideo());

                myAlarmHolder.setJoinedNumber(alarmOwner.getJoined());

                myAlarmHolder.setVideoTakerTakenAt(alarmOwner.getVideo());

                myAlarmHolder.setSound(alarmOwner.getSound());

                myAlarmHolder.setVibe(alarmOwner.getVibe());

                myAlarmHolder.setTag(alarmOwner.getTags());

                myAlarmHolder.setDetail(alarmOwner.getDetail());

        /*
        AlarmBody - PublicAlarmize
         */

                myAlarmHolder.publicAlarmize_General();

                myAlarmHolder.publicAlarmize_AlarmOwnerRecentPost(alarmOwner.getOwner_mostrecentpost());
            }
        };

        recyclerView.setAdapter(firebaseRecyclerAdapter);

    }


    public static class PublicAlarmViewHolder extends AlarmViewHolder {



        public PublicAlarmViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void setAlarmRepeatText(int Rtype, String Rweek, List<String> Rdate) {
        }

        public void publicAlarmize_General() {
            getRo_alarm_clock().setVisibility(View.GONE);
            getIbPower().setVisibility(View.GONE);
            getV_scrim_solid().setVisibility(View.GONE);
            getBtDecline__lo_alarm_action().setVisibility(View.GONE);
            getBtAccept__lo_alarm_action().setText(JM.strById(R.string.deploy, App.getContext));
        }

        public void publicAlarmize_AlarmOwnerRecentPost(Post alarmOwnerRecentPost) {

        }


    }
}
