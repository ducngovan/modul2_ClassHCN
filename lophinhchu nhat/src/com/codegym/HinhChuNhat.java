package com.codegym;

import java.util.Scanner;

public class HinhChuNhat {
    private double leng;
    private  double width;
    public HinhChuNhat(){}

    public double getWidth() {
        return width;
    }

    public double getLeng() {
        return leng;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLeng(double leng) {
        this.leng = leng;
    }
    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chieu dai: ");
        leng = scanner.nextDouble();
        System.out.print("nhap chieu rong: ");
        width = scanner.nextDouble();
    }
    public void getDisplay(){
        System.out.println("hinh chu nhat cos thong so chieuf dai la: "+leng+" chieu rong la: "+width);
    }
    public double getArea(){
        double area = leng * width;
        return  area;
    }
    public double getPerlmeter(){
        double perl = (leng + width)*2;
        return perl;
    }
}



























