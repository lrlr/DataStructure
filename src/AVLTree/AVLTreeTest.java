package AVLTree;

/**
 * Created by lirui on 2018/12/25.
 */
public class AVLTreeTest<K extends Comparable<K>,V> {
    private class Node{
        private K k;
        private V v;
        private Node left;
        private Node right;
        private int hight;
        public Node(K k,V v){
            this.k=k;
            this.v=v;
            right=null;
            left=null;
            hight=1;
        }
    }
    private Node root;
    private int size;
    public AVLTreeTest(){
        root=null;
        size=0;
    }
    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }



    private Node add(Node node,K k,V v){
        if (node==null){
            size++;
            return new Node(k,v);
        }
        if (k.compareTo(node.k)<0){
            node.left=add(node.left,k,v);
        }else if (k.compareTo(node.k)>0){
            node.right=add(node.right,k,v);
        }else{
            node.v=v;
        }
        node.hight=1+Math.max(getHight(node.left),getHight(node.right));
        //计算平衡因子
        int balancer=getBalanceFactor(node);
        if (Math.abs(balancer)>1){
            System.out.println("123");
        }
        return node;
    }
    private int getHight(Node node){
        if (node==null){
            return 0;
        }
        return node.hight;
    }
    // 获得节点node的平衡因子
    private int getBalanceFactor(Node node){
        if(node == null)
            return 0;
        return getHight(node.left) - getHight(node.right);
    }
}
