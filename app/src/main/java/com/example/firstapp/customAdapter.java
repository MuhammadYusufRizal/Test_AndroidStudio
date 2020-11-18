package com.example.firstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class customAdapter extends ArrayAdapter<City> {
    private Context context;
    int resource;
    public customAdapter(Context context, int resource, ArrayList<City> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String title = getItem(position).getTitle();
        String desc = getItem(position).getDesc();
        int img = getItem(position).getImg();

        City city = new City(title, desc, img);

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.custom_layout, parent, false);

        ImageView vImg = (ImageView) convertView.findViewById(R.id.imageView);
        TextView vTitle = (TextView) convertView.findViewById(R.id.textView);
        TextView vDesc = (TextView) convertView.findViewById(R.id.textView2);

        vImg.setImageResource(img);
        vTitle.setText(title);
        vDesc.setText(desc);

        return convertView;
    }
}
