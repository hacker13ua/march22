package org.esurovskiy.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("!!two");
        list.add("!!one");
        list.add("!!3");

        List<String> list2 = new ArrayList<>();
        list2.add("!!one");
        list2.add("!!two");
        list2.add("!!3");

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

    }
}
