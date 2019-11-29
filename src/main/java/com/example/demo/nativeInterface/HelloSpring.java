package com.example.demo.nativeInterface;

public class HelloSpring {
    public native void print();

    static{
        System.loadLibrary("hello");
    }
}