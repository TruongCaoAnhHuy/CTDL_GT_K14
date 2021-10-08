package com.huytca2008110179.tuan4;

public class Dog {
    public String name, color;
    public int size;

    public Dog(int s, String n, String c){
        size = s;
        name = n;
        color = c;
    }

    void inTTdog(){
        System.out.println("Size: " + size + " - " + "color: " + color + " - " + "name: " + name);
    }

}
