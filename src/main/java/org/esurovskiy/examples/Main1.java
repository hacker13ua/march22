package org.esurovskiy.examples;

import java.util.Arrays;
import java.util.Collections;

public class Main1 {
    public static void main(String[] args) {
        Box<? extends Number, String> box2 = new Box<>(1, "");
        Box<Number, String> box3 = new Box<>((Number) 2.5, "");

        openBox(box2);
        openBox(box3);

    }

    static void openBox(Box<? extends Number, String> box) {
        Number item = box.getItem();
        System.out.println(item.doubleValue() * 2);
    }
}
