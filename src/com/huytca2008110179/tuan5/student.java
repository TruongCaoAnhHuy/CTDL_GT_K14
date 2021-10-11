package com.huytca2008110179.tuan5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class student {
    private ArrayList<student> studentlist = new ArrayList<>();

    int MSSV;
    String ten;
    Double diem;

    public student (int ms, String name, Double dtb){
        MSSV = ms;
        ten = name;
        diem = dtb;
    }
    public int getMS(){
        return MSSV;
    }
    public String getName(){
        return ten;
    }
    public Double getDiem(){
        return diem;
    }

    public student() {
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        int n;
        Scanner varInput = new Scanner(System.in);
        System.out.print("Nhập vào số sinh viên: ");
        n = sc.nextInt();
        student[] studentlist = new student[n];

        for(int i=0 ; i < studentlist.length ; i++){
            System.out.println("Sinh viên thứ: " +(i+1));
            System.out.print("MSSV: ");
            int ms = varInput.nextInt();
            varInput.nextLine();
            System.out.print("Họ tên: ");
            String name = varInput.nextLine();
            System.out.print("Điểm: ");
            Double diem = varInput.nextDouble();
            varInput.nextLine();
            studentlist[i] = new student(ms, name, diem);           
        }
    }
    public void inTTsv(student stu){
        System.out.println("MSSV: " + stu.MSSV);
        System.out.println("Họ tên: " + stu.ten);
        System.out.println("Điểm: " + stu.diem);
        System.out.println(" ");
    }
    public void Xuat(){
        System.out.println("---In DS sv---");
        for(student stu : studentlist){
            stu.inTTsv(stu);
        } 
    }
    public void SapXep(){
        List list = Arrays.asList(studentlist); 
        Comparator comparator = new Comparator<student>(){

            @Override
            public int compare(student o1, student o2) {
                return Double.compare(o1.diem, o2.diem);
            }
        };
        
        list.sort(comparator);

        System.out.println("---In DS sv theo diem---");
        for(student stu : studentlist){
            stu.inTTsv(stu);
        }  
    }
}
