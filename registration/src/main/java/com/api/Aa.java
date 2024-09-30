package com.api;

public class Aa {
    public static void main(String[] args) {
        Aa a1=new Aa();
        int val=a1.test();
        System.out.println(val);
        Cc c1=new Cc();
        c1.test2();
    }
    public  int test(){
        Bb b1=new Bb();
        return b1.test1();
    }
}
