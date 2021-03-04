package dataStack;

import dataArray.Array;

/**
 * Created by 63024 on 2018/10/30.
 */
public class StackArray<E> implements Stack<E> {
    Array<E> array;
    public StackArray(int capcity){
        array=new Array<E>(capcity);
    }
    public StackArray(){
        array=new Array<E>();
    }

    @Override
    public int getSize() {

        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append("Stack:[");
        for (int i=0;i<array.getSize();i++){
            builder.append(array.get(i));
            if (i!=array.getSize()-1){
                builder.append(",");
            }
        }
        builder.append("]top");
        return builder.toString();
    }
}
