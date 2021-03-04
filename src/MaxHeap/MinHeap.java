package MaxHeap;

/**
 * 最小堆
 * Created by lirui on 2018/12/12.
 */
public class MinHeap<E extends Comparable<E>> {
    private Array<E> array;

    public MinHeap() {
        array = new Array<E>();
    }

    public MinHeap(int capisity) {
        array = new Array<E>(capisity);
    }

    public MinHeap(E[] e) {
        array = new Array<E>(e);
        //TODO
    }

    //父亲索引
    public int parent(int index) {
        if (index <= 0) {
            throw new IllegalArgumentException("NO parent ");
        }
        return (index - 1) / 2;
    }

    //左孩子索引
    public int leftChild(int index) {
        return index * 2 + 1;
    }

    //右孩子索引
    public int rightChild(int index) {
        return index * 2 + 2;
    }

    public void add(E e) {
        array.addLast(e);
        flowUp(array.getSize() - 1);
    }

    //数据上浮
    private void flowUp(int index) {
        while (index > 0 && array.get(index).compareTo(array.get(parent(index))) < 0) {
            array.swap(index, parent(index));
            index = parent(index);
        }
    }

    //查询最小元素
    public E findMin() {
        if (array.getSize() == 0) {
            throw new IllegalArgumentException("No min");
        }
        return array.get(0);
    }

    //取出堆中最小元素
    public E extraMin() {
        E min = findMin();
        array.swap(0, array.getSize() - 1);
        array.removeLast();
        slowDown(0);
        return min;
    }

    private void slowDown(int k) {
        while (leftChild(k) < array.getSize()) {
            int j = leftChild(k);
            if (j + 1 < array.getSize() && array.get(j + 1).compareTo(array.get(j)) < 0) {
                j = rightChild(k);
            }
            if (array.get(k).compareTo(array.get(j)) <= 0) {
                break;
            }
            array.swap(k, j);
            k = j;
        }
    }

    //取出堆中最小元素，并替换成e
    public E replace(E e) {
        E min = findMin();
        array.set(0, e);
        slowDown(0);
        return min;
    }

    //获取长度
    public int getSize() {
        return array.getSize();
    }

    //判断是否为空
    public boolean isEmpty() {
        return array.isEmpty();
    }
}
