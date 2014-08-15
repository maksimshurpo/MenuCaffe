package com.gsugroup.android.cafeter.activitys.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.gsugroup.android.cafeter.R;
import com.gsugroup.android.cafeter.activitys.custom.HeaderView;

import java.util.Random;

/**
 * Created by Maksim_Shurpo on 8/11/2014.
 */
public class ContentGridAdapter extends ArrayAdapter<ContentGridAdapter.ViewHolder> {

    Drawable[] headerImage;

    static class ViewHolder {
        HeaderView headerView;
    }

    private Context context;

    public ContentGridAdapter(Context context) {
        super(context, R.layout.dishes_item_view);
        this.context = context;

        headerImage = new Drawable[]{context.getResources().getDrawable(R.drawable.dishes),
                context.getResources().getDrawable(R.drawable.dishes2),
                context.getResources().getDrawable(R.drawable.dishes3),
                context.getResources().getDrawable(R.drawable.dishes4),
                context.getResources().getDrawable(R.drawable.dishes5)};
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder holder = null;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.dishes_item_view, parent, false);

            holder = new ViewHolder();
            holder.headerView = (HeaderView) view.findViewById(R.id.header);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        Random randomGenerator = new Random();
        int num = randomGenerator.nextInt(4);
        holder.headerView.setHeaderImage(headerImage[num]);
        return view;
    }

    @Override
    public int getCount() {
        return 50;
    }

    @Override
    public int getPosition(ViewHolder item) {
        return super.getPosition(item);
    }

    @Override
    public ViewHolder getItem(int position) {
        return super.getItem(position);
    }
}
