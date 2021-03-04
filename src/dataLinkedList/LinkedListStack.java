package dataLinkedList;

import dataStack.StackArray;

/**
 * Created by 63024 on 2018/11/2.
 */
public class LinkedListStack<E> implements Stack<E>{
    LinkedList<E> linkedList;
    public LinkedListStack(){
        linkedList=new LinkedList<E>();
    }
    @Override
    public int getSize() {
                return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public void push(E e) {
          linkedList.addFirst(e);
    }

    @Override
    public E pop() {
        return linkedList.removeFirst();
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }
}
