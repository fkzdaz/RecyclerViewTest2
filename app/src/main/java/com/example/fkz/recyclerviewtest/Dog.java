package com.example.fkz.recyclerviewtest;

/**
 * Created by fkz on 2017/1/18.
 */

public class Dog {
    private  String dogName;
    private int dogImg;

    public Dog(String dogName, int dogImg) {
        this.dogName = dogName;
        this.dogImg = dogImg;
    }

    public int getDogImg() {
        return dogImg;
    }

    public String getDogName() {
        return dogName;
    }
}
