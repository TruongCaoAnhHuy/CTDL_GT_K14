package com.huytca2008110179.kiemtragiuakylan2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTestDrive {
    public static void main(String[] args) {
        
        Book book = new Book();
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> listBooks = new ArrayList<>(5);

        listBooks.add(new Book(1, 30, 20.000));
        listBooks.add(new Book(2, 22, 75.000));
        listBooks.add(new Book(3, 26, 68.000));
        
        int id,sl;
        double dongia;
        String color;
       // System.out.println("Size: "+listApple.size());
        
        for (Book booktest : listBooks) {
            booktest.inTT();
        }
        
        int menu;
        do{
        System.out.println("============ Menu ============");
        System.out.println("-  1. Nhập thêm sách         -");
        System.out.println("-  2. Tìm kiếm sách theo màu -");
        System.out.println("-  3. In danh sách           -");
        System.out.println("-  0. Thoát                  -");
        System.out.println("==============================");
        System.out.print("Chọn chức năng: ");
        menu = sc.nextInt();
        switch (menu){
            case 1: 
            System.out.print("Nhập số lượng sách cần thêm: ");
            int n = sc.nextInt();
            sc.nextLine();
            for(int i=0; i<n; i++){
                System.out.print("Mã số: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("Số lượng: ");
                sl = sc.nextInt();
                sc.nextLine();
                System.out.print("Đơn giá: ");
                dongia = sc.nextDouble();
                sc.nextLine();
                System.out.println();
                Book book2 = new Book(id, sl, dongia);
                listBooks.add(book2);
            }
            break;

            case 2:
            //Scanner bienNhap = new Scanner(System.in);
            System.out.print("Nhập giá cần tìm: ");
            sc.nextDouble();
            String timgia = sc.nextLine();
            System.out.println("Đơn giá: "+timgia);

            System.out.println("Thông tin sách trùng đơn giá: ");
            System.out.println();
            boolean kq = false;
            for (Book booktim : listBooks) {
                if(timgia.equals(booktim.dongia)){
                    System.out.println("Mã số: "+ booktim.id +" - Số lượng: "+ booktim.sl +" - Đơn giá"+ booktim.dongia);
                    kq = true;
                }
            }
            if(kq == false){
                System.out.println("Không tìm thấy!");
            }
            break;

            case 3:
            System.out.println("--danh sách táo--");
            for (Book bookinTT : listBooks) {
                bookinTT.inTT();
            }
            System.out.println();
            break;
        }
        }while(menu != 0);


        
    }
    
}

