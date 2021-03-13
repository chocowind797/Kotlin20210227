package com.jtest;

//import com.函式呼叫.頂層函式.KTopFunKt;

import com.函式呼叫.頂層函式.Calc;

public class CallTopFun {
    public static void main(String[] args) {
//        System.out.println(KTopFunKt.add(10, 20));
//        System.out.println(KTopFunKt.add(20, 30));
//        System.out.println(KTopFunKt.getCount());\\\\\\\

        System.out.println(Calc.myAdd(10, 20));
        System.out.println(Calc.myAdd(20, 30));
        System.out.println(Calc.getCount());
    }
}
