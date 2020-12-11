package com.example.doancanhan.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.doancanhan.Coupon.Coupon;
import com.example.doancanhan.CH_UuDai.CuaHang_UuDai;
import com.example.doancanhan.DangNhap.DangNhap;
import com.example.doancanhan.DatHang.DatHang;
import com.example.doancanhan.Profile.Profile;
import com.example.doancanhan.R;
import com.example.doancanhan.ThongBao.ThongBao;
import com.example.doancanhan.TichDiem.TichDiem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView list1,list2,list3;
    List<Main_Item> list_main1,list_main2,list_main3;
    Button bt_dangnhap,bt_taikhoan,bt_dathang,bt_tichdiem,bt_dathang_banner;
    Button bt_coupon,bt_uudai,order;
    TextView menu,menu1,thongbao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu=(TextView)findViewById(R.id.menu);
        registerForContextMenu(menu);
        menu1=(TextView)findViewById(R.id.menu1);
        registerForContextMenu(menu1);


        list1=findViewById(R.id.list1);
        list2=findViewById(R.id.list2);
        list3=findViewById(R.id.list3);

        list_main1=new ArrayList<>();
        list_main2=new ArrayList<>();
        list_main3=new ArrayList<>();



        list_main1.add(new Main_Item(R.drawable.im1,"Mua 4 Tặng 2-Ăn bánh","uống trà, kể chuyện Thanh..","Nhập THANHXUAN,Nhà mời","ngay ưu đãi MUA 4 TẶNG 2 để","cả team chúng mình thoải mái...","Order ngay"));
        list_main1.add(new Main_Item(R.drawable.dong,"Thoải mái ăn vặt giá chỉ","1.000đ","Team ăn vặt nhanh mở","app để chọn ngay 1 ly nước","yêu thích,kèm theo Snack...","Order ngay"));
        list_main1.add(new Main_Item(R.drawable.hotdeal,"Hot deal tháng 11 không","thể bỏ qa","Tháng 11 này,Nhà gửi đến bạn","những chương trình ưu đãi đặc","biệt không thể ngó lơ","Chi tiết"));
        list_main1.add(new Main_Item(R.drawable.mua2tang1,"Team Hà Nội gọi combo trà","mát,Nhà tặng ngay ly xịn sò","Nhận ngay ly nhựa 2 lớp","xin sò phiên bản Nắng Vàng","(Qủa Dứa) và Biển Xanh(Con...","Chi tiết"));
        list_main1.add(new Main_Item(R.drawable.giam,"Nhà mời 50%,PICKUP nha","PICKUP-Chủ động đến lấy,","không chờ đợi.Trải nghiệm","ngay tính năng mới với ưu đãi...","","Order ngay"));
        list_main1.add(new Main_Item(R.drawable.capbennha,"Loạt Deal Xịn Sò Cập Bến","Nhà, Đổi Ngay Thôi","Ngày hội đổi BEAN lớn nhất","năm","Deal siêu xịn sò vẫy gọi...","Chi tiết"));
        list_main1.add(new Main_Item(R.drawable.loinho,"Lối nhỏ Nhà giao,bao xa","cũng tới","Work from house hay học","online có thèm uống gì thì cứ","gọi Nhà nha.Shipper Nhà ...","Chi tiết"));

        list_main2.add(new Main_Item(R.drawable.im1,"Mua 4 Tặng 2-Ăn bánh","uống trà, kể chuyện Thanh..","Nhập THANHXUAN,Nhà mời","ngay ưu đãi MUA 4 TẶNG 2 để","cả team chúng mình thoải mái...","Order ngay"));
        list_main2.add(new Main_Item(R.drawable.dong,"Thoải mái ăn vặt giá chỉ","1.000đ","Team ăn vặt nhanh mở","app để chọn ngay 1 ly nước","yêu thích,kèm theo Snack...","Order ngay"));
        list_main2.add(new Main_Item(R.drawable.hotdeal,"Hot deal tháng 11 không","thể bỏ qa","Tháng 11 này,Nhà gửi đến bạn","những chương trình ưu đãi đặc","biệt không thể ngó lơ","Chi tiết"));
        list_main2.add(new Main_Item(R.drawable.mua2tang1,"Team Hà Nội gọi combo trà","mát,Nhà tặng ngay ly xịn sò","Nhận ngay ly nhựa 2 lớp","xin sò phiên bản Nắng Vàng","(Qủa Dứa) và Biển Xanh(Con...","Chi tiết"));
        list_main2.add(new Main_Item(R.drawable.giam,"Nhà mời 50%,PICKUP nha","PICKUP-Chủ động đến lấy,","không chờ đợi.Trải nghiệm","ngay tính năng mới với ưu đãi...","","Order ngay"));
        list_main2.add(new Main_Item(R.drawable.capbennha,"Loạt Deal Xịn Sò Cập Bến","Nhà, Đổi Ngay Thôi","Ngày hội đổi BEAN lớn nhất","năm","Deal siêu xịn sò vẫy gọi...","Chi tiết"));
        list_main2.add(new Main_Item(R.drawable.loinho,"Lối nhỏ Nhà giao,bao xa","cũng tới","Work from house hay học","online có thèm uống gì thì cứ","gọi Nhà nha.Shipper Nhà ...","Chi tiết"));

        list_main3.add(new Main_Item(R.drawable.bsndt,"Bản Sắc Nơi Đất Trồng, Một","Hành Trình Tìm Về Nguyên..","Cùng Nhà bắt đầu hành trình","đầu tiên cùng Travel blogger","Nhị Đặng lên đường cà phê.. ","Chi tiết"));
        list_main3.add(new Main_Item(R.drawable.hvcfmtn,"Hương vị Cà phê mới tại Nhà","Signature","Nhà Signature-nơi những","hương vị nguyên bản tạo nên","trải nghiệm khác biệt. Tháng..","Chi tiết"));
        list_main3.add(new Main_Item(R.drawable.khacbiet,"Cảm ơn bạn, vì đã luôn là 1 bản nguyên khác biệt...","ản nguyên khác biệt...","Tạo khác biệt từ chất nguyên","bản Thươc phim Khác Biệt","dưới đây là món quà được..","Chi tiết"));
        list_main3.add(new Main_Item(R.drawable.tonic,"Lối nhỏ Nhà giao,bao xa","cũng tới","Work from house hay học","online có thèm uống gì thì cứ","gọi Nhà nha.Shipper Nhà ...","Chi tiết"));
        list_main3.add(new Main_Item(R.drawable.handbrew,"Cảm ơn bạn, vì đã luôn là 1 bản nguyên khác biệt...","ản nguyên khác biệt...","Tạo khác biệt từ chất nguyên","bản Thươc phim Khác Biệt","dưới đây là món quà được..","Chi tiết"));
        list_main3.add(new Main_Item(R.drawable.namhv,"Lối nhỏ Nhà giao,bao xa","cũng tới","Work from house hay học","online có thèm uống gì thì cứ","gọi Nhà nha.Shipper Nhà ...","Chi tiết"));


        LinearLayoutManager manager1 = new LinearLayoutManager(this);
        manager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        list1.setLayoutManager(manager1);

        LinearLayoutManager manager2 = new LinearLayoutManager(this);
        manager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        list2.setLayoutManager(manager2);

        LinearLayoutManager manager3 = new LinearLayoutManager(this);
        manager3.setOrientation(LinearLayoutManager.HORIZONTAL);
        list3.setLayoutManager(manager3);

        Main_Item_Adapter adapter1 =new Main_Item_Adapter(this,list_main1);
        list1.setAdapter(adapter1);

        Main_Item_Adapter adapter2 =new Main_Item_Adapter(this,list_main2);
        list2.setAdapter(adapter2);

        Main_Item_Adapter adapter3 =new Main_Item_Adapter(this,list_main3);
        list3.setAdapter(adapter3);


        bt_dangnhap=(Button)findViewById(R.id.bt_dn);
        bt_dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DangNhap.class);
                startActivity(intent);
            }
        });

        bt_taikhoan=(Button)findViewById(R.id.bt_taikhoan);
        bt_taikhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
            }
        });

        bt_dathang=(Button)findViewById(R.id.bt_dathang);
        bt_dathang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDatHang();
            }
        });


        bt_dathang_banner=(Button)findViewById(R.id.bt_dathang_banner);
        bt_dathang_banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDatHang();
            }
        });

        bt_tichdiem=(Button)findViewById(R.id.bt_tichdiem);
        bt_tichdiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TichDiem.class);
                startActivity(intent);
            }
        });

        bt_coupon=(Button)findViewById(R.id.coupun);
        bt_coupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Coupon.class);
                startActivity(intent);
            }
        });

        thongbao=(TextView) findViewById(R.id.thongbao);
        thongbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThongBao.class);
                startActivity(intent);
            }
        });

        bt_uudai=(Button)findViewById(R.id.bt_uudai);
        bt_uudai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CuaHang_UuDai.class);
                startActivity(intent);
            }
        });

//        order=(Button)findViewById(R.id.bt_oderngay);
//        order.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,DatHang.class);
//                startActivity(intent);
//            }
//        });


//
//        bt_dialog_dh=(Button) findViewById(R.id.bt_dathang);
//        bt_dialog_dh.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openDialog();
//            }
//        });


    }

    public void OpenDatHang(){
        Intent intent = new Intent(MainActivity.this, DatHang.class);
        startActivity(intent);
    }

//    public void openDialog() {
//        Dialog_DatHang dialog_datHang = new Dialog_DatHang();
//        dialog_datHang.show(getSupportFragmentManager()," ");
//    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater =getMenuInflater();
       // menu.setHeaderTitle("Menu context");
        inflater.inflate(R.menu.menu,menu);
    }

}