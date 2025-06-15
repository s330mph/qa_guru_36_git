package ru.s330mph;

import jdk.dynalink.beans.StaticClass;

import java.util.Stack;

public class Main {

    private static String msg = "Hello, stage2 here111!!!!!!";

    public static void main(String... args) {
        System.out.println(msg);
    }
    private static String getMsg() {
        return "qqqqaa111";
    }
}