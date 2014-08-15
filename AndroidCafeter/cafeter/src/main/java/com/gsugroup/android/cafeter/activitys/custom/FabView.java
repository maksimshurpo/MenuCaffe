package com.gsugroup.android.cafeter.activitys.custom;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.gsugroup.android.cafeter.R;

/**
 * Created by Maksim_Shurpo on 8/12/2014.
 */
public class FabView extends FrameLayout {

    private static final int IMAGE_TYPE = 0;
    private static final int TEXT_TYPE = 1;

    private static final int NO_BACKGROUND = 0;

    private ImageView imageView;
    private TextView textView;

    public FabView(Context context) {
        super(context);
    }

    public FabView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.FabView, 0, 0);
        Drawable image = typedArray.getDrawable(R.styleable.FabView_src);
        int background = typedArray.getResourceId(R.styleable.FabView_backgroundFab, NO_BACKGROUND);
        int textSize = typedArray.getDimensionPixelSize(R.styleable.FabView_textSize, LayoutParams.WRAP_CONTENT);
        String text = typedArray.getString(R.styleable.FabView_text);
        int imageSize = typedArray.getDimensionPixelSize(R.styleable.FabView_imageSize, LayoutParams.WRAP_CONTENT);

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.fab_view, this, true);

        if(background != NO_BACKGROUND) {
            setBackgroundResource(background);
        }
        imageView = (ImageView) getChildAt(IMAGE_TYPE);
        imageView.setImageDrawable(image);
        FrameLayout.LayoutParams params = new LayoutParams(imageSize, imageSize);
        params.gravity = Gravity.CENTER;
        imageView.setLayoutParams(params);
        textView = (TextView) getChildAt(TEXT_TYPE);
        textView.setText(text);
        params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        textView.setLayoutParams(params);
        textView.setTextSize(textSize);
    }
}
