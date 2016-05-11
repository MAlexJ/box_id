package com.epam.service;

import com.epam.util.ListSweets;

import java.lang.Object;

public class PrintService {

    public void print(String str,Object ob) {
        if (ob instanceof ListSweets) {
            System.out.println(str + ": ");
            ((ListSweets) ob).print();
        }else {
            System.out.println(str + ": " + ob.toString());
        }
    }
}
