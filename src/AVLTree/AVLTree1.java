package AVLTree;

import java.util.ArrayList;

public class AVLTree1<K extends Comparable<K>, V> {

    private class Node{
        public K key;
        public V value;
        public Node left, right;
        public int height;

        public Node(K key, V value){
            this.key = key;
            this.value = value;
            left = null;
            right = null;
            height = 1;
        }
    }

    private Node root;
    private int size;

    public AVLTree1(){
        root = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    // 获得节点node的高度
    private int getHeight(Node node){
        if(node == null)
            return 0;
        return node.height;
    }

    // 获得节点node的平衡因子
    private int getBalanceFactor(Node node){
        if(node == null)
            return 0;
        return getHeight(node.left) - getHeight(node.right);
    }

    // 向二分搜索树中添加新的元素(key, value)
    public void add(K key, V value){
        root = add(root, key, value);
    }

    // 向以node为根的二分搜索树中插入元素(key, value)，递归算法
    // 返回插入新节点后二分搜索树的根
    private Node add(Node node, K key, V value){

        if(node == null){
            size ++;
            return new Node(key, value);
        }

        if(key.compareTo(node.key) < 0)
            node.left = add(node.left, key, value);
        else if(key.compareTo(node.key) > 0)
            node.right = add(node.right, key, value);
        else // key.compareTo(node.key) == 0
            node.value = value;

        // 更新height
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));

        // 计算平衡因子
        int balanceFactor = getBalanceFactor(node);

        if(Math.abs(balanceFactor) > 1) {
            System.out.println("unbalanced : " + balanceFactor);
            //如果平衡因子大于一向右旋转
            if (balanceFactor>1&&getBalanceFactor(node.left)>=0){
                return rightRotate(node);
            }
            //如果平衡因子小于-1向左旋转
            if (balanceFactor<-1&&getBalanceFactor(node.right)<=0){
                return leftRotate(node);
            }
            //LR
            if (balanceFactor>1&&getBalanceFactor(node.left)<0){
                node.left=leftRotate(node.left);
                 return rightRotate(node);
            }
            //RL
            if (balanceFactor<-1&&getBalanceFactor(node.right)>0){
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    //对节点进行右旋转
    private Node rightRotate(Node y){
        Node x=y.left;
        Node T3=x.right;
        x.right=y;
        y.left=T3;
        y.height=1+Math.max(getHeight(y.right),getHeight(y.left));
        x.height=1+Math.max(getHeight(x.right),getHeight(x.left));
        return x;
    }
    //左旋转
private Node leftRotate(Node y){
        Node x=y.right;
        Node s=x.left;
        x.left=y;
        y.right=s;
    y.height=1+Math.max(getHeight(y.right),getHeight(y.left));
    x.height=1+Math.max(getHeight(x.right),getHeight(x.left));
    return x;

}
    // 返回以node为根节点的二分搜索树中，key所在的节点
    private Node getNode(Node node, K key){

        if(node == null)
            return null;

        if(key.equals(node.key))
            return node;
        else if(key.compareTo(node.key) < 0)
            return getNode(node.left, key);
        else // if(key.compareTo(node.key) > 0)
            return getNode(node.right, key);
    }

    public boolean contains(K key){
        return getNode(root, key) != null;
    }

    public V get(K key){

        Node node = getNode(root, key);
        return node == null ? null : node.value;
    }

    public void set(K key, V newValue){
        Node node = getNode(root, key);
        if(node == null)
            throw new IllegalArgumentException(key + " doesn't exist!");

        node.value = newValue;
    }

    // 返回以node为根的二分搜索树的最小值所在的节点
    private Node minimum(Node node){
        if(node.left == null)
            return node;
        return minimum(node.left);
    }

    // 删除掉以node为根的二分搜索树中的最小节点
    // 返回删除节点后新的二分搜索树的根
    private Node removeMin(Node node){

        if(node.left == null){
            Node rightNode = node.right;
            node.right = null;
            size --;
            return rightNode;
        }

        node.left = removeMin(node.left);
        return node;
    }

    // 从二分搜索树中删除键为key的节点
    public V remove(K key){

        Node node = getNode(root, key);
        if(node != null){
            root = remove(root, key);
            return node.value;
        }
        return null;
    }

    private Node remove(Node node, K key){

        if( node == null )
            return null;
            Node retNode=null;
        if( key.compareTo(node.key) < 0 ){
            node.left = remove(node.left , key);
          retNode=node;
        }
        else if(key.compareTo(node.key) > 0 ){
            node.right = remove(node.right, key);
            retNode=node;
        }
        else{   // key.compareTo(node.key) == 0

            // 待删除节点左子树为空的情况
            if(node.left == null){
                Node rightNode = node.right;
                node.right = null;
                size --;
                retNode=rightNode;
            }else

            // 待删除节点右子树为空的情况
            if(node.right == null){
                Node leftNode = node.left;
                node.left = null;
                size --;
                retNode=leftNode;
            }else {

                // 待删除节点左右子树均不为空的情况

                // 找到比待删除节点大的最小节点, 即待删除节点右子树的最小节点
                // 用这个节点顶替待删除节点的位置
                Node successor = minimum(node.right);
                successor.right = remove(node.right, successor.key);
                successor.left = node.left;
                node.left = node.right = null;
                retNode = successor;
            }
        }
        if(retNode == null)
            return null;
        // 更新height
        retNode.height = 1 + Math.max(getHeight(retNode.left), getHeight(retNode.right));

        // 计算平衡因子
        int balanceFactor = getBalanceFactor(retNode);
        if(Math.abs(balanceFactor) > 1) {
            System.out.println("unbalanced : " + balanceFactor);
            //如果平衡因子大于一向右旋转
            if (balanceFactor>1&&getBalanceFactor(retNode.left)>=0){
                return rightRotate(retNode);
            }
            //如果平衡因子小于-1向左旋转
            if (balanceFactor<-1&&getBalanceFactor(retNode.right)<=0){
                return leftRotate(retNode);
            }
            //LR
            if (balanceFactor>1&&getBalanceFactor(retNode.left)<0){
                retNode.left=leftRotate(retNode.left);
                return rightRotate(retNode);
            }
            //RL
            if (balanceFactor<-1&&getBalanceFactor(retNode.right)>0){
                retNode.right=rightRotate(retNode.right);
                return leftRotate(retNode);
            }
        }
        return retNode;
    }
    public boolean isBalance(){
        return isBalance(root);
    }


    //判断是否是平衡二叉树
   private boolean isBalance(Node node){
        if (node==null){
            return true;
        }
        int balancer=getBalanceFactor(node);
        if (Math.abs(balancer)>1){
            return false;
        }
        return isBalance(node.left)&&isBalance(node.right);
   }
}
