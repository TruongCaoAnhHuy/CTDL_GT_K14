package com.huytca2008110179.tuan5;

public class Lab5Bai3 {
    String tenSP;
    double dGia, giamGia;
    float thue;

    Lab5Bai3(String tenSP, double dGia, double giamGia, float thue){
        this.tenSP = tenSP;
        this.dGia = dGia;
        this.giamGia = giamGia;
        this.thue = thue;
    }
    void inTT(){
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Đơn giá: " + dGia);
        System.out.println("Giá giảm: " + giamGia);
        System.out.println("Tiền thuế: " + thue);
    }
}
