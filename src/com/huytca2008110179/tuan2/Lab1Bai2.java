package com.huytca2008110179.tuan2;

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        Double chieudai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        Double chieurong = scanner.nextDouble();
        Double Chuvi = (chieudai + chieurong)*2;
        Double Dientich = chieudai * chieurong;
        Math.min(chieudai, chieurong);
        System.out.printf("Chu vi hình chữ nhật: %f", Chuvi);
        System.out.printf("Diện tích hình chữ nhật: %f", Dientich);

    }
}
