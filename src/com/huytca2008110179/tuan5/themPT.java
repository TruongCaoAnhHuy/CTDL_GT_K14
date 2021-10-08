package com.huytca2008110179.tuan5;

public class themPT {
    public static void main(String[] args) {
        int []arr = {3, 5, 6, 7};//tạo mảng
        int b = 4;              //tạo ptu cần thêm
        int n = arr.length;     //chiều dài mảng

        int []newArr = new int[n+1]; //tạo mảng mới

        //đổ mảng cũ vào mảng mới
        for(int i=0 ; i<n ; i++){
            newArr[i]=arr[i];
        }

        //in mảng cũ
        System.out.println("In mảng cũ");
            for(int x: arr){
                System.out.println(x);
        }
        newArr[n] = b;
        
        //in mảng mới
        System.out.println("In mảng mới");
            for(int x: newArr){
                System.out.println(x);
        }

    }
}
