package com.gsugroup.android.cafeter.activitys.custom;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maksim_Shurpo on 8/14/2014.
 */
public class ParallaxedView {

    protected WeakReference<View> view;
    protected int lastOffset;
    private List<Animation> animations;

    protected ParallaxedView(View view) {
        this.lastOffset = 0;
        this.animations = new ArrayList<Animation>();
        this.view = new WeakReference<View>(view);
    }

    public boolean is(View v) {
        return (v != null && view != null && view.get() != null && view.get().equals(v));
    }

    public void setOffSet(float offset){
        View view = this.view.get();
        if (view != null){
            view.setTranslationY(offset);
        }
    }

    public void setAlpha(float alpha){
        View view = this.view.get();
        if(view != null){
            view.setAlpha(alpha);
        }
    }

    protected synchronized void addAnimation(Animation animation){
        animations.add(animation);
    }

    protected synchronized void animationNow(){
        View view = this.view.get();
        if (view != null){
            AnimationSet set = new AnimationSet(true);
            for (Animation animation : animations){
                if (animation != null){
                    set.addAnimation(animation);
                }
                set.setDuration(0);
                set.setFillAfter(true);
                view.setAnimation(set);
                set.start();
                animations.clear();
            }
        }
    }

    public void setView(View view){
        this.view = new WeakReference<View>(view);
    }
}
