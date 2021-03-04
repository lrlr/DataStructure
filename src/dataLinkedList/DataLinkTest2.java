package dataLinkedList;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/7/5 9:51
 */
public class DataLinkTest2<E> {
    class Node{
        private Node next;
        private E e;
        public Node(E e){
            this.e=e;
            next=null;
        }
    }
    private Node root;
    private int size;
    public DataLinkTest2(){
        size=0;
        root=null;
    }

    public void add(int  index,E e){
     if (index<0||index>size){
         return;
     }
     Node node=root;
      for(int i=0;i<size;i++){
          node=node.next;
      }
      node.next=new Node(e);
      size++;
    }

    public void delete(int index){
        Node node=root;
        for (int i=0;i<index;i++){
        node=node.next;
        }
        Node dd=node.next;
        node.next=dd.next;
    }
}
