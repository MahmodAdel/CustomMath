package com.example.myutils;

/**
 * Created by mahmoud on 5/05/18.
 */

public class MyMath {

    public static int Plus(int a,int b){
        return a+b;
    }

    public static int Minu(int a,int b){
        return a-b;
    }
    public static int Times(int a,int b){
        return a*b;
    }
    public static float Div(int a,int b){
        if (b==0){
            throw new IllegalArgumentException("Div by zero erro");
        }else {
            return a+b;
        }

    }
}
