package com.example.doancanhan.CH_UuDai_User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancanhan.Main.Main_User;
import com.example.doancanhan.R;

import java.util.ArrayList;

public class CuaHang_UuDai_User   extends AppCompatActivity {
    ListView listView;
    TextView tv_close;
        ArrayList<List_UuDai_User> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuahang_uudai_user);



        tv_close=(TextView) findViewById(R.id.tv_close);
        tv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CuaHang_UuDai_User.this, Main_User.class);
                startActivity(intent);
            }
        });

        listView = (ListView) findViewById(R.id.lv_doi_uudai);

        arrayList = new ArrayList<List_UuDai_User>();

        arrayList.add(new List_UuDai_User("Ưu Đãi Từ The Coffee House", " 01 LY CÀ PHÊ VIỆT NAM CỠ VỪA", R.drawable.st_chanhbac));
        arrayList.add(new List_UuDai_User("", " HOT DEAL-MIỄN PHÍ", R.drawable.st_chanhbac));
        arrayList.add(new List_UuDai_User("", " 01 LY CÀ PHÊ VIỆT NAM CỠ VỪA", R.drawable.st_chanhbac));
        arrayList.add(new List_UuDai_User("", " HOT DEAL-MIỄN PHÍ", R.drawable.st_chanhbac));

        CH_UuDai_User_Adapter adapter = new CH_UuDai_User_Adapter(
                CuaHang_UuDai_User.this, R.layout.list_doiuudai,arrayList
        );

        listView.setAdapter(adapter);

        //bắt đầu tabhost
        TabHost tabhost1 = (TabHost) findViewById(R.id.tab_dathang);

        // setting up the tab host
        tabhost1.setup();

        // Code thêm Tab 1 vào tabhost
        TabHost.TabSpec spec1 = tabhost1.newTabSpec("Đổi ưu đãi");
        spec1.setContent(R.id.tab_doiuudai);

        // setting the name of the tab 1 as "Tab One"
        spec1.setIndicator("Đổi ưu đãi");

        //thêm  tab vào tabhost
        tabhost1.addTab(spec1);

        // Code thêm Tab 2 vào tabhost
        spec1 = tabhost1.newTabSpec("Ưu đãi của bạn");
        spec1.setContent(R.id.tab_thucuong);
        // setting the name of the tab 1 as "Tab Two"
        spec1.setIndicator("Ưu đãi của bạn");
        tabhost1.addTab(spec1);
    }
}
