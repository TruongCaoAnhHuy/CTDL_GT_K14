package com.huytca2008110179.kiemtragiuaky;

import java.util.ArrayList;
import java.util.Scanner;

public class Apple {

    public String color;
    public int id, size;

    public Apple() {}

    public Apple(int id, int size, String color){
        id = id;
        size = size;
        color = color;

    }

   private ArrayList<Apple> appleslist = new ArrayList<>();

    void Nhap(){
        Scanner varInput = new Scanner(System.in);
        System.out.println("Số lượng táo cần nhập: ");
        int sl = varInput.nextInt();
        varInput.nextLine();
        Apple[] appleList = new Apple[sl];
        for(int i = 0 ; i < sl ; i++){
            System.out.print("Mã số: ");
            id = varInput.nextInt();
            varInput.nextLine();
            System.out.print("Khối lượng: ");
            size = varInput.nextInt();
            varInput.nextLine();
            System.out.print("Màu sắc: ");
            color = varInput.nextLine();
            appleList[i] = new Apple(id,size,color);            
        }
    }

    void inTTapple(){
        System.out.println("Mã số: "+id+" - Khối lượng: "+size+" - Màu sắc: "+color);
    }

    void Xuat(){
        System.out.println("--DS táo--");
        for (Apple apple : appleslist) {
            apple.inTTapple();
        }
    }

    public String getcolor() {
        return color;
    }
    public void setcolor(String mausac) {
        this.color = color;
    }

    void timkiem(String tensp) {
        for (Apple apple : appleslist) {
            
                if(apple.getcolor().indexOf(tensp)>=0) {
                System.out.println(apple);
            }
        }
    }

}
