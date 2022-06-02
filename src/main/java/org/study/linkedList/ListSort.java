package org.study.linkedList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 单链表排序
 */
public class ListSort {

    public static void main(String[] args) {
        ListSort listSort = new ListSort();
        ListNode head = listSort.initListNode();
        listSort.sort(head);
    }

    public ListNode initListNode(){
        ListNode listNode = new ListNode(1,null);
        ListNode node2 = new ListNode(4,listNode);
        ListNode node1 = new ListNode(2,node2);
        ListNode node0 = new ListNode(6,node1);
        return node0;
    }

    /**
     * [6,2,4,1]
     * 2,6,1,4
     * 1,4,2,6
     * @param head
     * @return
     */
    public ListNode sort(ListNode head){
        Set<ListNode> listNodeSet = new HashSet<>();
        ListNode current = head;
        while (current!=null &&current.next!=null){
            listNodeSet.add(current);
            ListNode tmp = current.next.next;
            current.next.next=null;
            current = tmp;
        }
        listNodeSet.forEach(System.out::println);
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

}



