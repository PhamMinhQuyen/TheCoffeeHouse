package com.example.doancanhan.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancanhan.DangNhap.DangNhap;
import com.example.doancanhan.Main.MainActivity;
import com.example.doancanhan.R;

public class Profile extends AppCompatActivity {
    TextView tv_dangnhap;
    Button bt_tintuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        tv_dangnhap=(TextView)findViewById(R.id.tv_dangnhap);
        tv_dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, DangNhap.class);
                startActivity(intent);
            }
        });

        bt_tintuc=(Button) findViewById(R.id.bt_tintuc);
        bt_tintuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
