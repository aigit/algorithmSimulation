package org.study.tree;

import java.util.List;
import java.util.Random;

public class MyTest {
    public static void main(String[] args) {
        BinaryTree<Integer,Integer> tree = new BinaryTree<>();
        Random random = new Random();
        /*BinaryTree.Node root = tree.new Node<Integer,Integer>(50,50,null,null);
        tree.setRoot(root);*/
        //BinaryTree.Node nodes = tree.new Node<Integer,Integer>(50,50,null,null);
        //tree.put(50,50);
        for (int i = 1; i <=15; i++) {
            Integer r = random.nextInt(100);
            BinaryTree.Node node = tree.new Node<Integer,Integer>(r,r,null,null);
            tree.put(r,r);
        }

        List<BinaryTree.Node> nodeList = tree.getNodeListMid(tree.getRoot());
        if(nodeList!=null){
            nodeList.forEach(node -> {System.out.println(node);});
        }
        System.out.println("====================================");
        List<BinaryTree.Node> leafList = tree.getLeaf();
        if(leafList!=null){
            leafList.forEach(node -> {System.out.println(node);});
        }
        System.out.println("====================================");
    }
}
