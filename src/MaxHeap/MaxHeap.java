package MaxHeap;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * 最大堆
 * Created by lirui on 2018/12/10.
 */
public class MaxHeap<E extends Comparable<E>> {
    private Array<E> data;

    public MaxHeap(int capisity) {
        data = new Array<E>(capisity);
    }

    public MaxHeap() {
        data = new Array<E>();
    }
    public MaxHeap(E[] arr){
        data=new Array<E>(arr);
        for (int i=parent(arr.length-1);i>=0;i--){
            siftDown(i);
        }
    }
    //获取该父亲索引
    private int parent(int index){
        if (index==0)
            throw new IllegalArgumentException("no parent");
        return (index-1)/2;
    }
    //获取左孩子结点索引
    private int leftChild(int index){
        return index*2+1;
    }
    //获取右孩子结点索引
    private  int rightChild(int index){
        return index*2+2;
    }

    //向堆中添加元素
    public void add(E e){
        data.addLast(e);
        siftUp(data.getSize()-1);
    }
    //上浮
    private void siftUp(int k){
        while (k>0&&data.get(parent(k)).compareTo(data.get(k))<0){
         data.swap(k,parent(k));
         k=parent(k);
        }
    }
    //查询最大元素
    public E findMax(){
        if (data.getSize()==0){
            throw new IllegalArgumentException("Can not findMax");
        }
        return data.get(0);
    }
    //取出堆中最大元素
    public E extractMax(){
        E ret=findMax();
        data.swap(0,data.getSize()-1);
        data.removeLast();
        siftDown(0);
        return ret;
    }
    //下沉
    private void siftDown(int k){
        while (leftChild(k)<data.getSize()){
            int j=leftChild(k);
            if (j+1<data.getSize()&&data.get(j+1).compareTo(data.get(j))>0){
                j=rightChild(k);
            }
            if (data.get(k).compareTo(data.get(j))>=0){
                break;
            }
            data.swap(k,j);
            k=j;
        }
    }
    //取出堆中最大元素，并替换成E
    public E replace(E e){
        E ret=findMax();
        data.set(0,e);
        siftDown(0);
        return ret;
    }
    public int getSize(){
        return data.getSize();
    }
    public boolean isEmpty(){
        return data.isEmpty();
    }
}
