package com.example.doancanhan.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doancanhan.Main.Main_User;
import com.example.doancanhan.R;

public class ThongTinCaNhan  extends AppCompatActivity {
    TextView tv_doi,tv_ttcanhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thongtincanhan);

        tv_doi=(TextView)findViewById(R.id.tv_doi);
        tv_doi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThongTinCaNhan.this, SuaThongTin.class);
                startActivity(intent);
            }
        });

        tv_ttcanhan=(TextView)findViewById(R.id.tv_ttcanhan);
        tv_ttcanhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThongTinCaNhan.this, Main_User.class);
                startActivity(intent);
            }
        });
    }
}
