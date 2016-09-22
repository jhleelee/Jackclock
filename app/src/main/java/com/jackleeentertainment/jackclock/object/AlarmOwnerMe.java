package com.jackleeentertainment.jackclock.object;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Jacklee on 2016. 9. 11..
 */
public class AlarmOwnerMe extends JackOwnerMe{



    /*
        Alarm fields
        */
    String rtype;
    String rweek;
    List<String> rdates;

    //Sound (Lock) + Vibe (Lock)+ Video(Lock)
    SndVib sound;
    SndVib vibe;
    Post video;
    AlarmAttrLock soundlock;
    AlarmAttrLock vibelock;
    AlarmAttrLock videolock;

    /*
    Owner fields
    */
    //Owner - to be searched (so, cannot use AlarmMember.java)
    List<String> owner_times;
    long owner_when;
    boolean owner_sound_on;
    boolean owner_vibe_on;
    boolean owner_power_on;


    /*
    Me fields
    */

    //My - to be searched (so, cannot use AlarmMember.java)

    List<String> my_times;
    long my_when;
   boolean my_sound_on;
    boolean my_vibe_on;
    boolean my_power_on;

    //MyNotiSetting
    AlarmNotification alarmNotification;


    public AlarmOwnerMe() {
        super();
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

    public boolean getMy_sound_on() {
        return my_sound_on;
    }

    public void setMy_sound_on(boolean my_sound_on) {
        this.my_sound_on = my_sound_on;
    }

    public boolean getMy_vibe_on() {
        return my_vibe_on;
    }

    public void setMy_vibe_on(boolean my_vibe_on) {
        this.my_vibe_on = my_vibe_on;
    }

    public boolean getMy_power_on() {
        return my_power_on;
    }

    public void setMy_power_on(boolean my_power_on) {
        this.my_power_on = my_power_on;
    }

    public AlarmNotification getAlarmNotification() {
        return alarmNotification;
    }

    public void setAlarmNotification(AlarmNotification alarmNotification) {
        this.alarmNotification = alarmNotification;
    }


    public boolean getOwner_power_on() {
        return owner_power_on;
    }

    public void setOwner_power_on(boolean owner_power_on) {
        this.owner_power_on = owner_power_on;
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    public String getRweek() {
        return rweek;
    }

    public void setRweek(String rweek) {
        this.rweek = rweek;
    }

    public List<String> getRdates() {
        return rdates;
    }

    public void setRdates(List<String> rdates) {
        this.rdates = rdates;
    }

    public SndVib getSound() {
        return sound;
    }

    public void setSound(SndVib sound) {
        this.sound = sound;
    }

    public SndVib getVibe() {
        return vibe;
    }

    public void setVibe(SndVib vibe) {
        this.vibe = vibe;
    }

    public Post getVideo() {
        return video;
    }

    public void setVideo(Post video) {
        this.video = video;
    }

    public AlarmAttrLock getSoundlock() {
        return soundlock;
    }

    public void setSoundlock(AlarmAttrLock soundlock) {
        this.soundlock = soundlock;
    }

    public AlarmAttrLock getVibelock() {
        return vibelock;
    }

    public void setVibelock(AlarmAttrLock vibelock) {
        this.vibelock = vibelock;
    }

    public AlarmAttrLock getVideolock() {
        return videolock;
    }

    public void setVideolock(AlarmAttrLock videolock) {
        this.videolock = videolock;
    }

    public List<String> getOwner_times() {
        return owner_times;
    }

    public void setOwner_times(List<String> owner_times) {
        this.owner_times = owner_times;
    }

    public long getOwner_when() {
        return owner_when;
    }

    public void setOwner_when(long owner_when) {
        this.owner_when = owner_when;
    }

    public boolean getOwner_sound_on() {
        return owner_sound_on;
    }

    public void setOwner_sound_on(boolean owner_sound_on) {
        this.owner_sound_on = owner_sound_on;
    }

    public boolean getOwner_vibe_on() {
        return owner_vibe_on;
    }

    public void setOwner_vibe_on(boolean owner_vibe_on) {
        this.owner_vibe_on = owner_vibe_on;
    }
}
