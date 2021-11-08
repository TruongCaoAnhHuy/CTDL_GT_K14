package com.huytca2008110179.tuan9;


import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int mang[] = new int[]{5,6,3,4,1};
        
        System.out.println("Mảng chưa xử lý: " + Arrays.toString(mang));
        bubbleB(mang);
        System.out.println("Mảng sau khi xử lý bằng bubble: "+Arrays.toString(mang));
        sort(mang);
        System.out.println("Mảng sau khi xử lý sort: "+Arrays.toString(mang));
        

    }
    static void bubbleB(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i=0 ; i<n;i++){
            for(int j=1 ; j<(n-i) ; j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp; 
                }
            }
        }
    }

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

    int binarySearch(int arr[], int x){
        int l=0, r=arr.length-1;
        while( l<=r ){
            int m = 1+(r-l/2);
            if(arr[m] == x)
                return m;
            if(arr[m]< x)
                l=m+1;
            else
                r=m-1;
        }
        return -1;
    }
}
