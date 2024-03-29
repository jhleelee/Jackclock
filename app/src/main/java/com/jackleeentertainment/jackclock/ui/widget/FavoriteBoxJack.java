package com.jackleeentertainment.jackclock.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;

import com.jackleeentertainment.jackclock.R;
import com.jackleeentertainment.jackclock.ui.util.JM;

/**
 * Created by Jacklee on 2016. 9. 9..
 */
public class FavoriteBoxJack extends ImageButton {

    Context context;
    boolean isChecked = false;

    OnClickListener ocl = new OnClickListener() {
        @Override
        public void onClick(View view) {
            setChecked(!isChecked());
        }
    };

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;

        if (checked) {
            setImageDrawable(
                    JM.drawableById(R.drawable.ic_favorite_border_white_48dp, context));
            JM.tint(this, R.color.black, context);
        } else {
            setImageDrawable(
                    JM.drawableById(R.drawable.ic_favorite_white_48dp, context));
            JM.tint(this, R.color.colorAccent, context);

        }

    }


    /********
     * Overides
     *********/


    public FavoriteBoxJack(Context context) {
        super(context);
        setScaleType(ScaleType.CENTER_CROP);
        setOnClickListener(ocl);
    }

    public FavoriteBoxJack(Context context, AttributeSet attrs) {
        super(context, attrs);
        setScaleType(ScaleType.CENTER_CROP);
        setOnClickListener(ocl);
    }

    public FavoriteBoxJack(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setScaleType(ScaleType.CENTER_CROP);
        setOnClickListener(ocl);
    }

    //API21
//    public CheckBoxJack(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//        setScaleType(ScaleType.CENTER_CROP);
//        setOnClickListener(ocl);
//    }
}
