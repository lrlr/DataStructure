package dataLinkedList;

/**
 * @author lirui
 * @ClassName:
 * @Description:双向链表
 * @date 2019/7/3 19:56
 */
public class DoubleLinkedList {


    class Node<E>{
     private Node pre;
     private Node next;
     private E e;
     public Node(E e){
         this.e=e;
     }
     public Node(Node pre,Node next,E e){
         this.pre=pre;
         this.next=next;
         this.e=e;
     }
     private Node<E> first;
     private Node<E> end;
     private int size;
     public void addFirst(E e){
         Node firsts=first;
         Node node=new Node(null,first,e);
         if (first==null){
             end=node;
         }else{
             firsts.pre=node;
         }
         first=node;
     }
    }
}
