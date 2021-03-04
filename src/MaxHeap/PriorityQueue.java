package MaxHeap;

import dataQueue.Queue;

/**
 * 基于堆的优先队列
 * Created by lirui on 2018/12/11.
 */
public class PriorityQueue<E extends Comparable<E>> implements Queue<E> {
    private MaxHeap<E> maxHeap;
    public PriorityQueue(){
        maxHeap=new MaxHeap<E>();
    }
    @Override
    public int getSize() {
        return maxHeap.getSize();
    }

    @Override
    public boolean isEmpty() {
        return maxHeap.isEmpty();
    }

    @Override
    public void enqueue(E e) {
     maxHeap.add(e);
    }

    @Override
    public E dequeue() {
        return maxHeap.extractMax();
    }

    @Override
    public E getFront() {
        return maxHeap.findMax();
    }
}
