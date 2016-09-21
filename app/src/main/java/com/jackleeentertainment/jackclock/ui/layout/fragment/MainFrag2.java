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
import com.jackleeentertainment.jackclock.App;
import com.jackleeentertainment.jackclock.R;
import com.jackleeentertainment.jackclock.object.AlarmOwner;
import com.jackleeentertainment.jackclock.object.Post;
import com.jackleeentertainment.jackclock.ui.layout.viewholder.AlarmViewHolder;
import com.jackleeentertainment.jackclock.ui.layout.viewholder.PostViewHolder;
import com.jackleeentertainment.jackclock.ui.util.JM;

import java.util.List;

/**
 * Created by Jacklee on 2016. 9. 14..
 */
public class MainFrag2 extends ListFrag {
    String TAG = this.getClass().getSimpleName();
    View view;

    public MainFrag2() {
        super();
    }

    @NonNull
    public static MainFrag2 newInstance() {
        return new MainFrag2();
    }

    @Override
    void initAdapter() {
        super.initAdapter();
        firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Post, PostViewHolder>
                (Post.class, R.layout.i_feed, PostViewHolder.class, null) {
            @Override
            public void populateViewHolder(PostViewHolder postViewHolder,
                                           Post post, int position) {

                    /*
        Poster (Profile)
         */
                postViewHolder.setPosterPhoto(post.getUid());

       /*
        Poster (Profile) & PostBody
         */
                postViewHolder.setPosterNameAndDeed(post.getName(), post.getPosttype());

         /*
        PostBody
         */

                postViewHolder.setPostBackgroundMedia(post);

                postViewHolder.setPostSupportingText(post.getTxt());

                postViewHolder.setLikeNum(0);

                postViewHolder.setCommentNum(0);

                postViewHolder.setFavorite();

         /*
        PostBody re Alarm
         */

                postViewHolder.setAlarmTitleAndContent(post);


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
            getBtAccept__lo_alarm_action().setText(JM.strById(R.string.deploy, App.getContext()));
        }

        public void publicAlarmize_AlarmOwnerRecentPost(Post alarmOwnerRecentPost) {

        }


    }
}
