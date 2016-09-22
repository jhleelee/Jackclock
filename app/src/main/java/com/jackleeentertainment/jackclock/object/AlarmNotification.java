package com.jackleeentertainment.jackclock.object;

/**
 * Created by Jacklee on 2016. 9. 11..
 */
public class AlarmNotification {

    boolean noti_set ;
    boolean noti_ring;
    boolean noti_chat;

    public AlarmNotification() {
        super();
    }

    public boolean getNoti_set() {
        return noti_set;
    }

    public void setNoti_set(boolean noti_set) {
        this.noti_set = noti_set;
    }

    public boolean getNoti_ring() {
        return noti_ring;
    }

    public void setNoti_ring(boolean noti_ring) {
        this.noti_ring = noti_ring;
    }

    public boolean getNoti_chat() {
        return noti_chat;
    }

    public void setNoti_chat(boolean noti_chat) {
        this.noti_chat = noti_chat;
    }


}
