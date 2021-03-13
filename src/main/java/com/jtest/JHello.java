package com.jtest;

import com.基礎語法.standard.KHello;

public class JHello {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        JHello j = new JHello();
        j.callMe();

        KHello k = new KHello();
        k.callMe();

    }

    public void callMe() {
        System.out.println("It's me, Mario!");
    }
}
