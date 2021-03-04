package Set;

/**
 * Created by lirui on 2018/12/9.
 */
public class LinkedList2<E> {
    private Node head;
    private int size;

    public LinkedList2() {
        this.head = new Node();
        size = 0;
    }

    //获取元素个数
    public int getSize() {
        return size;
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //在某个位置添加元素
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }
        Node preNode = head;
        for (int i = 0; i < size; i++) {
            preNode = preNode.next;
        }
        preNode.next = new Node(preNode.next, e);
        size++;
    }

    // 在链表头添加新的元素e
    public void addFirst(E e) {
        add(0, e);
    }

    // 在链表末尾添加新的元素e
    public void addLast(E e) {
        add(size, e);
    }

    // 获得链表的第index(0-based)个位置的元素
    // 在链表中不是一个常用的操作，练习用：）
    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Illegal index.");
        Node node=head.next;
        Node currNode=null;
        for (int i=0;i<index;i++){
          currNode =node.next;
        }
        return currNode.e;
    }
    // 获得链表的第一个元素
    public E getFirst(){
        return get(0);
    }

    // 获得链表的最后一个元素
    public E getLast(){
        return get(size - 1);
    }

    //修改链表某个位置的元素e
    public void set(int index,E e){
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("set failed. Illegal index.");
        Node cur=head.next;
        for (int i=0;i<index;i++){
            cur=cur.next;
        }
        cur.e=e;
    }
    // 查找链表中是否有元素e
    public boolean contains(E e){
        Node cur=head.next;
     while (cur!=null){
         if (e.equals(cur.e)){
             return true;
         }else{
             cur=cur.next;
         }
     }
     return false;
    }
    //在某个位置删除元素
    public E remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        Node node=head.next;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        Node preNode=node.next;
        node.next=preNode.next;
        preNode.next=null;
        size--;
        return preNode.e;
    }
    // 从链表中删除第一个元素, 返回删除的元素
    public E removeFirst(){
        return remove(0);
    }

    // 从链表中删除最后一个元素, 返回删除的元素
    public E removeLast(){
        return remove(size - 1);
    }

    // 从链表中删除元素e
    public void removeElement(E e){
        Node node=head.next;
        while(node!=null){
            if (e.equals(node.e)){
                break;
            }else{
                node=node.next;
            }
        }
        if (node!=null){
            Node preNode=node.next;
            node.next=preNode.next;
            preNode.next=null;
            size--;
        }
    }
    private class Node {
        private Node next;
        private E e;

        public Node(Node node, E e) {
            this.e = e;
            this.next = node;
        }

        public Node(E e) {
            this.e = e;
            this.next = null;
        }

        public Node() {
            this.e = null;
            this.next = null;
        }
    }

}
