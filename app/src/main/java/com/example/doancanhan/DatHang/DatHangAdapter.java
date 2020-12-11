package com.example.doancanhan.DatHang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.doancanhan.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.List;

public class DatHangAdapter  extends BaseAdapter {

    Context context;
    int Layout;
    List<GridView_DatHang> arrayList;

    public DatHangAdapter(Context context, int layout, List<GridView_DatHang> arrayList) {
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

        txtTien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               OpenDialog(v);
            }
        });

        txtTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog(v);
            }
        });

        txtTen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog(v);
            }
        });
        imgHinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog(v);
            }
        });


        return convertView;

    }
    public  void OpenDialog(View v){
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(
                context,R.style.BottomSheetDialogTheme
        );
        v = LayoutInflater.from(context.getApplicationContext())
                .inflate(
                        R.layout.dialog_themvaogh,
                        (LinearLayout) bottomSheetDialog.findViewById(R.id.themvaogh)
                );
        bottomSheetDialog.setContentView(v);
        bottomSheetDialog.show();
    }


}
