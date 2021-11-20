package com.huytca2008110179.kiemtracuoiky;

import java.util.Calendar;
import java.util.Scanner;

public class CommodityTestDrive {
    public static void main(String[] args) {
        
        Commodity commodity = new Commodity();
        CommodityFunction cf = new CommodityFunction();
        Scanner sc = new Scanner(System.in);
        
        cf.list.add(new Commodity(1, 25, "dien thoai", "dien may", 6800000, ));
        /*cf.list.add(new Commodity(1, 25, "dien thoai", "dien may", 6900000, null));
        cf.list.add(new Commodity(1, 25, "dien thoai", "dien may", 6900000, null));
        cf.list.add(new Commodity(1, 25, "dien thoai", "dien may", 6900000, null));*/

        //cf.readyList();
        //cf.xuatDS();

        int menu;
        do{
            System.out.println("=================== Menu ====================");
            System.out.println("- 1.  Nhập thêm sản phẩm                    -");
            System.out.println("- 2.  Sửa sản phẩm                          -");
            System.out.println("- 3.  Xóa sản phẩm                          -");
            System.out.println("- 4.  Tìm kiếm sản phẩm theo loại           -");
            System.out.println("- 5.  Tìm kiếm sản phẩm theo giá            -");
            System.out.println("- 6.  Tìm kiếm sản phẩm theo ngày           -");
            System.out.println("- 7.  Sắp xếp theo giá                      -");
            System.out.println("- 8.  Sắp xếp theo ngày                     -");
            System.out.println("- 9.  Thống kê tổng số hàng hóa             -");
            System.out.println("- 10. Thống kê giá trị nhập kho             -");
            System.out.println("- 11. Thống kê số lượng từng loại hàng hóa  -");
            System.out.println("- 0.  Thoát                                 -");
            System.out.println("=============================================");
            System.out.print("Chọn chức năng: ");
            menu = sc.nextInt();
            switch (menu){
                case 1:
                    cf.add();
                    break;
                case 2:
                    cf.fix();
                    break;
                case 3:
                    cf.remove();
                    break;
                case 4:
                    cf.findType();
                    break;
                case 5:
                    cf.findPrice();
                    break;
                case 6:
                    cf.findType();
                    break;
                case 7:
                    cf.sortPrice();
                    break;
                case 8:
                    cf.sortDate();
                    break;
                case 9:
                    cf.xuatDS();
                    break;
                case 10:
                    System.out.println(cf.list.size());
                    break;
                case 11:
                    cf.totalType();
                    break;
            }            
        }while (menu !=0);
    }
    
}
