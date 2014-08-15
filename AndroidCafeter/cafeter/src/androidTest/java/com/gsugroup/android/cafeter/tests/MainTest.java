package com.gsugroup.android.cafeter.tests;

import android.app.Activity;
import android.test.AndroidTestCase;

import com.gsugroup.android.cafeter.activitys.CafeterFragmentActivity;
import com.gsugroup.android.cafeter.help.Main;


/**
 * Created by Maksim_Shurpo on 8/13/2014.
 */
public class MainTest extends AndroidTestCase{

    public void testDiv(){
        Main main = new Main();
        assertEquals(1, main.div(5,5));
        assertEquals(2, main.div(6,3));
        assertEquals(1, main.div(5,4));
    }

}
