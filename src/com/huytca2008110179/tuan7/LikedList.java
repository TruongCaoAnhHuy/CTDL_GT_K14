package com.huytca2008110179.tuan7;

public class LikedList {

    Node head = null;
    Node tail = null;
    public LikedList(){}

    void add(int data){
        //tao node moi
        Node newNode = new Node(data);

        if(head == null){//nếu Node rỗng
            head = newNode;
            tail = newNode;
        }
        else{//nếu Node ko rỗng dời tail xuống cuối
            tail.next = newNode;
            tail = newNode;
        }
    }

    void print(){
        Node current = head;

        if(head == null){
            System.out.println("Danh sách rỗng");
            return;
        }
        while(current != null){
            System.out.println(current.data);
            current = current.next; 
        }
    }
}
