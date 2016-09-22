package com.jackleeentertainment.jackclock.object;

import java.util.List;

/**
 * Created by Jacklee on 2016. 9. 21..
 */

public class Alarm extends  Jack{

    double rtype;
    String rweek;
    List<String> rdates;

    //Sound (Lock) + Vibe (Lock)+ Video(Lock)
    SndVib sound;
    SndVib vibe;
    Post video;
    AlarmAttrLock soundlock;
    AlarmAttrLock vibelock;
    AlarmAttrLock videolock;

    //joinedNum
    double joined;

    public Alarm() {
        super();
    }

    public double getRtype() {
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



}
