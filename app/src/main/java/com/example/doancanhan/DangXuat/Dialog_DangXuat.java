package com.example.doancanhan.DangXuat;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.example.doancanhan.Profile.Profile;
import com.example.doancanhan.R;

public class Dialog_DangXuat extends AppCompatDialogFragment {

    private TextView tv_thongbao;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view =inflater.inflate(R.layout.dialog_dangxuat,null);

        builder.setView(view);
        builder.setTitle("Xác nhận");
        builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {

               getActivity().startActivity(new Intent(getContext(), Profile.class));

            }
        }).setNegativeButton("Hủy bỏ ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //code cho button ko
            }
        });


        tv_thongbao = view.findViewById(R.id.tv_dangxuat);
        return builder.create();
    }
}
