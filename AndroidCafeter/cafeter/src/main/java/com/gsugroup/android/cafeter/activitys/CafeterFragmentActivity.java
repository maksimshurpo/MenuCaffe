package com.gsugroup.android.cafeter.activitys;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.gsugroup.android.cafeter.CommonFragmentActivity;
import com.gsugroup.android.cafeter.R;
import com.gsugroup.android.cafeter.activitys.adapters.DrawerListAdapter;
import com.gsugroup.android.cafeter.activitys.fragments.DishesFragment;

public class CafeterFragmentActivity extends CommonFragmentActivity {

    private DrawerLayout drawerLayoutView;
    private ListView drawerListView;
    private ActionBarDrawerToggle drawerToggle;

    private CharSequence drawerTitle;
    private CharSequence title;

    private AdapterView.OnItemClickListener onDrawerItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafeter_activity);
        title = drawerTitle = getTitle();

        if (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT == getScreenOrientation()) {
            drawerLayoutView = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawerLayoutView.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
            // ActionBarDrawerToggle ties together the the proper interactions
            // between the sliding drawer and the action bar app icon
            drawerToggle = new ActionBarDrawerToggle(this, drawerLayoutView, R.drawable.ic_drawer, R.string.drawer_open, R.string.drawer_close) {
                @Override
                public void onDrawerOpened(View drawerView) {
                    getActionBar().setTitle(drawerTitle);
                    invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
                }

                @Override
                public void onDrawerClosed(View drawerView) {
                    getActionBar().setTitle(title);
                    invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
                }
            };
            drawerLayoutView.setDrawerListener(drawerToggle);
        }
        drawerListView = (ListView) findViewById(R.id.drawer_list);

        drawerListView.setAdapter(new DrawerListAdapter(this));
        drawerListView.setOnItemClickListener(onDrawerItemClickListener);

        // enable ActionBar app icon to behave as action to toggle nav drawer
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        if (savedInstanceState == null) {
            selectItem(0);
        }
    }

    private void selectItem(int position) {
        Fragment fragment = DishesFragment.newInstance();
        Bundle args = new Bundle();
        args.putInt(DishesFragment.ARG_POSITION_MENU, position);
        fragment.setArguments(args);

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

        // update selected item and title, then close the drawer
        drawerListView.setItemChecked(position, true);
        setTitle(getResources().getStringArray(R.array.menu)[position]);

        if (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT == getScreenOrientation()) {
            drawerLayoutView.closeDrawer(drawerListView);
        }
    }

    @Override
    public void setTitle(CharSequence title) {
        this.title = title;
        getActionBar().setTitle(this.title);
    }

    /**
     * When using the ActionBarDrawerToggle, you must call it during
     * onPostCreate() and onConfigurationChanged()...
     */

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        if (drawerToggle != null) {
            drawerToggle.syncState();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (drawerToggle != null) {
            // Pass any configuration change to the drawer toggls
            drawerToggle.onConfigurationChanged(newConfig);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.cafeter, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // If the nav drawer is open, hide action items related to the content view
        if (drawerLayoutView != null) {
            boolean drawerOpen = drawerLayoutView.isDrawerOpen(drawerListView);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        if (drawerToggle != null) {
            if (drawerToggle.onOptionsItemSelected(item)) {
                return true;
            }
        }
        switch (item.getItemId()) {
            case R.id.action_settings:
                try {
                    PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
                    int versionCode = pInfo.versionCode;
                    String versionName = pInfo.versionName;
                    Toast.makeText(this, "versionCode = " + versionCode + ", versionName = " + versionName, Toast.LENGTH_SHORT).show();
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
