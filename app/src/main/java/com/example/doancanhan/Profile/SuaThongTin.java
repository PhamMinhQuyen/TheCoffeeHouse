package com.example.doancanhan.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancanhan.R;

public class SuaThongTin extends AppCompatActivity {
    TextView tv_closesuatt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sua_thongtin);

        tv_closesuatt=(TextView)findViewById(R.id.tv_close_suatt);
        tv_closesuatt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuaThongTin.this, ThongTinCaNhan.class);
                startActivity(intent);
            }
        });
    }
}
