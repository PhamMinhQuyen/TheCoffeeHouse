package com.example.doancanhan.ChiTietSP;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancanhan.Main.Main_User;
import com.example.doancanhan.R;

public class ChiTietSP_User extends AppCompatActivity {
    TextView tv_ve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chitiet_sp_user);

        tv_ve=(TextView)findViewById(R.id.tv_close);
        tv_ve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChiTietSP_User.this, Main_User.class));
            }
        });

    }
}
