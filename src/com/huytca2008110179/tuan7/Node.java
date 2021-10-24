package com.huytca2008110179.tuan7;


public class Node {
    int data;


    Node next;

    public Node(int d){
        data = d;
        next = null;
    }

    public Node(Node n, int d){
        data=d;
        next=n;
    }
    
}
