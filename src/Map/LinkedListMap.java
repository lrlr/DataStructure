package Map;

/**
 * 链表实现映射
 * Created by lirui on 2018/12/5.
 */
public class LinkedListMap<K,V> implements Map<K,V> {
    private Node preNode;
    int size;
    public LinkedListMap(){
        this.preNode=new Node();
        size=0;
    }
    class Node{
        K k;
        V v;
        Node next;
        public Node(K k,V v,Node next){
            this.k=k;
            this.v=v;
            this.next=next;
        }
        public Node(K k,V v){
            this.k=k;
            this.v=v;
            this.next=null;
        }
        public Node(){
            this.k=null;
            this.v=null;
            this.next=null;
        }
    }
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void add(K k, V v) {
        Node node=getNode(k);
        if (node!=null){
            node.v=v;
        }else{

            preNode.next=new Node(k,v,preNode.next);
            size++;
        }
    }

    @Override
    public V remove(K k) {
       Node pre=preNode;
       while (pre.next!=null){
           if (pre.next.k.equals(k)){
               break;
           }
           pre=pre.next;
       }
       if (pre.next!=null){
           Node delNode=pre.next;
           pre.next=delNode.next;
           delNode.next=null;
           size--;
           return delNode.v;
       }
        return null;
    }

    @Override
    public boolean contains(K k) {
        Node node=getNode(k);
        if (node==null){
            return false;
        }
        return true;
    }

    @Override
    public V get(K k) {
       Node node= getNode(k);
        return node==null?null:node.v;
    }
   private Node getNode(K k){
        Node node=preNode.next;
        while (node!=null){
          if (node.k.equals(k)){
              return node;
          }
          node=node.next;
        }
        return null;
   }
    @Override
    public void set(K k, V v) {
      Node node= getNode(k);
      if (node==null){
          throw new IllegalArgumentException(k + " doesn't exist!");
      }
      node.v=v;
    }
}
