package com.huytca2008110179.tuan3;

public class TaiKhoan {
    String tenchutaikhoan;
    String sotaikhoan;
    String sodu;

    TaiKhoan(String tctk, String stk, String sd){
        tenchutaikhoan = tctk;
        sotaikhoan = stk;
        sodu = sd;
    }
    
    void intThenganhang(){
        System.out.println("Tên chủ tài khoản: " + tenchutaikhoan);
        System.out.println("Số tài khoản: " + sotaikhoan);
        System.out.println("Số dư: " + sodu + " VND");
    }

}