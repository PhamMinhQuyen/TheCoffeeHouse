package com.example.doancanhan.DatHang;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancanhan.Main.MainActivity;
import com.example.doancanhan.Profile.Profile;
import com.example.doancanhan.R;
import com.example.doancanhan.TimKiemSP.TimKiemSanPham;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class DatHang extends AppCompatActivity {


    GridView gridViewpb,gridView_nu,gridView_da;
    ArrayList<GridView_DatHang> arrayList_pb,arrayList_nu,arrayList_da;
    TextView tv_timkiem;
    Button bt_tintuc,bt_taikhoan;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dathang);



        tv_timkiem = (TextView) findViewById(R.id.tv_timkiem);
        tv_timkiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DatHang.this, TimKiemSanPham.class);
                startActivity(intent);
            }
        });

        bt_tintuc = (Button) findViewById(R.id.bt_tintuc);
        bt_tintuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DatHang.this, MainActivity.class);
                startActivity(intent);
            }
        });

        bt_taikhoan = (Button) findViewById(R.id.bt_taikhoan);
        bt_taikhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DatHang.this, Profile.class);
                startActivity(intent);
            }
        });

        gridViewpb = (GridView) findViewById(R.id.gv_phobien);


        gridView_nu = (GridView) findViewById(R.id.gv_thucuong);
        gridView_da = (GridView) findViewById(R.id.gv_doan);

        arrayList_pb = new ArrayList<GridView_DatHang>();
        arrayList_nu = new ArrayList<GridView_DatHang>();
        arrayList_da = new ArrayList<GridView_DatHang>();

        arrayList_pb.add(new GridView_DatHang("Món ăn được yêu thích", " Trà Sữa Trân Châu ", "Truyền Thống", "69.000 đ", R.drawable.ts_tranchau_tt));
        arrayList_pb.add(new GridView_DatHang("", " Cà Phê Sữa ", "Đá", "32.000 đ", R.drawable.cf_da));
        arrayList_pb.add(new GridView_DatHang("", " Trà Xoài MACCHIATO", "", "55.000 đ", R.drawable.traxoai));
        arrayList_pb.add(new GridView_DatHang("", " Trà Đào Cam Sả", "Đá", "45.000 đ", R.drawable.tdcs));
        arrayList_pb.add(new GridView_DatHang("", " Đào Việt Quốc Đá ", "Xay", "59.000 đ ", R.drawable.dvq_daxay));
        arrayList_pb.add(new GridView_DatHang("", " Cà Phê Đá ", "Xay", "59.000 đ", R.drawable.cf_da_xay));
        arrayList_pb.add(new GridView_DatHang("", " Trà Sữa Trân Châu ", "Truyền Thống", "69.000 đ", R.drawable.ts_tranchau_tt));
        arrayList_pb.add(new GridView_DatHang("", " Sinh Tố Chanh Bạc ", "", "59.000 đ ", R.drawable.st_chanhbac));
        arrayList_pb.add(new GridView_DatHang("", " Latte", "", "45.000 đ", R.drawable.latte));
        arrayList_pb.add(new GridView_DatHang("", " Chà Bông Phô Mai", "", "69.000 đ", R.drawable.cbpm));
        arrayList_pb.add(new GridView_DatHang("", " Cold Brew ", "", "45.000 đ ", R.drawable.cold_brew_tt));
        arrayList_pb.add(new GridView_DatHang("", " Sinh Tố Chanh Bạc ", "", "59.000 đ ", R.drawable.st_chanhbac));


        arrayList_nu.add(new GridView_DatHang("Cà phê", " Cà Phê Sữa ", "Đá", "32.000 đ", R.drawable.cf_da));
        arrayList_nu.add(new GridView_DatHang("", " Cà Phê Đá ", "Xay", "59.000 đ", R.drawable.cf_da_xay));
        arrayList_nu.add(new GridView_DatHang("", " Bạc Sỉu ", "", "39.000 đ", R.drawable.bs));
        arrayList_nu.add(new GridView_DatHang("", " Bạc Sỉu ", "Nóng", "39.000 đ", R.drawable.bs_nong));
        arrayList_nu.add(new GridView_DatHang("", " Cà Phê Đen ", "Nóng", "29.000 đ", R.drawable.cf_den_nong));
        arrayList_nu.add(new GridView_DatHang("", " Cappucio Nóng ", "", "59.000 đ", R.drawable.cappucino_nong));
        arrayList_nu.add(new GridView_DatHang("", " Cappucio Đá ", "", "59.000 đ", R.drawable.cappucino_da));
        arrayList_nu.add(new GridView_DatHang("", " Cà Phê Sữa ", "Nóng", "29.000 đ", R.drawable.cf_sua_nong));
        arrayList_nu.add(new GridView_DatHang("", " Chocolate Đá ", "Xay", "59.000 đ", R.drawable.chocolate_dx));
        arrayList_nu.add(new GridView_DatHang("", " Cookie Đá Xay ", "Xay", "59.000 đ", R.drawable.cookie_dx));
        arrayList_nu.add(new GridView_DatHang("", " Cold Brew Sữa Tươi ", "Xay", "59.000 đ", R.drawable.cold_brew_st));
        arrayList_nu.add(new GridView_DatHang("", " Cold Brew Cam Sả", "Xay", "59.000 đ", R.drawable.cold_brew_cs));

        arrayList_da.add(new GridView_DatHang("Thức ăn nhẹ", " Đậu Phộng Tỏi Ớt", "", "15.000 đ", R.drawable.dpto));
        arrayList_da.add(new GridView_DatHang("", " Mít Sấy", "", "20.000 đ", R.drawable.mit));
        arrayList_da.add(new GridView_DatHang("", " Chan Dây Sấy Dẻo", "", "25.000 đ", R.drawable.chanhday));
        arrayList_da.add(new GridView_DatHang("Bánh ngọt", " Mouse Matcha", "", "29.000 đ", R.drawable.mouse_matcha));
        arrayList_da.add(new GridView_DatHang("", " Mousse Passion Cheese", "", "29.000 đ", R.drawable.mouse));
        arrayList_da.add(new GridView_DatHang("", " Mochi Kem Matcha", "", "19.000 đ", R.drawable.mouse_matcha));


        DatHangAdapter adapter_pb = new DatHangAdapter(
                DatHang.this, R.layout.gv_dathang_row, arrayList_pb
        );
        DatHangAdapter adapter_nu = new DatHangAdapter(
                DatHang.this, R.layout.gv_dathang_row, arrayList_nu
        );
        DatHangAdapter adapter_da = new DatHangAdapter(
                DatHang.this, R.layout.gv_dathang_row, arrayList_da
        );

        gridViewpb.setAdapter(adapter_pb);
        gridView_nu.setAdapter(adapter_nu);
        gridView_da.setAdapter(adapter_da);


        //bắt đầu tabhost
        TabHost tabhost1 = (TabHost) findViewById(R.id.tab_dathang);

        // setting up the tab host
        tabhost1.setup();

        // Code thêm Tab 1 vào tabhost
        TabHost.TabSpec spec1 = tabhost1.newTabSpec("Phổ biến");
        spec1.setContent(R.id.tab_phobien);

        // setting the name of the tab 1 as "Tab One"
        spec1.setIndicator("Phổ biến");

        //thêm  tab vào tabhost
        tabhost1.addTab(spec1);

        // Code thêm Tab 2 vào tabhost
        spec1 = tabhost1.newTabSpec("Thức uống");
        spec1.setContent(R.id.tab_thucuong);
        // setting the name of the tab 1 as "Tab Two"
        spec1.setIndicator("Thức uống");
        tabhost1.addTab(spec1);

        // Code thêm Tab 3 vào  tabhost
        spec1 = tabhost1.newTabSpec("Đồ ăn");
        spec1.setContent(R.id.tab_doan);
        spec1.setIndicator("Đồ ăn");
        tabhost1.addTab(spec1);



    }



}
