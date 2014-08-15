package com.gsugroup.android.cafeter.activitys.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gsugroup.android.cafeter.R;

/**
 * Created by Maksim_Shurpo on 8/11/2014.
 */
public class HeaderView extends RelativeLayout {

    private static final int IMAGE_TYPE = 0;
    private static final int PALLIATE_TYPE = 1;
    private static final int TITLE_TYPE = 2;
    private static final int DESCRIPTION_TYPE = 3;

    private static final int DEFAULT_HEIGHT_PALLIATE = LayoutParams.WRAP_CONTENT;
    private static final int DEFAULT_HEIGHT_ALPHA = 0;
    private static final float DEFAULT_TITLE_SIZE = 15F;
    private static final float DEFAULT_DESCRIPTION_SIZE = 10F;

    private ImageView imageView;
    private View palliateView;
    private TextView titleView;
    private TextView descriptionView;

    public HeaderView(Context context) {
        super(context);
    }

    public HeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.header, 0, 0);
        String titleText = typedArray.getString(R.styleable.header_titleText);
        String descriptionText = typedArray.getString(R.styleable.header_descriptionText);
        Drawable drawable = typedArray.getDrawable(R.styleable.header_headerImage);
        int heightPalliate = (int)typedArray.getDimension(R.styleable.header_heightPalliate, DEFAULT_HEIGHT_PALLIATE);
        int alpha = typedArray.getInt(R.styleable.header_alpha, DEFAULT_HEIGHT_ALPHA);
        float titleSize = typedArray.getDimension(R.styleable.header_titleSize, DEFAULT_TITLE_SIZE);
        float descriptionSize = typedArray.getDimension(R.styleable.header_descriptionSize, DEFAULT_DESCRIPTION_SIZE);
        typedArray.recycle();

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.header_content_view, this, true);

        imageView = (ImageView) getChildAt(IMAGE_TYPE);
        imageView.setImageDrawable(drawable);

        palliateView = getChildAt(PALLIATE_TYPE);
        palliateView.setBackgroundColor(setColorAlpha(Color.parseColor("#00000000"), alpha));
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, heightPalliate);
        params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);

        palliateView.setLayoutParams(params);

        titleView = (TextView) getChildAt(TITLE_TYPE);
        titleView.setText(titleText);
        titleView.setTextSize(titleSize);

        descriptionView = (TextView) getChildAt(DESCRIPTION_TYPE);
        descriptionView.setText(descriptionText);
        descriptionView.setTextSize(descriptionSize);
    }

    private static int setColorAlpha(int color, int alpha) {
        return (alpha << 24) | (color & 0x00ffffff);
    }

    public void setHeaderImage(Drawable headerImage){
        imageView.setImageDrawable(headerImage);
    }

}
