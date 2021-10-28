package org.study.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<K extends Comparable,V> {

    private int count;
    private Node root;
    List<BinaryTree.Node> leafList = new ArrayList<>();
    List<BinaryTree.Node> nodeList = new ArrayList<>();

    public class Node<K extends Comparable,V>{
        private Node<K,V> right;
        private Node<K,V> left;
        private K key;
        private V value;


        public Node(K k,V v,Node right,Node left){
            this.key = k;
            this.value = v;
            this.right = right;
            this.left = left;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    public Node<K,V> put(K k, V v){
        root = put(root,k,v);
        return root;
    }

    public Node<K,V> put(Node x, K k, V v){
        if (x==null){
            count++;
            return new Node(k,v,null,null);
        }

        if(k.compareTo(x.key)<0){
            x.left = put(x.left,k,v);
        }else if(k.compareTo(x.key)>0){
            x.right = put(x.right,k,v);
        }else {
            x.value = v;
        }
        return x;
    }

    public Node getNode(K k){
        return getNode(root, k);
    }
    public Node getNode(Node x,K k){
        if(x==null){
            return null;
        }

        int c = k.compareTo(x.key);
        if(c<0){
            return getNode(x.left,k);
        }else if(c>0){
            return getNode(x.right,k);
        }else {
            return x;
        }
    }

    public List<BinaryTree.Node> getLeaf(){
        return getLeaf(root);
    }

    public List<BinaryTree.Node> getLeaf(Node x){
        if(x.right==null && x.left==null){
            leafList.add(x);
            return leafList;
        }
        if(x.left!=null){
            getLeaf(x.left);
        }
        if(x.right!=null){
            getLeaf(x.right);
        }
        return leafList;
    }

    /**
     * 先序遍历
     * @return
     */
    public void firstList(Node x){
        if(x==null){
            return;
        }
        nodeList.add(x);
        if(x.left!=null){
            firstList(x.left);
        }
        if(x.right!=null){
            firstList(x.right);
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public List<BinaryTree.Node> getLeafList() {
        return leafList;
    }

    public void setLeafList(List<BinaryTree.Node> leafList) {
        this.leafList = leafList;
    }

    public List<BinaryTree.Node> getNodeListFist(Node node) {
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
    public List<BinaryTree.Node> getNodeListLast(Node node) {
        if(node==null){
            return null;
        }
        if(node.left!=null){
            getNodeListLast(node.left);
        }
        if(node.right!=null){
            getNodeListLast(node.right);
        }
        nodeList.add(node);
        return nodeList;
    }

    public List<BinaryTree.Node> getNodeListMid(Node node) {
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
