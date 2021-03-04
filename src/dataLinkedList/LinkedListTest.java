package dataLinkedList;

/**
 * Created by lirui on 2019/3/1.
 */
public class LinkedListTest<E> {
     class Node{
        private E e;
        private Node next;
     public Node(){
         e=null;
         next=null;
     }
     public  Node(E e){
         this.e=e;
         next=null;
     }
     public Node(E e,Node next){
         this.e=e;
         this.next=next;
     }
    }
    private Node nodeHead;
     private  int size;
     //获取长度
    public int getSize(){
        return size;
    }
    //是否为空
    public boolean isEmpty(){
        return size==0;
    }
    //在指定位置插入元素
    public void add(int index,E e){
        if (index<0||index>size){
            throw new IllegalArgumentException("哈哈哈你输的不行");
        }
        Node node=nodeHead;
        for (int i=0;i<index;i++){
           node=node.next;
        }
        node.next=new Node(e,node.next);
        size++;

    }
    //在链表头加入元素
    public void addFirst(E e){
        add(0,e);
    }
    //在链表㞑加入元素
    public void addLast(E e){
        add(size,e);
    }
    //获得第i个位置的元素
    public E get(int index){
        if (index<0||index>size){
            throw new IllegalArgumentException("123");
        }
        Node node=nodeHead.next;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node.e;
    }
    //修改链表第i个元素
    public void set(int index,E e){
        if (index<0||index>size){
            throw new IllegalArgumentException("123");
        }
        Node node=nodeHead.next;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        node.e=e;
    }
    //查询是否包含某个元素
    public boolean contains(E e){
        Node node=nodeHead.next;
        for (int i=0;i<size;i++){
            if (node.e==e){
                return true;
            }
            node=node.next;
        }
        return false;
    }
    //删除某个位置元素
    public E remove(int index){
        if (index<0||index>size){
            throw new IllegalArgumentException("123");
        }
        Node node=nodeHead;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        Node retNode=node.next;
        E e=retNode.e;
        node.next=retNode.next;
        retNode=null;
        size--;
        return e;
    }
}
