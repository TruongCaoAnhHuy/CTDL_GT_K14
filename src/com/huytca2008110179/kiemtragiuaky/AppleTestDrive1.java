package com.huytca2008110179.kiemtragiuaky;

import java.util.Scanner;

public class AppleTestDrive1 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Scanner sc = new Scanner(System.in);
        Scanner kt = new Scanner(System.in);
        int menu;
        do {
            System.out.println("|==============MENU==============|");
            System.out.println("|   1.Thêm táo vào kho độ        |");
            System.out.println("|   2.Tìm táo theo màu           |");
            System.out.println("|   3.In danh sách táo           |");
            System.out.println("|================================|");
            System.out.print("Nhập lựa chọn: ");
            menu = sc.nextInt();
            switch(menu) {
                case 1:
                    apple.Nhap();
                    break;
                case 2:
                    System.out.println();
                    apple.Xuat();
                    break;
                case 3:
                    System.out.println("Nhập màu: ");
                    String color = kt.nextLine();
                    System.out.println("Kết quả tìm kiếm: ");
                    apple.timkiem(color);
                    break;
            }
        } while (menu != 0);  
    }
    
}
