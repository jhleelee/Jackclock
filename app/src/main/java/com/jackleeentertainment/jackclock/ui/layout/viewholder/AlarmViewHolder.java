package com.jackleeentertainment.jackclock.ui.layout.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;

import com.jackleeentertainment.jackclock.R;
import com.jackleeentertainment.jackclock.object.Post;
import com.jackleeentertainment.jackclock.object.SndVib;

import java.util.List;

/**
 * Created by Jacklee on 2016. 9. 16..
 */
public class AlarmViewHolder extends RecyclerView.ViewHolder {
    View mView;

    RelativeLayout i_alarm, ro_media, ro_alarm_clock, ro_person_photo_48dip__lo_avatartitlesubtitle;
    LinearLayout lo_smallitem_joined__lo_repeat_sndvib,lo_alarm_more,lo_alarm_action,lo_avatartitlesubtitle, lo_repeat_sndvib, lo_smallitem_repeat__lo_repeat_sndvib,
            lo_smallitem_sndvib__lo_repeat_sndvib,lo_alarm_more_content,lo_listof__lo_avatar_namemultitext_lohourlikereply;
    ImageButton ibPower, ibMore__lo_alarm_more_content;
    ImageView ivBackGround__ro_media, ivSound__lo_smallitem_sndvib, ivVibe__lo_smallitem_sndvib,
            ivVideoTakerPhoto__lo_alarm_more_content;
    View v_scrim_gradient_top, v_scrim_solid, vBackGround__ro_media, v_scrim_gradient_bottom__ro_media,
            v_scrim_solid__ro_media;
    TextView tvJoinedNumber__lo_joined;
    TextView tvAlarmClock__ro_alarm_clock;
    TextView tvAlarmClockAMPM__ro_alarm_clock;
    TextView tvTitle__lo_avatartitlesubtitle;
    TextView tvSubTitle__lo_avatartitlesubtitle;
    TextView tvRepeat__lo_smallitem_repeat;
    TextView tvMute__lo_smallitem_sndvib;
    TextView tvVideoBy__lo_alarm_more_content;



    TextView tvVideoTakerName__lo_alarm_more_content;
    TextView tvVideoTakenAt__lo_alarm_more_content;
    TextView tvSound__lo_alarm_more_content;
    TextView tvVibe__lo_alarm_more_content;
    TextView tvTag__lo_alarm_more_content;
    TextView tvDetail__lo_alarm_more_content;
    VideoView vvBackGround__ro_media;
    Button btAccept__lo_alarm_action,btDecline__lo_alarm_action;
    RecyclerView recyclerView__lo_alarm_more_content;

    public AlarmViewHolder(View itemView) {
        super(itemView);

        mView = itemView;

        i_alarm = (RelativeLayout) mView.findViewById(R.id.i_alarm);

        ro_media = (RelativeLayout) i_alarm.findViewById(R.id.ro_media);
        vBackGround__ro_media = (View) i_alarm.findViewById(R.id.vBackGround__ro_media);
        vvBackGround__ro_media = (VideoView) i_alarm.findViewById(R.id.vvBackGround__ro_media);
        ivBackGround__ro_media = (ImageView) i_alarm.findViewById(R.id.ivBackGround__ro_media);
        v_scrim_gradient_bottom__ro_media = (View) i_alarm.findViewById(R.id.v_scrim_gradient_bottom__ro_media);
        v_scrim_solid__ro_media = (View) i_alarm.findViewById(R.id.v_scrim_solid__ro_media);

        ro_alarm_clock = (RelativeLayout) i_alarm.findViewById(R.id.ro_alarm_clock);
        tvAlarmClock__ro_alarm_clock = (TextView) ro_alarm_clock.findViewById(R.id.tvAlarmClock__ro_alarm_clock);
        tvAlarmClockAMPM__ro_alarm_clock = (TextView) ro_alarm_clock.findViewById(R.id.tvAlarmClockAMPM__ro_alarm_clock);

        lo_avatartitlesubtitle = (LinearLayout) i_alarm.findViewById(R.id.lo_avatartitlesubtitle);
        ro_person_photo_48dip__lo_avatartitlesubtitle = (RelativeLayout) lo_avatartitlesubtitle.findViewById(R.id.ro_person_photo_48dip__lo_avatartitlesubtitle);
        tvTitle__lo_avatartitlesubtitle = (TextView) lo_avatartitlesubtitle.findViewById(R.id.tvTitle__lo_avatartitlesubtitle);
        tvSubTitle__lo_avatartitlesubtitle = (TextView) lo_avatartitlesubtitle.findViewById(R.id.tvSubTitle__lo_avatartitlesubtitle);

        ibPower = (ImageButton) i_alarm.findViewById(R.id.ibPower);

        lo_repeat_sndvib = (LinearLayout) i_alarm.findViewById(R.id.lo_repeat_sndvib);
        lo_smallitem_joined__lo_repeat_sndvib = (LinearLayout) lo_repeat_sndvib.findViewById(R.id.lo_smallitem_joined__lo_repeat_sndvib);
        lo_smallitem_repeat__lo_repeat_sndvib = (LinearLayout) lo_repeat_sndvib.findViewById(R.id.lo_smallitem_repeat__lo_repeat_sndvib);
        lo_smallitem_sndvib__lo_repeat_sndvib = (LinearLayout) lo_repeat_sndvib.findViewById(R.id.lo_smallitem_sndvib__lo_repeat_sndvib);
        tvJoinedNumber__lo_joined = (TextView) lo_smallitem_joined__lo_repeat_sndvib.findViewById(R.id.tvJoinedNum__lo_joined);
        tvRepeat__lo_smallitem_repeat = (TextView) lo_smallitem_repeat__lo_repeat_sndvib.findViewById(R.id.tvRepeat__lo_smallitem_repeat);
        ivSound__lo_smallitem_sndvib = (ImageView) lo_smallitem_sndvib__lo_repeat_sndvib.findViewById(R.id.ivSound__lo_smallitem_sndvib);
        ivVibe__lo_smallitem_sndvib = (ImageView) lo_smallitem_sndvib__lo_repeat_sndvib.findViewById(R.id.ivVibe__lo_smallitem_sndvib);
        tvMute__lo_smallitem_sndvib = (TextView) lo_smallitem_sndvib__lo_repeat_sndvib.findViewById(R.id.tvMute__lo_smallitem_sndvib);

        v_scrim_gradient_top = (View) i_alarm.findViewById(R.id.v_scrim_gradient_top);
        v_scrim_solid = (View) i_alarm.findViewById(R.id.v_scrim_solid);

        lo_alarm_more = (LinearLayout) mView.findViewById(R.id.lo_alarm_more);
        lo_alarm_more_content = (LinearLayout) lo_alarm_more.findViewById(R.id.lo_alarm_more_content);
        lo_listof__lo_avatar_namemultitext_lohourlikereply = (LinearLayout) lo_alarm_more.findViewById(R.id.lo_listof__lo_avatar_namemultitext_lohourlikereply);
        recyclerView__lo_alarm_more_content = (RecyclerView) lo_listof__lo_avatar_namemultitext_lohourlikereply.findViewById(R.id.recyclerView__lo_alarm_more_content);

        tvVideoBy__lo_alarm_more_content = (TextView)lo_alarm_more_content.findViewById(R.id.tvVideoBy__lo_alarm_more_content);
        ivVideoTakerPhoto__lo_alarm_more_content = (ImageView)lo_alarm_more_content.findViewById(R.id.ivVideoTakerPhoto__lo_alarm_more_content);
        tvVideoTakerName__lo_alarm_more_content = (TextView)lo_alarm_more_content.findViewById(R.id.tvVideoTakerName__lo_alarm_more_content);
        tvVideoTakenAt__lo_alarm_more_content = (TextView)lo_alarm_more_content.findViewById(R.id.tvVideoTakenAt__lo_alarm_more_content);
        tvSound__lo_alarm_more_content = (TextView)lo_alarm_more_content.findViewById(R.id.tvSound__lo_alarm_more_content);
        tvVibe__lo_alarm_more_content = (TextView)lo_alarm_more_content.findViewById(R.id.tvVibe__lo_alarm_more_content);
        ibMore__lo_alarm_more_content = (ImageButton)lo_alarm_more_content.findViewById(R.id.ibMore__lo_alarm_more_content);
        tvTag__lo_alarm_more_content = (TextView)lo_alarm_more_content.findViewById(R.id.tvTag__lo_alarm_more_content);
        tvDetail__lo_alarm_more_content = (TextView)lo_alarm_more_content.findViewById(R.id.tvDetail__lo_alarm_more_content);

        lo_alarm_action = (LinearLayout) mView.findViewById(R.id.lo_alarm_action);
        btAccept__lo_alarm_action = (Button) lo_alarm_action.findViewById(R.id.btAccept__lo_alarm_action);
        btDecline__lo_alarm_action = (Button)lo_alarm_action.findViewById(R.id.btDecline__lo_alarm_action);

    }

        /*
        AlarmOwner (Profile)
         */

    public void setOwnerPhoto(String alarmOwnerUid) {
        //Glide
    }

    public void setOwnerName(String alarmOwnerName) {
        tvTitle__lo_avatartitlesubtitle.setText(alarmOwnerName);
    }

        /*
        AlarmBody
         */

    public void setAlarmTitle(String title) {
        tvSubTitle__lo_avatartitlesubtitle.setText(title);
    }

    public void setAlarmRepeatText(int Rtype, String Rweek, List<String> Rdate) {
        //Method
    }

    public void setAlarmBackgroundMedia(Post video) {

    }

        /*
        MyAlarmStatus
         */

    public void setMyClock(long when) {
        //Method
    }

    public void setMyPower(int isPowerOn) {
        //uiIvPower
        //uiScrimSolid
    }

    public void setMySoundVibe(int isSoundOn, int isVibeOn) {
        //zeroOne2FalseTrue
    }

    public void setJoinedNumber(int intJoinedNumber) {

    }

    public void setVideoTakerTakenAt(Post video){
        //ivVideoTakerPhoto__lo_alarm_more_content
        tvVideoTakerName__lo_alarm_more_content.setText(video.getName());
        //tvVideoTakenAt__lo_alarm_more_content.setText(video.getTs());
    }

    public void setSound(SndVib sound){
        tvSound__lo_alarm_more_content.setText(sound.getOtitle());
    }

    public void setVibe(SndVib vibe){
        tvVibe__lo_alarm_more_content.setText(vibe.getOtitle());
    }

    public void setTag(List<String> tags){

    }

    public void setDetail(String detail){
        tvDetail__lo_alarm_more_content.setText(detail);
    }

    public void setRecentPosts(){
        //
    }


    /*
    UI
     */
    public RecyclerView getRecyclerView__lo_alarm_more_content() {
        return recyclerView__lo_alarm_more_content;
    }

    public View getmView() {
        return mView;
    }

    public RelativeLayout getI_alarm() {
        return i_alarm;
    }

    public RelativeLayout getRo_media() {
        return ro_media;
    }

    public RelativeLayout getRo_alarm_clock() {
        return ro_alarm_clock;
    }

    public RelativeLayout getRo_person_photo_48dip__lo_avatartitlesubtitle() {
        return ro_person_photo_48dip__lo_avatartitlesubtitle;
    }

    public LinearLayout getLo_smallitem_joined__lo_repeat_sndvib() {
        return lo_smallitem_joined__lo_repeat_sndvib;
    }

    public LinearLayout getLo_alarm_more() {
        return lo_alarm_more;
    }

    public LinearLayout getLo_alarm_action() {
        return lo_alarm_action;
    }

    public LinearLayout getLo_avatartitlesubtitle() {
        return lo_avatartitlesubtitle;
    }

    public LinearLayout getLo_repeat_sndvib() {
        return lo_repeat_sndvib;
    }

    public LinearLayout getLo_smallitem_repeat__lo_repeat_sndvib() {
        return lo_smallitem_repeat__lo_repeat_sndvib;
    }

    public LinearLayout getLo_smallitem_sndvib__lo_repeat_sndvib() {
        return lo_smallitem_sndvib__lo_repeat_sndvib;
    }

    public LinearLayout getLo_alarm_more_content() {
        return lo_alarm_more_content;
    }

    public LinearLayout getLo_listof__lo_avatar_namemultitext_lohourlikereply() {
        return lo_listof__lo_avatar_namemultitext_lohourlikereply;
    }

    public ImageButton getIbPower() {
        return ibPower;
    }

    public ImageButton getIbMore__lo_alarm_more_content() {
        return ibMore__lo_alarm_more_content;
    }

    public ImageView getIvBackGround__ro_media() {
        return ivBackGround__ro_media;
    }

    public ImageView getIvSound__lo_smallitem_sndvib() {
        return ivSound__lo_smallitem_sndvib;
    }

    public ImageView getIvVibe__lo_smallitem_sndvib() {
        return ivVibe__lo_smallitem_sndvib;
    }

    public ImageView getIvVideoTakerPhoto__lo_alarm_more_content() {
        return ivVideoTakerPhoto__lo_alarm_more_content;
    }

    public View getV_scrim_gradient_top() {
        return v_scrim_gradient_top;
    }

    public View getV_scrim_solid() {
        return v_scrim_solid;
    }

    public View getvBackGround__ro_media() {
        return vBackGround__ro_media;
    }

    public View getV_scrim_gradient_bottom__ro_media() {
        return v_scrim_gradient_bottom__ro_media;
    }

    public View getV_scrim_solid__ro_media() {
        return v_scrim_solid__ro_media;
    }

    public TextView getTvJoinedNumber__lo_joined() {
        return tvJoinedNumber__lo_joined;
    }

    public TextView getTvAlarmClock__ro_alarm_clock() {
        return tvAlarmClock__ro_alarm_clock;
    }

    public TextView getTvAlarmClockAMPM__ro_alarm_clock() {
        return tvAlarmClockAMPM__ro_alarm_clock;
    }

    public TextView getTvTitle__lo_avatartitlesubtitle() {
        return tvTitle__lo_avatartitlesubtitle;
    }

    public TextView getTvSubTitle__lo_avatartitlesubtitle() {
        return tvSubTitle__lo_avatartitlesubtitle;
    }

    public TextView getTvRepeat__lo_smallitem_repeat() {
        return tvRepeat__lo_smallitem_repeat;
    }

    public TextView getTvMute__lo_smallitem_sndvib() {
        return tvMute__lo_smallitem_sndvib;
    }

    public TextView getTvVideoBy__lo_alarm_more_content() {
        return tvVideoBy__lo_alarm_more_content;
    }

    public TextView getTvVideoTakerName__lo_alarm_more_content() {
        return tvVideoTakerName__lo_alarm_more_content;
    }

    public TextView getTvVideoTakenAt__lo_alarm_more_content() {
        return tvVideoTakenAt__lo_alarm_more_content;
    }

    public TextView getTvSound__lo_alarm_more_content() {
        return tvSound__lo_alarm_more_content;
    }

    public TextView getTvVibe__lo_alarm_more_content() {
        return tvVibe__lo_alarm_more_content;
    }

    public TextView getTvTag__lo_alarm_more_content() {
        return tvTag__lo_alarm_more_content;
    }

    public TextView getTvDetail__lo_alarm_more_content() {
        return tvDetail__lo_alarm_more_content;
    }

    public VideoView getVvBackGround__ro_media() {
        return vvBackGround__ro_media;
    }

    public Button getBtAccept__lo_alarm_action() {
        return btAccept__lo_alarm_action;
    }

    public Button getBtDecline__lo_alarm_action() {
        return btDecline__lo_alarm_action;
    }

}
