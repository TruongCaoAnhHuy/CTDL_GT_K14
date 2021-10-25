package com.huytca2008110179.tuan8;

import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Welcom");
        stack.push("to");
        stack.push("Data Structure and Algotithm");

        System.out.println(stack);
        
        //xóa phần tử
        String poped = stack.pop();
        System.out.println("Đã lấy phần tử từ stack: " + poped);

        System.out.print("Danh sách phần tử còn lại của stack: ");
        System.out.println(stack);
    
}
    
}
