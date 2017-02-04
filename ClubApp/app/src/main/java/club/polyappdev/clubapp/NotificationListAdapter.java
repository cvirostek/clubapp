package club.polyappdev.clubapp;

import android.widget.BaseAdapter;

/**
 * Created by Connor on 1/28/17.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NotificationListAdapter extends BaseAdapter {
    Context context;
    String list_items[];
    LayoutInflater inflter;

    public NotificationListAdapter(Context applicationContext, String[] animals) {
        this.context = applicationContext;
        this.list_items = animals;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return list_items.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.notifications_listview, viewGroup, false);

        //ImageView icon = (ImageView) view.findViewById(R.id.icon);
        TextView text = (TextView) view.findViewById(R.id.textView);
        //icon.setImageResource(animals[i]);
        text.setText(list_items[i]);
        return view;
    }
}

