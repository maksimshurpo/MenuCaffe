package com.gsugroup.android.cafeter.activitys.fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.gsugroup.android.cafeter.R;
import com.gsugroup.android.cafeter.activitys.ContentFragmentActivity;
import com.gsugroup.android.cafeter.activitys.adapters.ContentGridAdapter;
import com.gsugroup.android.cafeter.activitys.custom.FabView;

/**
 * Created by Maksim_Shurpo on 8/8/2014.
 */
public class DishesFragment extends Fragment {

    public static final String ARG_POSITION_MENU = "ARG_POSITION_MENU";


    private GridView dishesGridView;
    private FabView fabView;

    private int positionSectionMenu;

    public DishesFragment() {
    }

    public static DishesFragment newInstance() {
        DishesFragment dishesFragment = new DishesFragment();
        return dishesFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        positionSectionMenu = getArguments().getInt(ARG_POSITION_MENU);
        View rootView = inflater.inflate(R.layout.dishes_fragmen, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dishesGridView = (GridView) view.findViewById(R.id.dishes_grid);
        dishesGridView.setAdapter(new ContentGridAdapter(getActivity()));
        dishesGridView.setOnItemClickListener(onItemClickListener());

        fabView = (FabView) view.findViewById(R.id.fab);
        fabView.setOnClickListener(onClickListener());
    }

    private View.OnClickListener onClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.fab:
                        Toast.makeText(getActivity(), "Cart", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        };
    }

    private AdapterView.OnItemClickListener onItemClickListener() {
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), ContentFragmentActivity.class);
                getActivity().startActivity(intent);
            }
        };
    }
}
