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
        //myLinkedList.reverse();
        myLinkedList.print();
        /*myLinkedList.remove(8);
        myLinkedList.print();
        final MyLinkedList.Node nodeByVal = myLinkedList.getNodeByVal(10);

        myLinkedList.add(nodeByVal,12);
        myLinkedList.print();*/

        // x 5,6,7,8,9,10,11
        //5 x 6,7,8,9,10,11
        //6 5 x 7,8,9,10,11
        MyLinkedList.Node head = myLinkedList.getHead();
        MyLinkedList.Node xnode = new MyLinkedList.Node(0,head);
        while (xnode.getNext()!=null){
            MyLinkedList.Node curr = xnode.getNext();
            xnode.setNext(curr.getNext());
            curr.setNext(head);
            head = curr;
        }
        MyLinkedList xlink = new MyLinkedList(xnode);
        xlink.print();
    }
}
