package dataQueue;

/**
 * Created by 63024 on 2018/11/1.
 */
public class ArrayQueue<E> implements Queue<E> {
    private Array<E> array;

    public ArrayQueue(int capicity) {
        array = new Array<E>(capicity);
    }

    public ArrayQueue() {
        array = new Array<E>();
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
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public String toString() {

        StringBuilder res = new StringBuilder();
//        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        res.append("queuetop[");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("]last");
        return res.toString();
    }
}
