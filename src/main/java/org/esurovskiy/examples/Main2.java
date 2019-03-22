package org.esurovskiy.examples;

public class Main2 {
    public static void main(String[] args) {
        MyTestMethod<Integer> numberMyTestMethod = new MyTestMethod<>();
        int num = numberMyTestMethod.calcNum(new Integer[]{12,3,4,5,6}, 3);
        System.out.println(num);
    }
}
