package com.example.doancanhan.DangNhap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancanhan.Main.MainActivity;
import com.example.doancanhan.Main.Main_User;
import com.example.doancanhan.R;

public class DN_SoDienThoai  extends AppCompatActivity {
    TextView tv_boqua,tv_ve;
    Button bt_tieptuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dn_sodienthoai);

        tv_boqua=(TextView)findViewById(R.id.tv_boqua);
        tv_boqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DN_SoDienThoai.this, MainActivity.class);
                startActivity(intent);
            }
        });

        tv_ve=(TextView)findViewById(R.id.tv_ve_sdt);
        tv_ve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DN_SoDienThoai.this, DangNhap.class);
                startActivity(intent);
            }
        });

        bt_tieptuc=(Button) findViewById(R.id.bt_tieptuc);
        bt_tieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DN_SoDienThoai.this, Main_User.class);
                startActivity(intent);
            }
        });
    }
}
