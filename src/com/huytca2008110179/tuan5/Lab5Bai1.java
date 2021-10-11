package com.huytca2008110179.tuan5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5Bai1 {
    public static void main(String[] args) {
        ArrayList<Double> arrDouble = new ArrayList<>();
        arrDouble = Nhap();
        Xuat(arrDouble);
    }
    public static ArrayList<Double> Nhap(){
        ArrayList<Double> arrDouble = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Nhập số thực: ");
            Double x = scanner.nextDouble();
            arrDouble.add(x);
            scanner.nextLine();
            System.out.print("Tiếp tục nhập (y / n) ? ");
            if(scanner.nextLine().equals("n")){
                break;
            }
        }
        return arrDouble;
    }
    public static void Xuat(ArrayList<Double> arrDouble){
        System.out.println("Các giá trị của mảng: ");
        double tong = 0;
        for (Double d : arrDouble) {
            System.out.print(d +"\t");
            tong = tong + d;    
        }
        System.out.println("Tổng của mảng: " + tong);
    }

    
}
