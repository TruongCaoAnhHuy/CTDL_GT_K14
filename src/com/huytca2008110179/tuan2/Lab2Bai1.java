package com.huytca2008110179.tuan2;

import java.util.Scanner;

public class Lab2Bai1 {
    public static void main(String[] args) {
        double a, b, x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        b = scanner.nextDouble();
        if(a == 0){
            if(b == 0)
                System.out.printf("Phương trình vô số nghiệm!");

            else
                System.out.printf("PHương trình vô nghiệm!");

        }
        else{
            x = -b/a;
            System.out.printf("Phương trình có nghiệm x = %.1f", x);
        }
    }
}
