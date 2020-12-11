package com.example.doancanhan.TimKiemSP;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancanhan.DatHang.DatHang;
import com.example.doancanhan.R;

public class TimKiemSanPham  extends AppCompatActivity {
    TextView tv_trove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timkiemsp);

        tv_trove=(TextView) findViewById(R.id.tv_trove);
        tv_trove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TimKiemSanPham.this, DatHang.class);
                startActivity(intent);
            }
        });
    }
}
