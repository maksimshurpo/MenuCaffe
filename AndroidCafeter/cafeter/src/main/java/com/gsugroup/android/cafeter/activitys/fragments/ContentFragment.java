package com.gsugroup.android.cafeter.activitys.fragments;

import android.app.Fragment;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.gsugroup.android.cafeter.R;
import com.gsugroup.android.cafeter.activitys.custom.ParallaxScrollView;

/**
 * Created by Maksim_Shurpo on 8/14/2014.
 */
public class ContentFragment extends Fragment {

    private Drawable actionBarBackgroundDraweble;
    private ParallaxScrollView parallaxScrollView;
    private Drawable.Callback callback = new Drawable.Callback() {
        @Override
        public void invalidateDrawable(Drawable who) {
            getActivity().getActionBar().setBackgroundDrawable(who);
        }

        @Override
        public void scheduleDrawable(Drawable who, Runnable what, long when) {

        }

        @Override
        public void unscheduleDrawable(Drawable who, Runnable what) {

        }
    };

    public ContentFragment() {
    }

    public static ContentFragment newInstance(){
        return new ContentFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_fragment, container, false);
        return view;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ColorDrawable colorDrawable = new ColorDrawable(getActivity().getResources().getColor(R.color.MediumSeaGreen));
        actionBarBackgroundDraweble = colorDrawable.getCurrent();
        actionBarBackgroundDraweble.setAlpha(0);

        getActivity().getActionBar().setBackgroundDrawable(actionBarBackgroundDraweble);
        parallaxScrollView = (ParallaxScrollView) view.findViewById(R.id.notifying_scroll_view);
        parallaxScrollView.setOnScrollChangedListener(onScrollChangedListener(view));

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN_MR1) {
            actionBarBackgroundDraweble.setCallback(callback);
        }
    }

    private ParallaxScrollView.OnScrollChangedListener onScrollChangedListener(final View view){
        return new ParallaxScrollView.OnScrollChangedListener() {
            @Override
            public void onScrollChanged(ScrollView scrollView, int l, int t, int oldl, int oldt) {
                int headerHeight = view.findViewById(R.id.image_header).getHeight() - getActivity().getActionBar().getHeight();
                float ration = (float) Math.min(Math.max(t, 0), headerHeight) / headerHeight;
                int newAlpha = (int) (ration * 255);
                actionBarBackgroundDraweble.setAlpha(newAlpha);
            }
        };
    }
}
