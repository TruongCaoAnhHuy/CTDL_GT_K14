package com.huytca2008110179.tuan2;

public class Lab2 {
    String nhasanxuat;
    String namsanxuat;
    String hedieuhanh;
    String ram;
    String CPU;
    String gia;
    String nambaohanh;

    Computer(String nsx, String nx, String hdh, String r, String CU, String g, String nbh){
        nhasanxuat = nsx;
        namsanxuat = nx;
        hedieuhanh = hdh;
        ram = r;
        CPU = CU;
        gia = g;
        nambaohanh = nbh;
    }
    
    void inTtinmaytinh(){
        System.out.println("Nhà sản xuất: " + nhasanxuat);
        System.out.println("Năm sản xuất: " + namsanxuat);
        System.out.println("Hệ điều hành: " + hedieuhanh);
        System.out.println("Ram: " + ram);
        System.out.println("CPU: " + CPU);
        System.out.println("Giá: " + gia);
        System.out.println("Năm bảo hành: " + nambaohanh);
    }  
}
