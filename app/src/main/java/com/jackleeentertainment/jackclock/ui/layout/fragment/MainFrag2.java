package com.jackleeentertainment.jackclock.ui.layout.fragment;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.jackleeentertainment.jackclock.App;
import com.jackleeentertainment.jackclock.R;
import com.jackleeentertainment.jackclock.Ram;
import com.jackleeentertainment.jackclock.object.Post;
import com.jackleeentertainment.jackclock.ui.layout.viewholder.AlarmViewHolder;
import com.jackleeentertainment.jackclock.ui.util.JM;
import com.jackleeentertainment.jackclock.ui.widget.EndlessRecyclerViewScrollListener;
import com.jackleeentertainment.jackclock.ui.widget.FeedRVAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jacklee on 2016. 9. 14..
 */
public class MainFrag2 extends ListFrag {
    String TAG = this.getClass().getSimpleName();
    View view;

    int dxArlPostsToUpdate = 0;

    public MainFrag2() {
        super();
    }

    @NonNull
    public static MainFrag2 newInstance() {
        return new MainFrag2();
    }


    @Override
    void initUI() {
        super.initUI();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(App.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        // Add the scroll listener
        recyclerView.addOnScrollListener(new EndlessRecyclerViewScrollListener(linearLayoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount) {
                // Triggered only when new data needs to be appended to the list
                // Add whatever code is needed to append new items to the bottom of the list
                get100ObjIdOfFeedsFromFirebase(page);
            }
        });
    }


    @Override
    void initAdapter() {

        FeedRVAdapter feedRVAdapter = new FeedRVAdapter();
        recyclerView.setAdapter(feedRVAdapter);

    }

    private void get100ObjIdOfFeedsFromFirebase(int lastLoadedObjIdDx) {

        Query query = App.fbaseDbRef
                .child("m_fd")
                .child(App.getUID())
                .startAt(lastLoadedObjIdDx + 1)
                .endAt(lastLoadedObjIdDx + 1 + 100);
        query.addListenerForSingleValueEvent(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Iterable<DataSnapshot> i = dataSnapshot.getChildren();
                int fidcount = 0;
                int intTotalMemberNum = (int) dataSnapshot.getChildrenCount();

                for (DataSnapshot d : i) {
                    String keyPostOId = d.getKey();
                    long valuePostLastUpdatedTs = d.getValue(Long.class);
                    Ram.addKeyPostOIdValueLastTs(keyPostOId,valuePostLastUpdatedTs);
                }

                Ram.sortArlPostsByTs();
                getContentsOfFirstEmpty20OfRAMArlPosts();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }



    void getContentsOfFirstEmpty20OfRAMArlPosts(){

        //specify first empty up to 20 items
        ArrayList<Integer> arlDx = new ArrayList<>();
        for (int i = 0 ; i < Ram.arlPosts.size() ; i++){
            if (Ram.arlPosts.get(i).getPosttype()==null){
                arlDx.add(i);
            }
        }

        for (dxArlPostsToUpdate = 0 ; dxArlPostsToUpdate < arlDx.size() ; dxArlPostsToUpdate++){

            App.fbaseDbRef
                    .child("fd")
                    .child(Ram.arlPosts.get(arlDx.get(dxArlPostsToUpdate)).getOid())
                    .addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            String key = dataSnapshot.getKey();
                            Post post = dataSnapshot.getValue(Post.class);
                            post.setOid(key);
                            Ram.arlPosts.set(dxArlPostsToUpdate, post);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
        }
    }





    public static class PublicAlarmViewHolder extends AlarmViewHolder {


        public PublicAlarmViewHolder(View itemView) {
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
