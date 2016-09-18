package com.jackleeentertainment.jackclock.object;

/**
 * Created by Jacklee on 2016. 9. 11..
 */
public class AlarmNotification {

    int noti_set ;
    int noti_ring;
    int noti_chat;

    public AlarmNotification() {
        super();
    }

    public int getNoti_set() {
        return noti_set;
    }

    public void setNoti_set(int noti_set) {
        this.noti_set = noti_set;
    }

    public int getNoti_ring() {
        return noti_ring;
    }

    public void setNoti_ring(int noti_ring) {
        this.noti_ring = noti_ring;
    }

    public int getNoti_chat() {
        return noti_chat;
    }

    public void setNoti_chat(int noti_chat) {
        this.noti_chat = noti_chat;
    }


}
