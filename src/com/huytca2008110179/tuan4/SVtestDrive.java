package com.huytca2008110179.tuan4;

import java.util.Scanner;

public class SVtestDrive {
    public static void main(String[] args) {
        SinhVien[] dsSinhVien = new SinhVien[2];

        Scanner varInput = new Scanner(System.in);

        System.out.println("Nhập vào số sinh viên: ");

        for(int i=0 ; i < dsSinhVien.length ; i++){
            System.out.println("Sinh viên thứ: " +(i+1));
            System.out.print("MSSV: ");
            int ms = varInput.nextInt();
            varInput.nextLine();
            System.out.print("Họ tên: ");
            String n = varInput.nextLine();
            System.out.print("Tuoi: ");
            int t = varInput.nextInt();
            varInput.nextLine();
            System.out.print("Quê quán: ");
            String q = varInput.nextLine();
            dsSinhVien[i] = new SinhVien(ms, t, n, q);
        }

        System.out.println("---In DS sv---");
        for(SinhVien sVien : dsSinhVien){

            sVien.inTTsv();

        }

    }
    
}
