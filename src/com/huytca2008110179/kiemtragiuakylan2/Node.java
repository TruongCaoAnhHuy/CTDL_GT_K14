package com.huytca2008110179.kiemtragiuakylan2;

public class Node {
    Book data;

    Node next;

    Node(){}

    Node(Book d){
        data = d;
    }

    Node(Book d, Node n){
        data = d;
        next = n;
    }
}
