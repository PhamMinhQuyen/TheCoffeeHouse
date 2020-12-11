package com.example.doancanhan.DatHang_User;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.doancanhan.R;

import java.util.List;

public class DatHang_User_Adapter extends BaseAdapter {

    Context context;
    int Layout;
    List<GridView_DatHang_User> arrayList;

    public DatHang_User_Adapter(Context context, int layout, List<GridView_DatHang_User> arrayList) {
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

        TextView txtTen1 =(TextView) convertView.findViewById(R.id.tv_ten1);
        txtTen1.setText(arrayList.get(position).ten1);

        TextView txtTien = (TextView) convertView.findViewById(R.id.tv_tien);
        txtTien.setText(arrayList.get(position).tien);

        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.img_hinhanh);
        imgHinh.setImageResource(arrayList.get(position).hinhAnh);


        return convertView;

    }

}
