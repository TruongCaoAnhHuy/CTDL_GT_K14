package com.huytca2008110179.tuan9;

public class HamAppleB {
    static void sort(int[] arr){
        int n =arr.length;
        for(int i=0 ; i<n ; i++){
            int key = arr[i];
            int j = i-1;
                while (j>-0 && arr[j]>key){
                    arr[j+1] = arr[j];
                    j = j -1;
                }
            arr[j+1]=key;
        }
    }
    
}
