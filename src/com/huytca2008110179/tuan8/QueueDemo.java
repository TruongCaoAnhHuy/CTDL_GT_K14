package com.huytca2008110179.tuan8;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue;

        queue = new LinkedList<>();

        queue.add(8);
        queue.add(10);
        queue.add(2);

        System.out.println(queue);

        //lấy 1 phần tử trong queue - lấy đầu
        int ptuLayduoc = queue.remove();
        System.out.println("Phần tử được lấy ra từ queue: "+ptuLayduoc);
        System.out.println("Phần tử còn lại: ");
        System.out.println(queue);
        
        //thăm 1 ptu queue - ko lấy ra
        int ptuThamduoc = queue.peek();
        System.out.println("Phần tử vừa thăm: "+ptuThamduoc);
        System.out.println("Phần tử còn lại sau khi thăm: ");
        System.out.println(queue);



        //cài đặt Linked List

    }
}
