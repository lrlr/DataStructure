package dataStack;


import dataArray.Array;

/**
 * Created by lirui on 2019/3/5.
 */
public class StackDemo implements Stack {
 Array array;

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(Object o) {
    array.addLast(o);
    }

    @Override
    public Object pop() {
        return array.removeLast();
    }

    @Override
    public Object peek() {
        return array.getLast();
    }
}
