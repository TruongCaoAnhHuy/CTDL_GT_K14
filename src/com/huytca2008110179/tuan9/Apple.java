package com.huytca2008110179.tuan9;

public class Apple {
    public String color;
    public int id, size;

    public Apple(){ }
    public Apple(int id, int size, String color){
        this.id=id;
        this.size=size;
        this.color=color;
    }

    public void inTT(){
        System.out.println("Mã số: "+ id +" - Khối lượng: "+ size +" - Màu sắc: "+ color);

    }
}
    
