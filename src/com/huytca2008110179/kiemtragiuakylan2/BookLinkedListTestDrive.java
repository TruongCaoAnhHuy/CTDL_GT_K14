package com.huytca2008110179.kiemtragiuakylan2;

import java.util.LinkedList;
import java.util.Scanner;
public class BookLinkedListTestDrive {
    public static void main(String[] args) {
        BookLinkedList bookLinked = new BookLinkedList();

        Book book = new Book(1, 25, 25000);
        Book book1 = new Book(2, 30, 15000);
        Book book2 = new Book(3, 20, 70000);
        
        bookLinked.addHead(book);
        bookLinked.addHead(book1);
        bookLinked.addHead(book2);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách :");
        int sL = sc.nextInt();
        BookLinkedList danhSach = new BookLinkedList(); 

        danhSach.addHead(book);

        danhSach.addTail(book);

        

        System.out.println("====Danh sách sau khi thêm ====");
        danhSach.inTT();

        System.out.print("Nhập mã sách muốn thêm vào đằng trước: ");
        int vitriThem = sc.nextInt();
        //danhSach.addAfter(vitriThem);
        danhSach.inTT();

        System.out.println("Danh sách sau khi xóa cuối: ");
        danhSach.deleteTail();
        danhSach.inTT();
    }
}
