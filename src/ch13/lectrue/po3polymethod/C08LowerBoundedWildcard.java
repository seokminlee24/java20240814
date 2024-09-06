package ch13.lectrue.po3polymethod;

import java.util.Arrays;

public class C08LowerBoundedWildcard {
    public static void main(String[] args) {
        var b1 = new Box8<Number>();
        var b2 = new Box8<Object>();
        var b3 = new Box8<Long>();
        addItem(b1);
        addItem(b2);
        //addItem(b3); //x

    }
    static  void addItem(Box8<? super Number>box){
        //값을 넣을 떄(out)는 lower bounded wildcard 사용
        //Object i1 = box.getItem();
        //Number i2 = box.getItem();
        box.setItem(3);
        box.setItem(33L);
        box.setItem(3.14);
    }
}

class Box8<T>{
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
