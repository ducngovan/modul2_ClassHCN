package com.codegym;

public class Main {

    public static void main(String[] args) {
	HinhChuNhat hinhChuNhat = new HinhChuNhat();
	int i = 5;
	do {
        hinhChuNhat.getData();
        hinhChuNhat.getDisplay();
        System.out.println("hinh co dien tich la: "+hinhChuNhat.getArea());
        System.out.println("Hinh co chu vi la: "+hinhChuNhat.getPerlmeter());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        i++;
    }while (i<10);

    }
}
