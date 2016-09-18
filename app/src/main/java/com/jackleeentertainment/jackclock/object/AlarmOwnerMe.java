package com.jackleeentertainment.jackclock.object;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Jacklee on 2016. 9. 11..
 */
public class AlarmOwnerMe {

    //Basic
    String aid;
    String title;
    String detail;



    List<String> tags;
    int rtype;
    String rweek;
    List<String> rdates;

    //Sound (Lock) + Vibe (Lock)+ Video(Lock)
    SndVib sound;
    SndVib vibe;
    Post video;
    AlarmAttrLock soundlock;
    AlarmAttrLock vibelock;
    AlarmAttrLock videolock;

    //Owner - to be searched (so, cannot use AlarmMember.java)
    String owner_uid;
    String owner_name;
    List<String> owner_times;
    long owner_when;
    int owner_sound_on;
    int owner_vibe_on;
    int owner_power_on;

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


    //joinedNum
    int joined;


    public AlarmOwnerMe() {
        super();
    }

    public int getMy_power_on() {
        return my_power_on;
    }

    public void setMy_power_on(int my_power_on) {
        this.my_power_on = my_power_on;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getRtype() {
        return rtype;
    }

    public void setRtype(int rtype) {
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

    public String getOwner_uid() {
        return owner_uid;
    }

    public void setOwner_uid(String owner_uid) {
        this.owner_uid = owner_uid;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
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

    public int getOwner_sound_on() {
        return owner_sound_on;
    }

    public void setOwner_sound_on(int owner_sound_on) {
        this.owner_sound_on = owner_sound_on;
    }

    public int getOwner_vibe_on() {
        return owner_vibe_on;
    }

    public void setOwner_vibe_on(int owner_vibe_on) {
        this.owner_vibe_on = owner_vibe_on;
    }

    public int getOwner_power_on() {
        return owner_power_on;
    }

    public void setOwner_power_on(int owner_power_on) {
        this.owner_power_on = owner_power_on;
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

    public AlarmNotification getAlarmNotification() {
        return alarmNotification;
    }

    public void setAlarmNotification(AlarmNotification alarmNotification) {
        this.alarmNotification = alarmNotification;
    }
    public int getJoined() {
        return joined;
    }

    public void setJoined(int joined) {
        this.joined = joined;
    }

}
