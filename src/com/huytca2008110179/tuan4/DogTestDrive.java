package com.huytca2008110179.tuan4;

public class DogTestDrive {

    public static void main(String[] args) {
        Dog[] danhSachdog = new Dog[7];

        Dog dog0 = new Dog(10, "Mực", "Đen");
        Dog dog1 = new Dog(15, "La", "Vàng");
        Dog dog2 = new Dog(17, "Chuột", "Xám");
        Dog dog3 = new Dog(7, "Sữa", "Trắng");
        Dog dog4 = new Dog(9, "Nâu", "Nâu");
        Dog dog5 = new Dog(25, "Bò Sữa", "Đen Trắng");
        Dog dog6 = new Dog(5, "Cà phê sữa", "Nâu Trắng");

        danhSachdog[0] = dog0;
        danhSachdog[1] = dog1;
        danhSachdog[2] = dog2;
        danhSachdog[3] = dog3;
        danhSachdog[4] = dog4;
        danhSachdog[5] = dog5;
        danhSachdog[6] = dog6;

        for(int i = 0 ; i<=danhSachdog.length ; i++){
            danhSachdog[i].inTTdog();
        }
    }

}
