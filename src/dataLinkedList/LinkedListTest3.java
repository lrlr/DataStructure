package dataLinkedList;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/7/3 19:00
 */
public class LinkedListTest3<E> {
    private Node pre;
    private int size;
    public LinkedListTest3(){
        pre=null;
        size=0;
    }
   public int getSize(){
        return size;
   }
  public void add(int index,E e){
        if (index<0||index>size){
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }
        Node node=pre;
        for (int i=0;i<index;i++){
            pre=node.next;
        }
        pre.next=new Node(pre.next,e);
        size++;
  }
  public E getValue(int index){
      if (index<0||index>size){
          throw new IllegalArgumentException("Add failed. Illegal index.");
      }
      Node<E> node=pre;
      for (int i=0;i<index;i++){
          node=node.next;
      }
      return node.e;
  }
  public void set(int index,E e){
        Node node=pre;
        for (int i=0;i<size;i++){
            node=pre.next;
        }
        node.e=e;
  }
  public boolean contains(E e){
        Node node=pre;
        for (int i=0;i<size;i++){
            node=pre.next;
            if (node.e.equals(e)){
                return true;
            }
        }
        return false;
  }
  public void delete(int index){
        Node<E> node=pre;
        for (int i=0;i<size;i++){
            node=node.next;
        }
      Node  current=node.next;
      node.next=  current.next;
      current.next=null;
      size--;
  }


    class Node<E>{
        private Node next;
        private E e;
        public Node(Node next,E e){
            this.next=next;
            this.e=e;
        }
        public Node(Node next){
            this.next=next;
            this.e=null;
        }
        public Node(E e){
            this.next=null;
            this.e=e;
        }
        public Node(){
            next=null;
            e=null;
        }
        public String toString(){
            return e.toString();
        }
    }


}
