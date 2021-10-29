package org.study.tree;

import java.util.List;
import java.util.Random;

public class RedBlackTest {
    public static void main(String[] args) {
        RedBlackTree<Integer,Integer> tree = new RedBlackTree<>();
        Random random = new Random();
        /*RedBlackTree.Node root = tree.new Node<Integer,Integer>(null,null,50,50,0);
        tree.setRoot(root);*/
        //BinaryTree.Node nodes = tree.new Node<Integer,Integer>(50,50,null,null);
        //tree.put(50,50);
        for (int i = 1; i <=3; i++) {
            Integer r = random.nextInt(100);
            //RedBlackTree.Node node = tree.new Node<Integer,Integer>(r,r,null,null,);
            tree.put(r,r);
        }

        List<RedBlackTree.Node> nodeList = tree.getNodeListMid(tree.getRoot());
        if(nodeList!=null){
            nodeList.forEach(node -> {System.out.println(node);});
        }
        System.out.println("====================================");
        /*List<RedBlackTree.Node> leafList = tree.getLeaf();
        if(leafList!=null){
            leafList.forEach(node -> {System.out.println(node);});
        }
        System.out.println("====================================");*/

    }
}
