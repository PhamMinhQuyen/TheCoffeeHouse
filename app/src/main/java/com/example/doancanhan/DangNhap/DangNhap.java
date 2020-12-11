package com.example.doancanhan.DangNhap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancanhan.Main.MainActivity;
import com.example.doancanhan.R;

public class DangNhap extends AppCompatActivity {
    TextView tv_sdt,tv_boqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangnhap);

        tv_sdt=(TextView) findViewById(R.id.tv_sdt);
        tv_sdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangNhap.this, DN_SoDienThoai.class);
                startActivity(intent);
            }
        });

        tv_boqua=(TextView) findViewById(R.id.tv_boqua);
        tv_boqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangNhap.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
