package dataTree;


import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.*;

/**
 * Created by lirui on 2018/12/3.
 */
public class BinaryTree<E extends Comparable<E>> {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.deleteMin();
    }

    //二叉树根节点
    private Node root;
    //二叉树长度
    private int size;

    public BinaryTree() {
        root = null;
        size = 0;
    }

    //获取二叉树长度
    public int getSize() {
        return size;
    }

    //判断是否为空
    public boolean isEmpty() {
        return size == 0;
    }


    //添加节点
    public void add(E e) {
        root = add(root, e);
    }

    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0)
            node.leftNode = add(node.leftNode, e);
        if (e.compareTo(node.e) > 0)
            node.rightNode = add(node.rightNode, e);
        return node;
    }

    //判断是否包含某结点
    public boolean contains(E e) {
        return contains(root, e);
    }

    private boolean contains(Node node, E e) {
        if (node == null) {
            return false;
        }
        if (e.compareTo(node.e) == 0) {
            return true;
        } else if (e.compareTo(node.e) < 0) {
            contains(node.leftNode, e);
        } else {
            contains(node.rightNode, e);
        }
        return false;
    }

    //前序遍历二叉搜索树
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null)
            return;
        System.out.println(node.e);
        preOrder(node.leftNode);
        preOrder(node.rightNode);
    }

    //中序遍历二叉搜索树
    public void intOrder() {
        intOrder(root);
    }

    private void intOrder(Node node) {
        if (node == null)
            return;
        intOrder(node.leftNode);
        System.out.println(node.e);
        intOrder(node.rightNode);
    }

    //后序遍历
    public void backOrder() {
        backOrder(root);
    }

    private void backOrder(Node node) {
        if (node == null)
            return;
        backOrder(node.leftNode);
        backOrder(node.rightNode);
        System.out.println(node.e);
    }

    //二叉搜索树广度优先遍历
    public void breadthFirst() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            System.out.println(node.e);
            if (node.leftNode != null)
                queue.add(node.leftNode);
            if (node.rightNode != null)
                queue.add(node.rightNode);
        }

    }

    //查找二叉搜索树最小元素
    public E findmin() {
        if (size == 0) {
            throw new IllegalArgumentException("BST IS NULL");
        }
        return findmin(root).e;
    }

    private Node findmin(Node node) {
        if (node.leftNode == null)
            return node;
        return findmin(node.leftNode);
    }

    //查找二叉树的最大元素
    public E findMax() {
        if (size == 0)
            throw new IllegalArgumentException("BST IS NULL");
        return findMax(root).e;
    }

    private Node findMax(Node node) {
        if (node.rightNode == null)
            return node;
        return findMax(node);
    }

    //删除最小元素,并返回
    public E deleteMin() {
        E findmin = findmin();
        deleteMin(root);
        return findmin;
    }

    private Node deleteMin(Node node) {
        if (node.leftNode == null) {
            node = node.rightNode;
            return node;

        }
        node.leftNode = deleteMin(node.leftNode);
        return node;
    }

    //删除最大元素，并返回
    public E deleteMax() {
        deleteMax(root);
        return findMax();
    }

    private Node deleteMax(Node node) {
        if (node.rightNode == null) {
            node = node.leftNode;
            return node;
        }
        node.rightNode = deleteMax(node);
        return node;
    }

    //删除结点值为e的结点
    public void remove(E e) {
        root = remove(root, e);
    }

    private Node remove(Node node, E e) {
        if (node == null) {
            return null;
        }
        if (e.compareTo(node.e) < 0) {
            node.leftNode = remove(node.leftNode, e);
            return node;
        } else if (e.compareTo(node.e) > 0) {
            node.rightNode = remove(node.rightNode, e);
            return node;
        } else {
            if (node.leftNode == null) {
                Node right = node.rightNode;
                node.rightNode = null;
                size--;
                return right;
            }
            if (node.rightNode == null) {
                Node left = node.leftNode;
                node.leftNode = null;
                size--;
                return left;
            }
            //待删除结点左右子树都不为空
            // 找到比待删除节点大的最小节点, 即待删除节点右子树的最小节点
            // 用这个节点顶替待删除节点的位置
            Node succNode = findmin(node.rightNode);
            succNode.rightNode = deleteMin(node.rightNode);
            succNode.leftNode = node.leftNode;
            return succNode;
        }
    }

    private class Node {
        public E e;
        public Node leftNode;
        public Node rightNode;

        public Node(E e) {
            this.e = e;
            leftNode = null;
            rightNode = null;
        }
    }
}
