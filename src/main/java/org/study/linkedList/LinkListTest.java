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
        //myLinkedList.print();
        /*myLinkedList.remove(8);
        myLinkedList.print();
        final MyLinkedList.Node nodeByVal = myLinkedList.getNodeByVal(10);

        myLinkedList.add(nodeByVal,12);
        myLinkedList.print();*/

        //  5>6>7>8>9>10>11
        //5<6,7,8,9,10,11
        //6 5  7,8,9,10,11
        MyLinkedList.Node curr = myLinkedList.getHead();
        MyLinkedList.Node pre = null;
        while (curr!=null){
            MyLinkedList.Node next = curr.getNext();
            curr.setNext(pre);
            pre = curr;
            curr = next;
        }
        MyLinkedList xlink = new MyLinkedList(pre);
        xlink.print();
    }
}
