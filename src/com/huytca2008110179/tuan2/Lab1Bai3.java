package com.huytca2008110179.tuan2;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh hình lập phương: ");
        Double canh = scanner.nextDouble();
        canh = Math.pow(canh, 3);
        System.out.printf("Thể tích hình lập phương: %.1f", canh); 
    }
}
