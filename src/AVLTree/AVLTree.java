package AVLTree;

import dataString.NewString;

/**
 * Created by lirui on 2018/12/27.
 */
public class AVLTree<K extends Comparable<K>, V> {
    private class Node {
        private Node left;//左结点
        private Node right;//右结点
        private int height;//结点高度
        private K k;
        private V v;

        public Node(K k, V v) {
            this.k = k;
            this.v = v;
            left = null;
            right = null;
            height = 1;
        }
    }

    private int size;
    private Node root;

    public AVLTree() {
        root = null;
        size = 0;
    }

    //长度
    public int getSize() {
        return size;
    }

    //判断是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    public void add(K k, V v) {

    }

    private Node add(Node node, K k, V v) {
        if (node == null) {
            size++;
            node = new Node(k, v);
        }
        if (k.compareTo(node.k) < 0) {
            return node.left = add(node.left, k, v);
        } else if (k.compareTo(node.k) > 0) {
            return node.right = add(node.right, k, v);
        } else {
            node.v = v;
        }
        //获取高度
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        //计算平衡因子
        int balancer = getBalance(node);
        //绝对值大于1不平衡
        if (Math.abs(balancer) > 1) {
            //平衡因子大于1，右旋转 ，RR
            if (balancer > 1 && getBalance(node.left) >= 0) {
               return rightRotate(node);
            } else//右旋转 RR
                if (balancer < -1 && getBalance(node.right) <= 0) {
                   return leftRotate(node);
                } else if (balancer > 1 && getBalance(node.left) < 0) {//平衡因子大于一，其左结点平衡因子小于0，先左旋转，再右旋转
                  node.left=leftRotate(node.left);
                 return rightRotate(node);

                }else if (balancer<-1&&getBalance(node.right)>0){//平衡因子小于-1，其右结点平衡因子大于0，先右旋转，再左旋转
                   node.right=rightRotate(node.right);
                   return leftRotate(node);
                }
        }
        return node;
    }

    //右旋转
    private Node rightRotate(Node node) {
        Node x = node.left;
        Node tedNode = x.right;
        x.right = node;
        node.left = tedNode;
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));
        return node;
    }

    //左旋转
    private Node leftRotate(Node node) {
        Node x = node.right;
        Node tedNode = x.left;
        x.left = node;
        node.right = tedNode;
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));
        return node;
    }

    //获取结点高度
    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }
    //计算平衡因子
    private int getBalance(Node node) {
        return getHeight(node.left) - getHeight(node.right);
    }

    //返回以node为根结点的K所在的结点
    private Node getNode(Node node,K k){
        if (node==null){
            return null;
        }
        if (k.compareTo(node.k)==0){
            return node;
        }else if (k.compareTo(node.k)<0){
            return getNode(node.left,k);
        }else{
            return getNode(node.right,k);
        }
    }

    //判断是否包含该结点
    public boolean getContains(K k){
        return getNode(root,k)!=null;
    }
    //获取该k的v值
    public V getValue(K k){
       Node s= getNode(root,k);
        return s==null?null:s.v;
    }

    //修改当前k的v值
    public void  setValue(K k,V newValue){
        Node s=getNode(root,k);
        if (s==null){
            throw new IllegalArgumentException("is not exist");
        }
        s.v=newValue;
    }
//返回以node为根最小值所在的结点
    private Node min(Node node){
        if (node.left==null){
            return node;
        }
        return min(node.left);
    }
    //返回以node为根最大值所在节点
    private Node max(Node node){
        if (node.right==null){
            return  node;
        }
        return max(node.right);
    }
//删除某个节点
private  Node remove(Node node,K k){
        if (node==null){
            return null;
        }
        Node redNode=null;
        if (k.compareTo(node.k)<0){
            node.left=remove(node.left,k);
            redNode=node;
        }else if (k.compareTo(node.k)>0){
            node.right=remove(node.right,k);
            redNode=node;
        }else{
            if (node.left==null){
                Node rightnode=node.right;
                node.right=null;
                size--;
                redNode=rightnode;
            }else
            if (node.right==null){
                Node leftnode=node.left;
                node.left=null;
                size--;
                redNode=leftnode;
            }else{
                // 待删除节点左右子树均不为空的情况

                // 找到比待删除节点大的最小节点, 即待删除节点右子树的最小节点
                // 用这个节点顶替待删除节点的位置
                Node successor = min(node.right);
                successor.right = remove(node.right, successor.k);
                successor.left = node.left;
                node.left = node.right = null;
                redNode = successor;
            }
        }
    if(redNode == null)
        return null;
    // 更新height
    redNode.height = 1 + Math.max(getHeight(redNode.left), getHeight(redNode.right));

    // 计算平衡因子
    int balanceFactor = getBalance(redNode);
    if(Math.abs(balanceFactor) > 1) {
        System.out.println("unbalanced : " + balanceFactor);
        //如果平衡因子大于一向右旋转
        if (balanceFactor>1&&getBalance(redNode.left)>=0){
            return rightRotate(redNode);
        }
        //如果平衡因子小于-1向左旋转
        if (balanceFactor<-1&&getBalance(redNode.right)<=0){
            return leftRotate(redNode);
        }
        //LR
        if (balanceFactor>1&&getBalance(redNode.left)<0){
            redNode.left=leftRotate(redNode.left);
            return rightRotate(redNode);
        }
        //RL
        if (balanceFactor<-1&&getBalance(redNode.right)>0){
            redNode.right=rightRotate(redNode.right);
            return leftRotate(redNode);
        }
    }
    return redNode;
}
    public boolean isBalance(){
        return isBalance(root);
    }


    //判断是否是平衡二叉树
    private boolean isBalance(Node node){
        if (node==null){
            return true;
        }
        int balancer=getBalance(node);
        if (Math.abs(balancer)>1){
            return false;
        }
        return isBalance(node.left)&&isBalance(node.right);
    }
}
