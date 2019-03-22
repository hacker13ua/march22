package org.esurovskiy.examples;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {


        Box<Integer, String> box2 = new Box<>(1, "");
        box2.setItem(10);
        openBox(box2);


    }

    static void openBox(Box<Integer, String> box) {
        Integer item = box.getItem();
        System.out.println(item * 2);
    }
}
