package com.huytca2008110179.tuan4;

public class SinhVien {
    public int MSSV, tuoi;
    public String ten, queQuan;

    public SinhVien (int ms, int t, String n, String q){
        MSSV = ms;
        tuoi = t;
        ten = n;
        queQuan = q;
    }

    void inTTsv(){
        System.out.println("MSSV: " + MSSV);
        System.out.println("Họ tên: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Quê quán: " + queQuan);
    }

}
