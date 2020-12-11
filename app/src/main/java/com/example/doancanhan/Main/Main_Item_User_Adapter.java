package com.example.doancanhan.Main;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doancanhan.ChiTietSP.ChiTietSP_User;
import com.example.doancanhan.DatHang_User.DatHang_User;
import com.example.doancanhan.R;

import java.util.List;

public class Main_Item_User_Adapter extends RecyclerView.Adapter<Main_Item_User_Adapter.MyViewHolder> {
    private Context context;
    private List<Main_Item> list;

    public Main_Item_User_Adapter(Context context, List<Main_Item> list) {
        this.context = context;
        this.list = list;

    }




    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name1,name2,name3,name4,name5;
        Button bt_orderngay;
        ImageView img;
        LinearLayout ln;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name1=itemView.findViewById(R.id.name1);
            name2=itemView.findViewById(R.id.name2);
            name3=itemView.findViewById(R.id.name3);
            name4=itemView.findViewById(R.id.name4);
            name5=itemView.findViewById(R.id.name5);
            img=itemView.findViewById(R.id.img_hinhanh);
            bt_orderngay=itemView.findViewById(R.id.bt_oderngay);




        }
    }
    @NonNull
    @Override
    public Main_Item_User_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_item_main,parent,false);
        return new Main_Item_User_Adapter.MyViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull final Main_Item_User_Adapter.MyViewHolder holder, int position) {
        Main_Item main_item=list.get(position);
        holder.name1.setText(main_item.getName1());
        holder.name2.setText(main_item.getName2());
        holder.name3.setText(main_item.getName3());
        holder.name4.setText(main_item.getName4());
        holder.name5.setText(main_item.getName5());
        holder.bt_orderngay.setText(main_item.getOrder());
        holder.img.setImageResource(main_item.getImg());

        if(holder.bt_orderngay.getText()=="Order ngay"){
            holder.bt_orderngay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(context, DatHang_User.class);
                    context.startActivity(intent);
                }
            });
        }
        else{
            holder.bt_orderngay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(context, ChiTietSP_User.class);
                    context.startActivity(intent);
                }
            });
        }




        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context,ChiTietSP_User.class));
            }
        });

        holder.name1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context,ChiTietSP_User.class));
            }
        });
        holder.name2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context,ChiTietSP_User.class));
            }
        });
        holder.name3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context,ChiTietSP_User.class));
            }
        });
        holder.name4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context,ChiTietSP_User.class));
            }
        });
        holder.name5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context,ChiTietSP_User.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }



}
