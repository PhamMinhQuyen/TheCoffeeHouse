package com.example.doancanhan.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancanhan.DatHang_User.DatHang_User;
import com.example.doancanhan.DangXuat.Dialog_DangXuat;
import com.example.doancanhan.Main.Main_User;
import com.example.doancanhan.R;

public class Profile_User extends AppCompatActivity {
    LinearLayout ln_ttcn_user;
    Button bt_tintuc_user,bt_dathang_user;
    TextView tv_dangxuat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_user);

        ln_ttcn_user=(LinearLayout)findViewById(R.id.ln_ttcanhan_user);
        ln_ttcn_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile_User.this, ThongTinCaNhan.class);
                startActivity(intent);
            }
        });

        bt_tintuc_user=(Button) findViewById(R.id.bt_tintuc_user);
        bt_tintuc_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile_User.this, Main_User.class);
                startActivity(intent);
            }
        });

        bt_dathang_user=(Button) findViewById(R.id.bt_dathang_user);
        bt_dathang_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile_User.this, DatHang_User.class);
                startActivity(intent);
            }
        });

        tv_dangxuat=(TextView) findViewById(R.id.bt_dangxuat);
        tv_dangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openDialog();
            }
        });

    }
    public void openDialog(){
        Dialog_DangXuat dialog_dangXuat = new Dialog_DangXuat();
        dialog_dangXuat.show(getSupportFragmentManager()," ");
    }
}
