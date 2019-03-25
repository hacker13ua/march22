package org.esurovskiy.examples;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class MyTestMethod {
    public <T extends Number> int calcNum(T[] array, T maxElem) {
        int count = 0;
        for (T elem : array) {
            if (elem.doubleValue() > maxElem.doubleValue()) {
                count++;
            }
        }
        return count;
    }
}
