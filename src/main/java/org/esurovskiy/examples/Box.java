package org.esurovskiy.examples;


public class Box<T, T1> {
    private T o;
    private T1 another;

    public Box(final T o, final T1 another) {
        this.o = o;
        this.another = another;
    }

    T getItem() {
        return o;
    }

    public void setItem(T o) {
        this.o = o;
    }

    public void setAnother(T1 o){
        another = o;
    }

    public T1 getAnother() {
        return another;
    }
}
