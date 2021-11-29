package com.huytca2008110179.kiemtracuoiky;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Commodity {

    int number;
    String id, type, name;
    double price;
    Date date;

    //SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
    Scanner sc = new Scanner(System.in);
    
    public Commodity(){}

    public Commodity(String id, int number, String name){
        this.id = id;
        this.number = number;
        this.name = name;
    }

    public Commodity(String id, int number,String name, String type, double price, Date date){
        this.id = id;
        this.number = number;
        this.name = name;
        this.type = type;
        this.price = price;
        this.date = date;
    }

    public String getID() {
        return id;
    }
 
    public void setID(String id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
 
    public Date getDate() {
        return date;
    }
 
    public void setnSX(Date date) {
        this.date = date;
    }

    public Date setNSX(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.date = calendar.getTime();
        return date;
    }
    
    public void nhapTT(){
        System.out.print("Mã hàng:");
        id = sc.nextLine();
        System.out.print("Tên SP: ");
        name = sc.nextLine();
        System.out.print("Loại SP: ");
        type = sc.nextLine();
        System.out.print("Giá bán: ");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Số lượng: ");
        number = sc.nextInt();
        sc.nextLine();
        System.out.print("Năm, tháng, ngày nhập hàng (tách nhau bằng dấu cách): ");
        setNSX(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    public boolean kiemTraTenHang(boolean k) {
        if (this.id == "" || this.id.isEmpty()) {
            System.out.println("Tên hàng không được để trống : ");
        } else {
            k = false;
        }
        return k;
    }
    public void inTT(){
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String str = numberFormat.format(price);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String str1 = simpleDateFormat.format(date);
        
        System.out.printf("%-12s %-22s %-20s %-23s %-19.2s %-26s",id,name,type,str,number,str1);
        System.out.println();


    }
}