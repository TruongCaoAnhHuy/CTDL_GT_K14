package com.huytca2008110179.tuan1;

public class Lab1 {
    String tenchuxe;
    String hangsanxuat;
    String dong;
    String giayphep;
    String dungtichxang;

    Car(String tcx, String hsx, String d, String gp, String dtx){
        tenchuxe = tcx;
        hangsanxuat = hsx;
        dong = d;
        giayphep = gp;
        dungtichxang = dtx;
    }

    void inCar(){
        System.out.println("Tên chủ xe: " + tenchuxe);
        System.out.println("Hãng sản xuất: " + hangsanxuat);
        System.out.println("Dòng xe: " + dong);
        System.out.println("Giấy phép: " + giayphep);
        System.out.println("Dung tích bình xăng: " + dungtichxang);
        
    }
}
}
