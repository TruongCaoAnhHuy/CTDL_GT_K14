package com.huytca2008110179.tuancuoi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {
    public static void main(String[] args) throws ParseException {
        //Khai bao bien kieu ngay
        Date ngaySinh;
        String strNgaySinh = "20/11/2000";
        
        ngaySinh = chuyenChuoiSangNgay(strNgaySinh);
        System.out.println(ngaySinh);

        String str = chuyenNgaySangChuoi(ngaySinh);

        System.out.println(str);

        String currentDateString = "02/27/2012 17:00:00";
SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
Date currentDate = sd.parse(currentDateString);

String yourDateString = "02/28/2012 15:00:00";
SimpleDateFormat yourDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

Date yourDate = yourDateFormat.parse(yourDateString);

if (yourDate.after(currentDate)) {
    System.out.println("After");
} else if(yourDate.equals(currentDate)) {
    System.out.println("Same");
} else {
    System.out.println("Before");
}
        
    }

    /**đổi chuỗi (theo chuẩn ngày Việt Nam) sang ngày java */
    public static Date chuyenChuoiSangNgay(String chuoiNgay) throws ParseException{
        //ngày việt nam
        Date date;
        /**
         * dd: ngày
         * mm: tháng
         * yyyy: năm
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        date = simpleDateFormat.parse(chuoiNgay);
        return date;
    }

    //Đổi ngày Java sang kiểu ngày việt dd/mm/yyy
    public static String chuyenNgaySangChuoi(Date date){
        String chuoiNgayViet = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        chuoiNgayViet =  simpleDateFormat.format(date);
        return chuoiNgayViet;
    }

    

}
