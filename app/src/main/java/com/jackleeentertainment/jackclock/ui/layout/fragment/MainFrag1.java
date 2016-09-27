package com.jackleeentertainment.jackclock.ui.layout.fragment;

import android.app.Application;
import android.support.annotation.NonNull;
import android.view.View;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.jackleeentertainment.jackclock.App;
import com.jackleeentertainment.jackclock.R;
import com.jackleeentertainment.jackclock.object.AlarmOwner;
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
        firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<AlarmOwner, PublicJackViewHolder>
                (AlarmOwner.class, R.layout.i_alarm_more_action, PublicJackViewHolder.class,
                        App.fbaseDbRef
                                .child("jack")
                ) {
            @Override
            public void populateViewHolder(PublicJackViewHolder myJackViewHolder, AlarmOwner alarmOwner, int position) {

        /*
        AlarmOwner (Profile)
         */

                myJackViewHolder.setOwnerPhoto(alarmOwner.getOwner_uid());

                myJackViewHolder.setOwnerName(alarmOwner.getOwner_name());

        /*
        AlarmBody
         */

                myJackViewHolder.setAlarmTitle(alarmOwner.getTitle());

                myJackViewHolder.setAlarmRepeatText(alarmOwner.getRtype(), alarmOwner.getRweek(), alarmOwner.getRdates());

                myJackViewHolder.setAlarmBackgroundMedia(alarmOwner.getVideo());

                myJackViewHolder.setJoinedNumber((int) alarmOwner.getJoined());

                myJackViewHolder.setVideoTakerTakenAt(alarmOwner.getVideo());

                myJackViewHolder.setSound(alarmOwner.getSound());

                myJackViewHolder.setVibe(alarmOwner.getVibe());

                myJackViewHolder.setTag(alarmOwner.getTags());

                myJackViewHolder.setDetail(alarmOwner.getDetail());

        /*
        AlarmBody - PublicAlarmize
         */

                myJackViewHolder.publicAlarmize_General();

                myJackViewHolder.publicAlarmize_AlarmOwnerRecentPost(alarmOwner.getOwner_mostrecentpost());
            }
        };

        recyclerView.setAdapter(firebaseRecyclerAdapter);

    }


    public static class PublicJackViewHolder extends AlarmViewHolder {


        public PublicJackViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void setAlarmRepeatText(String Rtype, String Rweek, List<String> Rdate) {
        }

        public void publicAlarmize_General() {
            getRo_alarm_clock().setVisibility(View.GONE);
            getIbPower().setVisibility(View.GONE);
            getV_scrim_solid().setVisibility(View.GONE);
            getBtDecline__lo_alarm_action().setVisibility(View.GONE);
            getBtAccept__lo_alarm_action().setText(JM.strById(R.string.deploy, App.getContext()));
        }

        public void publicAlarmize_AlarmOwnerRecentPost(Post alarmOwnerRecentPost) {

        }


    }
}
