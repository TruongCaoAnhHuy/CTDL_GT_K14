package com.huytca2008110179.tuan2;

import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sodien, tiendien;
        System.out.print("Số điện tiêu thụ: ");
        sodien = scanner.nextDouble();
        if(sodien <= 50){
            tiendien = sodien * 1000;
            System.out.printf("Tiền điện của tháng: tiendien = %.1f", tiendien);

        }else{
            tiendien = (50*1000) + ((sodien-50) * 1200 );
            System.out.printf("Tiền điện của tháng: tiendien = %.1f", tiendien);
        }
    }
}
