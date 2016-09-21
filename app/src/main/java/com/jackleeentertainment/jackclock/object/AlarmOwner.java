package com.jackleeentertainment.jackclock.object;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Jacklee on 2016. 9. 11..
 */
public class AlarmOwner extends Alarm{



    //Owner - to be searched (so, cannot use AlarmMember.java)
    String owner_uid;
    String owner_name;
    List<String> owner_times;
    Post owner_mostrecentpost;
    long owner_when;
    int owner_sound_on;
    int owner_vibe_on;
    int owner_power_on;

    public AlarmOwner() {
        super();
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

    public Post getOwner_mostrecentpost() {
        return owner_mostrecentpost;
    }

    public void setOwner_mostrecentpost(Post owner_mostrecentpost) {
        this.owner_mostrecentpost = owner_mostrecentpost;
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


}
