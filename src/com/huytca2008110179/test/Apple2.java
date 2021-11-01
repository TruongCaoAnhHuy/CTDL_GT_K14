package com.huytca2008110179.test;

import java.util.Scanner;

public class Apple2 {
    int ms;
    double kl;
    String color;

    static Scanner sc = new Scanner(System.in);

    Apple2(){}

    void Nhap(){
        System.out.println("Mã số: ");
        System.out.println("Khối lượng: ");
        System.out.println("Màu sắc: ");
    }

    void inTT(){
        System.out.println("ID: "+ms+" - Khối lượng: "+kl+" - Màu sắc: "+color);
    }
    
}
