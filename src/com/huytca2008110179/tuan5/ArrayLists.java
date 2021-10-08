package com.huytca2008110179.tuan5;

import java.util.ArrayList;
import java.util.List;

import com.huytca2008110179.tuan4.Dog;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("Anh Huy");
        a.add(1);
        a.add(new Dog(22, "KiKi", "xám"));
        Dog dog = (Dog)a.get(2);
        System.out.println("Name: " + dog.name + ", color: "+ dog.color + ", size: " + dog.size);

        a.add(2.5);
            System.out.println(a.get(0));
        /* */
                System.out.println("----------------");
        /* */
        ArrayList<String> b = new ArrayList<>();
        b.add("Huy");
        b.add("đẹp");
        b.add("trai");

            System.out.println(b);
    }
    
}
