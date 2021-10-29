package org.study.tree;

import java.util.ArrayList;
import java.util.List;

public class RedBlackTree<K extends Comparable,V> {

    private Node root;
    private int size;
    List<RedBlackTree.Node> nodeList = new ArrayList<>();

    public int getColor(Node node){
        if(node==null){
            return 0;
        }
        return node.color;
    }

    public Node rotateLeft(Node node){
        Node x = node.right;
        Node childLeft = x.left;
        node.right = childLeft;
        x.left = node;
        x.color = node.color;
        node.color =1;
        return x;
    }
    public Node rotateRight(Node node){
        Node x = node.left;
        node.left = x.right;
        x.right = node;
        x.color = node.color;
        node.color = 1;
        return x;
    }

    public Node flipColor(Node node){
        node.right.color = 0;
        node.left.color = 0;
        node.color = 1;
        return node;
    }

    public void put(K k,V v){
        root = put(root,k,v);
        root.color = 0;
    }

    public Node put(Node node,K k,V v){
        if(node==null){
            size++;
            return new Node(null,null,k,v,1);
        }
        int com = k.compareTo(node.k);
        if(com<0){
            node.left = put(node.left,k,v);
        }else if(com>0){
            node.right = put(node.right,k,v);
        }else {
            node.v = k;
        }
        /*
            左旋
         */
        if(getColor(node.right)==1 &&getColor(node.left)==0){
            node = rotateLeft(node);
        }
        /*
            右旋
         */
        if(getColor(node.left)==1 && getColor(node.left.left)==1){
            node = rotateRight(node);
        }
        /*
            反转颜色
         */
        if(getColor(node.left)==getColor(node.right) && getColor(node.left)==1){
            node = flipColor(node);
        }
        return node;
    }

    public <V> Object getV(K k){
        return getV(root,k);
    }

    public <V> Object getV(Node node,K k){
        if(node==null){
            return null;
        }
        if(k.compareTo(node.k)<0){
            return getV(node.left,k);
        }else if(k.compareTo(node.k)>0){
            return getV(node.right,k);
        }else{
            return node.v;
        }
    }

    public class Node<K extends Comparable,V>{
        private Node left;
        private Node right;
        private K k;
        private V v;
        private int color;

        public Node(Node left, Node right, K k, V v, int color) {
            this.left = left;
            this.right = right;
            this.k = k;
            this.v = v;
            this.color = color;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public K getK() {
            return k;
        }

        public void setK(K k) {
            this.k = k;
        }

        public V getV() {
            return v;
        }

        public void setV(V v) {
            this.v = v;
        }

        public int getColor() {
            return color;
        }

        public void setColor(int color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "k=" + k +
                    ", v=" + v +
                    ", color=" + color +
                    '}';
        }


    }


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    @Override
    public String toString() {
        return "RedBlackTree{" +
                "root=" + root +
                '}';
    }

    public void exchColor(Node x,Node y){
        int tmp = x.color;
        x.color = y.color;
        y.color = tmp;
    }

    public List<RedBlackTree.Node> getNodeListFist(RedBlackTree.Node node) {
        if(node==null){
            return null;
        }
        nodeList.add(node);
        if(node.left!=null){
            getNodeListFist(node.left);
        }
        if(node.right!=null){
            getNodeListFist(node.right);
        }
        return nodeList;
    }

    public List<RedBlackTree.Node> getNodeListMid(RedBlackTree.Node node) {
        if(node==null){
            return null;
        }
        if(node.left!=null){
            getNodeListMid(node.left);
        }
        nodeList.add(node);
        if(node.right!=null){
            getNodeListMid(node.right);
        }
        return nodeList;
    }
}
