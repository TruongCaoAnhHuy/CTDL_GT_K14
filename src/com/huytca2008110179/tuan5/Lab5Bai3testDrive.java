package com.huytca2008110179.tuan5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab5Bai3testDrive {
    public static void main(String[] args) {
        List<Lab5Bai3> dsSP;
        dsSP = new ArrayList<>();
    }
    
    void Nhap(){

    }

    void Xuat(List<Lab5Bai3>dsSP){
        for(Lab5Bai3 sP : dsSP){
            sP.inTT();
        }
    }

    void SapXep(List<Lab5Bai3>dsSP){
        Comparator<Lab5Bai3> comp;
        comp = new Comparator<Lab5Bai3>(){

            @Override
            public int compare(Lab5Bai3 o1, Lab5Bai3 o2){
                return Double.compare(o1.dGia, o2.dGia);
            } 
        };  

        Collections.sort(dsSP, comp);
    }

    //hàm
    static Lab5Bai3 timSPTheoten(List<Lab5Bai3> dsSP, String tenSP){
        Lab5Bai3 result = null;
            for(Lab5Bai3 sanPham : dsSP){
                if(sanPham.tenSP.equals(tenSP)){
                    result=sanPham;
                }
            }
            return result;
    }

    static void xoaSP(List<Lab5Bai3> dsSP, String tenSP){

        Lab5Bai3 sanPham = timSPTheoten(dsSP, tenSP);
        dsSP.remove(sanPham);
    }
}
