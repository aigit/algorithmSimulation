package org.study.linkedList;

import java.util.ArrayList;

public class LinkListTest {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(5);
        myLinkedList.add(6);
        myLinkedList.add(7);
        myLinkedList.add(8);
        myLinkedList.add(9);
        myLinkedList.add(10);
        myLinkedList.add(11);
        myLinkedList.reverse();
        myLinkedList.print();
        /*myLinkedList.remove(8);
        myLinkedList.print();
        final MyLinkedList.Node nodeByVal = myLinkedList.getNodeByVal(10);

        myLinkedList.add(nodeByVal,12);
        myLinkedList.print();*/
    }
}
