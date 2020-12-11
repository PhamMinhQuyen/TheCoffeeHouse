package com.example.doancanhan.Coupon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancanhan.Main.Main_User;
import com.example.doancanhan.R;

public class Coupon_User extends AppCompatActivity {
    TextView tv_close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coupon_user);

        tv_close=(TextView)findViewById(R.id.tv_close);
        tv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Coupon_User.this, Main_User.class);
                startActivity(intent);
            }
        });
    }

}
