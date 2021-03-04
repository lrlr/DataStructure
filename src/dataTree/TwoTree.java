package dataTree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 二叉树
 * Created by lirui on 2018/11/28.
 */
public class TwoTree<E extends Comparable<E>> {
    private Node root;
    private int size;

    public TwoTree() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    public void add(E e) {
        root = add(root, e);
    }

    public boolean contains(E e) {
        return contains(root, e);
    }

    //向以node为根的二分搜索树种插入元素E,递归算法
    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }

        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }
        return node;
    }

    //以node为根的二分搜索树查询是否包含元素e,递归算法
    private boolean contains(Node node, E e) {
        if (node == null) {
            return false;
        }
        if (e.compareTo(node.e) == 0) {
            return true;
        } else if (e.compareTo(node.e) < 0) {
            contains(node.left, e);
        } else {
            contains(node.right, e);
        }
        return false;
    }

    //二叉树前序遍历
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    //二叉树中序遍历
    public void inOrder() {
        intOrder(root);
    }

    private void intOrder(Node node) {
        if (node == null) {
            return;
        }
        intOrder(node.left);
        System.out.println(node.e);
        intOrder(node.right);
    }

    public void backOrder() {
        backOrder(root);
    }

    private void backOrder(Node node) {
        if (node == null) {
            return;
        }
        backOrder(node.left);
        backOrder(node.right);
        System.out.println(node.e);
    }

    //二分搜索树前序遍历非递归实现
    private void preOrderNo() {
        Stack<Node> s = new Stack<>();
        s.push(root);
        while (s != null) {
            Node cur = s.pop();
            System.out.println(cur.e);
            if (cur.right != null)
                s.push(cur.right);
            if (cur.left != null)
                s.push(cur.left);
        }

    }

    //二分搜索树广度优先遍历
    public void levelOrder() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node node = q.remove();
            System.out.println(node.e);
            if (node.left != null)
                q.add(node.left);
            if (node.right != null)
                q.add(node.right);
        }
    }

    //查找出二分搜索树最小元素
    public E findmin() {
        if (size == 0)
            throw new IllegalArgumentException("BST is Empty");
        return findmin(root).e;
    }

    private Node findmin(Node node) {
        if (node.left == null)
            return node;
        return findmin(node.left);
    }

    //查找二分搜索树最大的元素
    public E findMax() {
        if (size == 0)
            throw new IllegalArgumentException("BST is Empty");
        return findMax(root).e;
    }

    private Node findMax(Node node) {
        if (node.right == null)
            return node;
        return findMax(node.right);
    }

    //删除最小的元素，返回最小值
    public E removeMin() {

        E ret = findmin();
        root = removeMin(root);
        return ret;
    }

    private Node removeMin(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }

    //删除最大元素，返回最大值
    public E removeMax() {
        E ret = findMax();
        root = removeMax(root);
        return ret;
    }

    //删除掉以node为根的二分搜索树中最大的结点
    //返回删除结点后新的二分搜索树的根
    public Node removeMax(Node node) {
        if (node.right == null) {
            Node leftNode = node.left;
            node.left = null;
            size--;
            return leftNode;
        }
        node.right = removeMax(node.right);
        return node;
    }

    //从二叉搜索树删除元素为e的节点
    public void remove(E e) {
        root = remove(root, e);
    }

    // 删除掉以node为根的二分搜索树中值为e的节点, 递归算法
    // 返回删除节点后新的二分搜索树的根
    private Node remove(Node node, E e){

        if( node == null )
            return null;

        if( e.compareTo(node.e) < 0 ){
            node.left = remove(node.left , e);
            return node;
        }
        else if(e.compareTo(node.e) > 0 ){
            node.right = remove(node.right, e);
            return node;
        }
        else{   // e.compareTo(node.e) == 0

            // 待删除节点左子树为空的情况
            if(node.left == null){
                Node rightNode = node.right;
                node.right = null;
                size --;
                return rightNode;
            }

            // 待删除节点右子树为空的情况
            if(node.right == null){
                Node leftNode = node.left;
                node.left = null;
                size --;
                return leftNode;
            }

            // 待删除节点左右子树均不为空的情况

            // 找到比待删除节点大的最小节点, 即待删除节点右子树的最小节点
            // 用这个节点顶替待删除节点的位置
            Node successor = findmin(node.right);
            successor.right = removeMin(node.right);
            successor.left = node.left;

            node.left = node.right = null;

            return successor;
        }
    }
}