package com.huytca2008110179.tuan3;

public class Book {
    String nhaxuatban;
    Integer namxuatban;
    double giaban;
    double soluong;
    String loai;
    Book(String nb, Integer xb, double gb, double sl, String l ){
        nhaxuatban = nb;
        namxuatban = xb;
        giaban = gb;
        soluong = sl;
        loai = l;
    }
    void insach(){
        System.out.println("Nhà xuất bản: " + nhaxuatban);
        System.out.println("Năm xuất bản: " + namxuatban);
        System.out.println("Giá bán: " + giaban);
        System.out.println("Số lượng: " + soluong);
        System.out.println("Loại sách:" + loai);
    }
}