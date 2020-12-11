package com.example.doancanhan.ThongBao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancanhan.DangXuat.Dialog_DangXuat;
import com.example.doancanhan.Main.MainActivity;
import com.example.doancanhan.R;

public class ThongBao extends AppCompatActivity {

    TextView tv_close,tv_menu_tb;
    Button bt_thongbao;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thongbao);

        tv_close=(TextView)findViewById(R.id.tv_close);
        tv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThongBao.this, MainActivity.class));
            }
        });

        bt_thongbao=(Button) findViewById(R.id.bt_thongbao);
        bt_thongbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThongBao.this, MainActivity.class));
            }
        });

        tv_menu_tb=(TextView) findViewById(R.id.tv_menu);
        tv_menu_tb.setOnClickListener(new View.OnClickListener() {
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
