package com.huytca2008110179.tuan3;

public class NhanVien {
    String tennhanvien;
    String diachi;
    String bophanlmviec;
    String ngaysinh;
    String luong;

    NhanVien(String tnv, String dc, String bplv, String ns, String l){
        tennhanvien = tnv;
        diachi = dc;
        bophanlmviec = bplv;
        ngaysinh = ns;
        luong = l;
    }

    void inNhanvien(){
        System.out.println("Tên nhân viên: " + tennhanvien);
        System.out.println("Địa chỉ: " + diachi);
        System.out.println("Bộ phận làm việc: " + bophanlmviec);
        System.out.println("Ngày sinh: " + ngaysinh);
        System.out.println("Lương tháng: " + luong +" VND");
    }

}
