package com.huytca2008110179.tuan3;

public class ComputerTestDrive {
    public static void main(String[] args) {
        Computer computer;
        
        computer = new Computer("Dell", "2020", "Window 10", "8GB", "Intel Core i5", "20.000.000", "1 năm");

        computer.inTtinmaytinh();

        System.out.println("--------------------");
        
    }
}
