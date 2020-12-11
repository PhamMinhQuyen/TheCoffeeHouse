package com.example.doancanhan.Coupon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancanhan.DangNhap.DangNhap;
import com.example.doancanhan.Main.MainActivity;
import com.example.doancanhan.R;

public class Coupon extends AppCompatActivity {
    TextView tv_close;
    Button bt_dangnhap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coupon);

        tv_close=(TextView)findViewById(R.id.tv_close);
        tv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Coupon.this, MainActivity.class);
                startActivity(intent);
            }
        });

        bt_dangnhap=(Button) findViewById(R.id.bt_dangnhap);
        bt_dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Coupon.this, DangNhap.class);
                startActivity(intent);
            }
        });
    }
}
