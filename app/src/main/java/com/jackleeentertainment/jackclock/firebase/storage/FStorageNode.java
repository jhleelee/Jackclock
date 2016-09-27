package com.jackleeentertainment.jackclock.firebase.storage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;

import com.jackleeentertainment.jackclock.App;
import com.jackleeentertainment.jackclock.generalutil.J;

import hugo.weaving.DebugLog;

/**
 * Created by Jacklee on 2016. 9. 25..
 */

public class FStorageNode {

    public static class Prefix {
        public final static String LISTVIEWITEM = "l__";
        public final static String THUMBNAIL = "t__";
        public final static String EMPTY = "";
    }


    public static class First {
        public final static String PROFILE_PHOTO = "profile_photo";
        public final static String PROFILE_PHOTO_THUMB = "profile_photo_thumb";

        public final static String PROFILE_VIDEO = "profile_video";
        public final static String PROFILE_VIDEO_THUMB = "profile_video_thumb";

        public final static String POST_PHOTO = "post_photo";
        public final static String POST_PHOTO_THUMB = "post_photo_thumb";

        public final static String POST_VIDEO = "post_video";
        public final static String POST_VIDEO_THUMB = "post_video_thumb";

        public final static String SOUND_PHOTO = "sound_photo";
        public final static String SOUND_PHOTO_THUMB = "sound_video_thumb";

        public final static String SOUND_VIDEO = "sound_video";
        public final static String SOUND_VIDEO_THUMB = "sound_video_thumb";

        public final static String SOUND_MP3 = "sound_mp3";

        public final static String VIBE_PHOTO = "vibe_photo";
        public final static String VIBE_PHOTO_THUMB = "vibe_photo_thumb";
        public final static String VIBE_VIDEO = "vibe_video";
        public final static String VIBE_VIDEO_THUMB = "vibe_video_thumb";

        public final static String CHATATTACH_PHOTO = "chatatch_photo";
        public final static String CHATATTACH_PHOTO_THUMB = "chatatch_photo_thumb";
        public final static String CHATATTACH_VIDEO = "chatatch_video";
        public final static String CHATATTACH_VIDEO_THUMB = "chatatch_video_thumb";
    }

    public static class Suffix_PROFILE_PHOTO_THUMB {
        public final static String EMPTY = "";
        public final static String px36 = "__px036";
        public final static String px48 = "__px048";
        public final static String px72 = "__px072";
        public final static String px96 = "__px096";
        public final static String px144 = "__px144";
    }


    public static class FileNameResolution {
        public final static String R075 = "__075";
        public final static String R100 = "__100";
        public final static String R150 = "__150";
        public final static String R200 = "__200";
        public final static String R300 = "__300";
    }

    @DebugLog
    public static String createFileNameToUpload(Uri fileUri, Context context) {
        String dotExtention = fileUri.toString().substring(fileUri.toString().lastIndexOf("."));
        String filename = App.getUID() + "_" + J.st(System.currentTimeMillis()) + dotExtention;
        return filename;
    }


    @DebugLog
    public static String createFileName(String prefix,
                                        String firstPart,
                                        String secondPart,
                                        String suffix
    ) {


        if (firstPart.equals(First.PROFILE_PHOTO) ||
                firstPart.equals(First.POST_PHOTO) ||
                firstPart.equals(First.SOUND_PHOTO) ||
                firstPart.equals(First.VIBE_PHOTO) ||
                firstPart.equals(First.CHATATTACH_PHOTO)
                ) {
            return Prefix.EMPTY //no prefix
                    + firstPart + "__" //firstNode
                    + secondPart + //uid or oid
                    ".jpg";
        } else if (firstPart.equals(First.PROFILE_VIDEO) ||
                firstPart.equals(First.POST_VIDEO) ||
                firstPart.equals(First.SOUND_VIDEO) ||
                firstPart.equals(First.VIBE_VIDEO) ||
                firstPart.equals(First.CHATATTACH_VIDEO)
                ) {
            return Prefix.EMPTY //no prefix
                    + firstPart + "__" //firstNode
                    + secondPart +  //uid
                    ".mp4";
        } else if (firstPart.equals(First.PROFILE_PHOTO_THUMB) ||
                firstPart.equals(First.PROFILE_VIDEO_THUMB) ||
                firstPart.equals(First.POST_PHOTO_THUMB) ||
                firstPart.equals(First.POST_VIDEO_THUMB) ||
                firstPart.equals(First.SOUND_PHOTO_THUMB) ||
                firstPart.equals(First.SOUND_VIDEO_THUMB) ||
                firstPart.equals(First.VIBE_PHOTO_THUMB) ||
                firstPart.equals(First.VIBE_VIDEO_THUMB) ||
                firstPart.equals(First.CHATATTACH_PHOTO_THUMB) ||
                firstPart.equals(First.CHATATTACH_VIDEO_THUMB)
                ) {

            return Prefix.THUMBNAIL //prefix
                    + firstPart + "__" //firstNode
                    + secondPart + "__"  //uid
                    + suffix + //px
                    ".jpg";
        }


        return null;
    }


    @DebugLog
    public static String createPostFileName(String prefix,
                                            String firstPart,
                                            String secondPart,
                                            long timeStamp,
                                            String suffix
    ) {


        if (firstPart.equals(First.POST_PHOTO)) {
            return Prefix.EMPTY // no prefix
                    + firstPart + "__" //firstNode
                    + secondPart + "__"  //uid
                    + J.st(timeStamp) //ts
                    + ".jpg";
        } else if (firstPart.equals(First.POST_PHOTO)) {
            return Prefix.EMPTY // no prefix
                    + firstPart + "__" //firstNode
                    + secondPart + "__"  //uid
                    + J.st(timeStamp) //ts
                    + ".jpg";
        }

        return null;
    }


    @DebugLog
    public static String getFileName(String fileNameAndExtention) {
        int pos = fileNameAndExtention.lastIndexOf(".");
        if (pos > 0) {
            return fileNameAndExtention.substring(0, pos);
        }
        return null;
    }

    @DebugLog
    public static String getFileExtention(String fileNameAndExtention) {
        String filenameArray[] = fileNameAndExtention.split("\\.");
        return filenameArray[filenameArray.length - 1];
    }

}
