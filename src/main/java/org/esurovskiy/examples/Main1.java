package org.esurovskiy.examples;

public class Main1 {
    public static void main(String[] args) {


        Box<Number, String> box2 = new Box<>((Number) 1, "");
        Box<Number, String> box3 = new Box<>((Number) 2.5, "");

        openBox(box2);
        openBox(box3);

    }

    static void openBox(Box<Number, String> box) {
        Number item = box.getItem();
        System.out.println(item.doubleValue() * 2);
    }
}
