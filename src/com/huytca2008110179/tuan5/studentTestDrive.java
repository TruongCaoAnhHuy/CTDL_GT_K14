package com.huytca2008110179.tuan5;


import java.util.Scanner;

public class studentTestDrive {
        public static void main(String[] args) {
            student st = new student();
            Scanner sc = new Scanner(System.in);
            int menu;
        do {
            System.out.println("|==============MENU==============|");
            System.out.println("|   1.Nhập danh sách SV          |");
            System.out.println("|   2.In danh sách SV            |");
            System.out.println("|   3.In danh sách SV theo điểm  |");
            System.out.println("|   4.Tìm SV theo tên            |");
            System.out.println("|   5.Tìm và sửa SV theo tên     |");
            System.out.println("|   6.Tìm và xóa SV theo tên     |");
            System.out.println("|   0.Thoát                      |");
            System.out.println("|================================|");
            System.out.print("Nhap lua chon: ");
            menu = sc.nextInt();
            switch(menu) {
                case 1:
                    st.Nhap();
                    break;
                case 2:
                    st.inTTsv();
                    break;
                case 3:
                    st.SapXep();
                    break;
                case 4:
                    System.out.println("ok");
                    break;
                case 5:
                    System.out.println("ok");
                    break;
                case 6:
                    System.out.println("ok");
                    break;
            }
        } while (menu != 0);  
    }
}
    
