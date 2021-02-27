package com.jtest;

import com.ktest.KHello;

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
