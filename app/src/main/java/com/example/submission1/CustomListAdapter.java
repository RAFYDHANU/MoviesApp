package com.example.submission1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] judulList;
    private final String[] detail;
    private final int[] gambarList;

    public CustomListAdapter(Activity context, String[] judulList, String[] detail, int[] gambarList) {
        super(context, R.layout.item_video, judulList);
        this.context = context;
        this.judulList = judulList;
        this.detail = detail;
        this.gambarList = gambarList;


    }

    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item_video, null, true);

        TextView txtList = (TextView) rowView.findViewById(R.id.tv_item_name);
        TextView txt = (TextView) rowView.findViewById(R.id.tv_item_detail);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img_item_photo);

        txtList.setText(judulList[position]);
        txt.setText(detail[position]);
        imageView.setImageResource((gambarList[position]));


        return rowView;
    }

}