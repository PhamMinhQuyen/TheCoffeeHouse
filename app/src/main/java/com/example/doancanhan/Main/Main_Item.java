package com.example.doancanhan.Main;

import android.widget.LinearLayout;

public class Main_Item  {
    int img;
    String name1;
    String name2;
    String name3;
    String name4;
    String name5;
    String order;



    public Main_Item(int img, String name1, String name2, String name3, String name4, String name5, String order) {
        this.img = img;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.name5 = name5;
        this.order = order;

    }

    public int getImg() {
        return img;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public String getName3() {
        return name3;
    }

    public String getName4() {
        return name4;
    }

    public String getName5() {
        return name5;
    }

    public String getOrder() {
        return order;
    }


}
