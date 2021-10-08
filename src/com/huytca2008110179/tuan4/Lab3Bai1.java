package com.huytca2008110179.tuan4;

import java.util.Scanner;

public class Lab3Bai1 {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);
        boolean ok = true;
        System.out.print("Nhập vào số cần kiểm tra: ");
        int N = bienNhap.nextInt();
        for(int i = 2; i <= N-1; i++){
            if(N % i == 0){
                ok = false;
                break;
            }
        
        }
        if( ok == true){
            System.out.println("Là số nguyên tố ");
        }
        else
        System.out.println("Không phải là số nguyên tố ");
    }
}
