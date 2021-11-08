package com.huytca2008110179.kiemtragiuakylan2;

public class BookLinkedList {
    Node head = null;
    Node tail = null;

    public BookLinkedList(){}

    public void addTail(Book data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addHead(Book data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else{
            newNode.next = head;
            tail = newNode;
            head = newNode;
        }
    }

    public void inTT(){
        Node tam = head;

        if(head == null){
            System.out.println("danh sách rỗng!");
            return;
        }
        System.out.println("--các nút trong danh sách--");

        while(tam !=null){
            System.out.println("Mã số: "+ tam.data.id +" - Số lượng: "+ tam.data.sl +" - Đơn giá: "+ tam.data.dongia +"vnđ");
            tam = tam.next;
        }

    }

    public void addAfter(Book sachCanTim,Book sachCanThem){
        int dem = 0;
        Node tam = head;
        Node truocTam = head;
        while(tam != null){
            if(tam.data.id == sachCanTim.id)
                break;
            tam = tam.next;
            dem++;
            if(dem>1)
                truocTam = truocTam.next;
            
        }
        Node them = new Node();
        them.data = sachCanThem;
        
        if(dem == 0){
            addHead(sachCanThem);
        } else {
            them.next = tam;
            truocTam.next = them;
        }
    }

    public void deleteTail(){
        Node tam = head;
        while(tam != null){
            if(tam.next == tail){
                tam.next = null;
                tail = tam;
                break;
            }
            tam = tam.next;
        }
    }
}
