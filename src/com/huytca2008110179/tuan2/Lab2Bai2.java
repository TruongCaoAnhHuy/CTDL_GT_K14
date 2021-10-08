package com.huytca2008110179.tuan2;

import java.util.Scanner;

public class Lab2Bai2 {
    public static void main(String[] args) {
        double a, b, c, x, x1, x2, delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        b = scanner.nextDouble(); 
        System.out.print("Nhập c: ");
        c = scanner.nextDouble();
        if(a == 0){
            x = -b/c;
            System.out.printf("Nghiệm phương trình bậc nhất: x=%.1f", x);
        }
      
        if(a != 0){
            delta = Math.pow(b, 2) - 4*a*c;
            if(delta < 0)
                System.out.printf("Phương tình vô nghiệm!");
            
            else if(delta == 0){
                x1=x2= -b/(2*a);
                System.out.printf("Phương trình có nghiệm kép: x1=x2= %.1f", x1=x2);
            }
        
            else if(delta > 0){
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.printf("Phương trình có 2 nghiệm phân biệt: x1= %.1f, x2= %.1f", x1, x2);
            } 
        }
    }
}
