package com.huytca2008110179.kiemtracuoiky;

import java.util.Scanner;
import java.util.ArrayList;


public class CommodityFunction {
    Commodity commodity = new Commodity();
    Scanner sc = new Scanner(System.in);
    ArrayList<Commodity> list = new ArrayList<>();

    public void readyList(){
        list.add(new Commodity("A01", 15, "Dien thoai", "Dien may", 3650000, commodity.setNSX(2018, 8, 9)));
        list.add(new Commodity("A02", 20, "Thit bo hop", "Thuc pham", 50000, commodity.setNSX(2021, 11, 20)));
        list.add(new Commodity("A03", 35, "Chen", "Sanh su", 30000, commodity.setNSX(2019, 3, 5)));
        list.add(new Commodity("A04", 5, "Tu lanh", "Dien may", 7200000, commodity.setNSX(2017, 8, 12)));
        list.add(new Commodity("A05", 10, "Laptop", "Dien may", 20800000, commodity.setNSX(2020, 7, 25)));
        list.add(new Commodity("B01", 30, "Binh hoa", "Sanh su", 35000000, commodity.setNSX(2008, 2, 3)));
        list.add(new Commodity("B02", 36, "Ca rot", "Thuc pham", 4000, commodity.setNSX(2021, 10, 9)));
        list.add(new Commodity("B03", 15, "Rau xa lach", "Thuc pham", 3000, commodity.setNSX(2021, 11, 18)));
        list.add(new Commodity("B04", 30, "Ly thuy tinh", "Sanh su", 245000, commodity.setNSX(2019, 7, 25)));
        list.add(new Commodity("B05", 5, "Ruou vang", "Thuc pham", 195000, commodity.setNSX(2020, 4, 6)));
        list.add(new Commodity("C01", 10, "Ipad Pro 11", "Dien may", 25900000, commodity.setNSX(2018, 6, 12)));
        list.add(new Commodity("C02", 35, "Thit heo hop", "Thuc pham", 35000, commodity.setNSX(2021, 10, 25)));
        list.add(new Commodity("C03", 15, "Smart Watch", "Dien may", 268000, commodity.setNSX(2019, 12, 8)));
        list.add(new Commodity("C04", 25, "Ca hop", "Thuc pham", 25000, commodity.setNSX(2021, 8, 27)));
        list.add(new Commodity("C05", 30, "Mi goi", "Thuc pham", 4000, commodity.setNSX(2021, 9, 3)));
        list.add(new Commodity("D01", 6, "May lanh", "Dien may", 5870000, commodity.setNSX(2009, 1, 30)));
        list.add(new Commodity("D02", 3, "Ti-vi", "Dien may", 39580000, commodity.setNSX(2015, 5, 31)));
        list.add(new Commodity("D03", 30, "Dia thuy tinh", "Sanh su", 58000, commodity.setNSX(2019, 11, 21)));
        list.add(new Commodity("D04", 10, "Sugar", "Thuc pham", 32000, commodity.setNSX(2021, 5, 28)));
        list.add(new Commodity("D05", 15, "Muong thuy tinh", "Sanh su", 25800, commodity.setNSX(2020, 12, 13)));
    }                       

    //Thêm SP
    public void add(){
        System.out.print("Số lượng sp cần thêm: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            commodity.nhapTT();
            list.add(new Commodity(commodity.id, commodity.number, commodity.name, commodity.type, commodity.price, commodity.date));
        }
        
    }

    public void fix(){

    }

    public void findPrice(){

    }

    public void findDate(){

    }
    
    public int findID(){
        System.out.print("Nhập mã cần xóa: ");
        String timID = sc.nextLine();

        int x = -1;

        //boolean kqID = false;

        for (Commodity commodityRemove : list) {
            if(timID.equalsIgnoreCase(commodityRemove.id)){
                x = list.indexOf(commodityRemove);
                //list.remove(x);
                //System.out.println("Đã xóa SP có mã hàng: "+timID);
                //kqID = true;
            }
        }
        /*if(x == 0){
            System.out.println("Không tìm thấy!!");
        }*/
        return x;
    }

    //Xóa SP
    public void remove(){
        if(findID() == -1){
            System.out.println("Không tìm thấy!!");
        }
        else{
            //System.out.println("Không tìm thấy!!");
            list.remove(findID());
            System.out.println("Đã xóa SP có mã hàng: ");
        }
    }

    public void sortPrice(){

    } 

    public void sortDate(){

    }

    public void totalCommodity(){

    }

    public void sumPrice(){

    }

    public void totalType(){

    }

    //Thống kê số lượng hàng
    public void xuatDS(){
        System.out.println("==============================================DANH SÁCH HÀNG HÓA===============================================");
        System.out.printf("%-12s %-22s %-20s %-20s %-19s %-20s","Mã hàng","Tên SP","Loại SP","Giá bán(/1sp)","Số lượng","Ngày nhập kho");
        System.out.println();
        System.out.printf("%-12s %-22s %-20s %-20s %-19s %-20s","-------","------","-------","-------------","--------","-------------");
        System.out.println();

        for (Commodity commodity : list){
            commodity.inTT();
        }
        System.out.println("===============================================================================================================");

        System.out.println("Tổng số lượng hàng hóa là: "+list.size());
        System.out.println();
        
    }

    public void findType(){
        System.out.print("Nhập loại cần tìm: ");
        String timLoai = sc.nextLine();
        System.out.println("Loại SP cần tìm: "+timLoai);
        System.out.println("===========================================DANH SÁCH HÀNG HÓA cẦN TÌM==========================================");
        System.out.printf("%-12s %-22s %-20s %-20s %-19s %-20s","Mã hàng","Tên SP","Loại SP","Giá bán(/1sp)","Số lượng","Ngày nhập kho");
        System.out.println();
        System.out.printf("%-12s %-22s %-20s %-20s %-19s %-20s","-------","------","-------","-------------","--------","-------------");
        System.out.println();
              
        boolean kq=false;

        for (Commodity commodityTimLoai : list) {
            if(timLoai.equalsIgnoreCase(commodityTimLoai.type)){
                commodityTimLoai.inTT();
                kq = true;
            }
        }
        System.out.println("===============================================================================================================");

        if(kq == false){
            System.out.println("Không tìm thấy!!");
        }
    }
}
