package com.jackleeentertainment.jackclock.object;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Jacklee on 2016. 9. 11..
 */
public class AlarmOwnerMe extends AlarmOwner{

    //My - to be searched (so, cannot use AlarmMember.java)
    String my_uid;

    String my_name;
    List<String> my_times;
    long my_when;
    int my_sound_on;
    int my_vibe_on;
    int my_power_on;

    //MyNotiSetting
    AlarmNotification alarmNotification;


    public AlarmOwnerMe() {
        super();
    }


    public String getMy_uid() {
        return my_uid;
    }

    public void setMy_uid(String my_uid) {
        this.my_uid = my_uid;
    }

    public String getMy_name() {
        return my_name;
    }

    public void setMy_name(String my_name) {
        this.my_name = my_name;
    }

    public List<String> getMy_times() {
        return my_times;
    }

    public void setMy_times(List<String> my_times) {
        this.my_times = my_times;
    }

    public long getMy_when() {
        return my_when;
    }

    public void setMy_when(long my_when) {
        this.my_when = my_when;
    }

    public int getMy_sound_on() {
        return my_sound_on;
    }

    public void setMy_sound_on(int my_sound_on) {
        this.my_sound_on = my_sound_on;
    }

    public int getMy_vibe_on() {
        return my_vibe_on;
    }

    public void setMy_vibe_on(int my_vibe_on) {
        this.my_vibe_on = my_vibe_on;
    }

    public int getMy_power_on() {
        return my_power_on;
    }

    public void setMy_power_on(int my_power_on) {
        this.my_power_on = my_power_on;
    }

    public AlarmNotification getAlarmNotification() {
        return alarmNotification;
    }

    public void setAlarmNotification(AlarmNotification alarmNotification) {
        this.alarmNotification = alarmNotification;
    }


}
