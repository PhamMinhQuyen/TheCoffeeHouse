package com.example.doancanhan.CH_UuDai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.doancanhan.R;

import java.util.List;

public class CH_UuDai_Adapter extends BaseAdapter {
    Context context;
    int Layout;
    List<List_CHUuDai> arrayList;

    public CH_UuDai_Adapter(Context context, int layout, List<List_CHUuDai> arrayList) {
        this.context = context;
        Layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView= inflater.inflate(Layout,null);

        // Anhs Xạ và Gán Gía Trị
        TextView txtTitle =(TextView) convertView.findViewById(R.id.tv_title);
        txtTitle.setText(arrayList.get(position).title);

        TextView txtTen =(TextView) convertView.findViewById(R.id.tv_ten);
        txtTen.setText(arrayList.get(position).ten);


        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.img_hinhanh);
        imgHinh.setImageResource(arrayList.get(position).hinhAnh);


        return convertView;

    }
}
