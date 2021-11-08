package com.huytca2008110179.kiemtragiuakylan2;

public class Book {
    public int id, sl;
    public double dongia;
    
    

    public Book() {}

    public Book(int id, int sl, double dongia){
        this.id = id;
        this.sl = sl;
        this.dongia = dongia;
    }
    
    public void inTT() {
        System.out.println("Mã số: "+ id +" - Số lượng: "+ sl +" - Đơn giá: "+ dongia +"vnđ");

    }
    
}

