package dataQueue;

public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    //入队
    void enqueue(E e);
    //出队
    E dequeue();
    //查询队首
    E getFront();
}
