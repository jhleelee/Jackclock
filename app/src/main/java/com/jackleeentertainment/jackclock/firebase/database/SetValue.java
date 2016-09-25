package com.jackleeentertainment.jackclock.firebase.database;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.jackleeentertainment.jackclock.App;
import com.jackleeentertainment.jackclock.Ram;
import com.jackleeentertainment.jackclock.generalutil.LBR;
import com.jackleeentertainment.jackclock.object.Post;
import com.jackleeentertainment.jackclock.object.Profile;

/**
 * Created by Jacklee on 2016. 9. 24..
 */

public class SetValue {

    /*
    Profile.class
    */

    public static void myProfileCls(final Profile myProfile, final boolean toRamLBR) {
        App.fbaseDbRef
                .child(FBaseNode0.ProfileToMe)
                .child(App.getUID())
                .setValue(myProfile, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                        if (databaseError == null) {
                            if (toRamLBR) {
                                Ram.myProfile = myProfile;
                                LBR.send(FBaseNode0.ProfileToMe + LBR.SendSuffixT.SENT, Ram.myProfile);
                            }
                        }
                    }
                });
    }

    public static void profileCls(final String FBaseNode0T, final Profile myProfile, final boolean
            toRamLBR) {
        App.fbaseDbRef
                .child(FBaseNode0T)
                .child(App.getUID())
                .setValue(myProfile, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                        if (databaseError == null) {
                            if (toRamLBR) {
                                Ram.myProfile = myProfile;
                                LBR.send(FBaseNode0T + LBR.SendSuffixT.SENT, Ram.myProfile);
                            }
                        }
                    }
                });
    }

    /*
    Post.class
    */

    public static void postCls(final Post post, final boolean
            toRamLBR) {
        App.fbaseDbRef
                .child(FBaseNode0.Post)
                .child(post.getOid())
                .setValue(post, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                        if (databaseError == null) {
                            if (toRamLBR) {
                                LBR.send(FBaseNode0.Post + LBR.SendSuffixT.SENT, post);
                            }
                        }
                    }
                });
    }

    public static void postClsPushId(final Post post, final boolean
            toRamLBR) {
        String pushId = SetValueUtil.getPushKey(FBaseNode0.Post);
        post.setOid(pushId);
        App.fbaseDbRef
                .child(FBaseNode0.Post)
                .child(post.getOid())
                .setValue(post, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                        if (databaseError == null) {
                            if (toRamLBR) {
                                LBR.send(FBaseNode0.Post + LBR.SendSuffixT.SENT, post);
                            }
                        }
                    }
                });
    }


}
