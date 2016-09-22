package com.jackleeentertainment.jackclock.object;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Jacklee on 2016. 9. 11..
 */
public class AlarmMember {

    String profile_uid;
    String profile_name;
    List<String> alarm_times;
    boolean alarm_isownertimes;
    long alarm_when;
    boolean alarm_sound_on;
    boolean alarm_vibe_on;
    boolean alarm_power_on;


    public AlarmMember() {
        super();
    }

    public String getProfile_uid() {
        return profile_uid;
    }

    public void setProfile_uid(String profile_uid) {
        this.profile_uid = profile_uid;
    }

    public String getProfile_name() {
        return profile_name;
    }

    public void setProfile_name(String profile_name) {
        this.profile_name = profile_name;
    }

    public List<String> getAlarm_times() {
        return alarm_times;
    }

    public void setAlarm_times(List<String> alarm_times) {
        this.alarm_times = alarm_times;
    }

    public boolean getAlarm_isownertimes() {
        return alarm_isownertimes;
    }

    public void setAlarm_isownertimes(boolean alarm_isownertimes) {
        this.alarm_isownertimes = alarm_isownertimes;
    }

    public long getAlarm_when() {
        return alarm_when;
    }

    public void setAlarm_when(long alarm_when) {
        this.alarm_when = alarm_when;
    }

    public boolean getAlarm_sound_on() {
        return alarm_sound_on;
    }

    public void setAlarm_sound_on(boolean alarm_sound_on) {
        this.alarm_sound_on = alarm_sound_on;
    }

    public boolean getAlarm_vibe_on() {
        return alarm_vibe_on;
    }

    public void setAlarm_vibe_on(boolean alarm_vibe_on) {
        this.alarm_vibe_on = alarm_vibe_on;
    }

    public boolean getAlarm_power_on() {
        return alarm_power_on;
    }

    public void setAlarm_power_on(boolean alarm_power_on) {
        this.alarm_power_on = alarm_power_on;
    }
}
