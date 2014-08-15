package com.gsugroup.android.cafeter.activitys;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import com.gsugroup.android.cafeter.CommonFragmentActivity;
import com.gsugroup.android.cafeter.R;
import com.gsugroup.android.cafeter.activitys.fragments.ContentFragment;

/**
 * Created by Maksim_Shurpo on 8/14/2014.
 */
public class ContentFragmentActivity extends CommonFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_activity);

        Fragment fragment = ContentFragment.newInstance();

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_dishes, fragment).commit();
    }
}
