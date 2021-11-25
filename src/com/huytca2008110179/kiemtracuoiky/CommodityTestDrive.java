package com.huytca2008110179.kiemtracuoiky;

import java.util.Scanner;

public class CommodityTestDrive {
    public static void main(String[] args) {
        
        Commodity commodity = new Commodity();
        CommodityFunction cf = new CommodityFunction();
        Scanner sc = new Scanner(System.in);

        cf.readyList();
        
        int menu;
        do{
            System.out.println("=================== Menu ====================");
            System.out.println("- 1.  Nhập thêm sản phẩm (r)                    -");
            System.out.println("- 2.  Xóa sản phẩm (r)                          -");
            System.out.println("- 3.  Sửa sản phẩm                          -");
            System.out.println("- 4.  Tìm kiếm sản phẩm theo loại (r)          -");
            System.out.println("- 5.  Tìm kiếm sản phẩm theo giá            -");
            System.out.println("- 6.  Tìm kiếm sản phẩm theo ngày           -");
            System.out.println("- 7.  Sắp xếp theo giá                      -");
            System.out.println("- 8.  Sắp xếp theo ngày                     -");
            System.out.println("- 9.  Thống kê tổng số hàng hóa (r)            -");
            System.out.println("- 10. Thống kê giá trị nhập kho             -");
            System.out.println("- 11. Thống kê số lượng từng loại hàng hóa  -");
            System.out.println("- 0.  Thoát                                 -");
            System.out.println("=============================================");
            System.out.print("Chọn chức năng: ");
            menu = sc.nextInt();
            //System.out.println();
            switch (menu){
                case 1:
                    cf.add();
                    break;
                case 2:
                    cf.remove();
                    break;
                case 3:
                    cf.fix();
                    break;
                case 4:
                    cf.findType();
                    break;
                case 5:
                    cf.findPrice();
                    break;
                case 6:
                    cf.findDate();
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
                    cf.sumPrice();
                    break;
                case 11:
                    cf.totalType();
                    break;
            }            
        }while (menu !=0);
    }
    
}
