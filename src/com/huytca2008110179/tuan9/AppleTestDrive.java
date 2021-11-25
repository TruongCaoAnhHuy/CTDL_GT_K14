package com.huytca2008110179.tuan9;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleTestDrive {
    public static void main(String[] args) {
        
        Apple apple1 = new Apple();
        Scanner sc = new Scanner(System.in);

        ArrayList<Apple> listApple = new ArrayList<>(5);

        listApple.add(new Apple(1, 30.0, "Do"));
        listApple.add(new Apple(2, 25.5, "Vang"));
        listApple.add(new Apple(3, 20.8, "Xanh"));
        
        int id;
        String color;
        double size;
       // System.out.println("Size: "+listApple.size());
        
       /* for (Apple apple : listApple) {
            apple.inTT();
        }*/
        
        int menu;
        do{
        System.out.println("============ Menu ============");
        System.out.println("-  1. Nhập thêm táo          -");
        System.out.println("-  2. Tìm kiếm táo theo màu  -");
        System.out.println("-  3. In danh sách táo       -");
        System.out.println("-  4. Sắp xếp danh sách táo  -");
        System.out.println("-  0. Thoát                  -");
        System.out.println("==============================");
        System.out.print("Chọn chức năng: ");
        menu = sc.nextInt();
        switch (menu){
            case 1: 
            System.out.print("Nhập số lượng táo cần thêm: ");
            int n = sc.nextInt();
            sc.nextLine();
            for(int i=0; i<n; i++){
                System.out.print("Mã số: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("Khối lượng: ");
                size = sc.nextInt();
                sc.nextLine();
                System.out.print("Màu sắc: ");
                color = sc.nextLine();
                System.out.println();
                Apple apple = new Apple(id, size, color);
                listApple.add(apple);
            }
            break;

            case 2:
            //Scanner bienNhap = new Scanner(System.in);
            System.out.print("Nhập màu cần tìm: ");
            sc.nextLine();
            String timmau = sc.nextLine();
            System.out.println("Màu: "+timmau);

            System.out.println("Thông tin táo trùng màu: ");
            System.out.println();
            boolean kq = false;
            for (Apple apple : listApple) {
                if(timmau.equals(apple.color)){
                    System.out.println("Mã số: "+ apple.id +" - Khối lượng: "+ apple.size +" - Màu sắc: "+ apple.color);
                    kq = true;
                }
            }
            if(kq == false){
                System.out.println("Không tìm thấy!");
            }
            break;

            case 3:
            System.out.println("--danh sách táo--");
            for (Apple apple : listApple) {
                apple.inTT();
            }
            System.out.println();
            break;

            case 4:
            System.out.println("ok");
            
            /*List list = Arrays.asList(listApple);
            Comparator comparator = new Comparator<Apple>() {

                @Override
                public int compare(Apple o1, Apple o2) {
                    return Integer.compare(o1.size, o2.size);
                }
            };
            list.sort(comparator);*/
            
            System.out.println("--danh sách đã được sắp xếp--");
            for (Apple apple : listApple) {
                apple.inTT();                
            }
            System.out.println();
            break;

        }
        }while(menu != 0);


        
    }
    
}
