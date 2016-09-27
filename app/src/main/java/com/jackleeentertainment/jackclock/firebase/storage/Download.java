package com.jackleeentertainment.jackclock.firebase.storage;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.StorageReference;
import com.jackleeentertainment.jackclock.App;

/**
 * Created by Jacklee on 2016. 9. 24..
 */

public class Download {

//    public static void toImageViewOfListItem(
//            StorageReference storageReference,
//            String filenameAndExt,
//           final Fragment fragment, //jack : activity , context also
//            final ImageView tgtIv)
//    {
//        storageReference.getDownloadUrl()
//                .addOnSuccessListener(
//                        new OnSuccessListener<Uri>() {
//                            @Override
//                            public void onSuccess(Uri uri) {
//
//                                Glide
//                                        .with(fragment)
//                                        .load(uri) //no URL due to performance problem
//                                        .centerCrop()
//                                        // Sets an Drawable to display
//                                        // while a resource is loading.
//                                        .placeholder()
//                                        .fallback()
//                                        .error()
//                                        .crossFade()
//                                        .into(tgtIv);
//                            }
//                        }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception exception) {
//                // Handle any errors
//            }
//        });
//    }


}
