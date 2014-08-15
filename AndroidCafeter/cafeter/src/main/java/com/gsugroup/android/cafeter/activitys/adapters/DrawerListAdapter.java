package com.gsugroup.android.cafeter.activitys.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.gsugroup.android.cafeter.R;
import com.gsugroup.android.cafeter.activitys.custom.RoundedImageView;

/**
 * Created by Maksim_Shurpo on 8/8/2014.
 */
public class DrawerListAdapter extends ArrayAdapter<DrawerListAdapter.ViewHolder> {

    static class ViewHolder {
        RoundedImageView roundedImageView;
        TextView titleView;
    }

    private Context context;

    private int[] idImages = new int[]{R.drawable.desert, R.drawable.solads, R.drawable.katleti};

    public DrawerListAdapter(Context context) {
        super(context, R.layout.drawer_item_view);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        ViewHolder holder = null;
        if(rowView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.drawer_item_view, parent, false);

            holder = new ViewHolder();
            holder.roundedImageView = (RoundedImageView) rowView.findViewById(R.id.icon_drawer_menu);
            holder.titleView = (TextView) rowView.findViewById(R.id.drawer_title);

            rowView.setTag(holder);
        }else {
            holder = (ViewHolder) rowView.getTag();
        }
        holder.roundedImageView.setImageDrawable(context.getResources().getDrawable(idImages[position]));
        holder.titleView.setText(context.getResources().getStringArray(R.array.menu)[position]);
        return rowView;
    }

    @Override
    public int getCount() {
        return idImages.length;
    }

    @Override
    public ViewHolder getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public int getPosition(ViewHolder item) {
        return super.getPosition(item);
    }
}
