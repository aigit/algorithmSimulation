package org.study.linkedList;

import java.util.Iterator;
import java.util.function.Consumer;

public class MyLinkedList<E>{

    private Node head;

    public MyLinkedList(E e){
        head = new Node(e,null);
    }

    public <E> Object getValOfNode(Node node){
        return node.val;
    }

    public Node getNext(Node node){
        return node.getNext();
    }

    public Node getNodeByVal(E e){
        if (this.head != null) {
            Node curr = head;
            while (curr!=null){
                if(curr.val.equals(e)){
                    return curr;
                }
                curr = curr.getNext();
            }
        }
        return null;
    }

    public Node add(E e){
       return addLast(head,e);
    }

    private Node addLast(Node node,E e){
        if(node.getNext()==null){
            Node next = new Node(e,null);
            node.setNext(next);
            return next;
        }else {
            return addLast(node.getNext(),e);
        }
    }

    public void add(Node node,E e){
        Node next = node.getNext();
        Node nNode = new Node(e,next);
        node.setNext(nNode);
    }

    public void remove(E e){
        if(head.getVal()!=null && head.getVal().equals(e)){
            Node next = head.getNext();
            head = next;
            return;
        }
        remove(head,e);
    }
    public void remove(Node curr,E e){
        if(curr==null){
            return;
        }

        Node next = curr.getNext();
        if(next!=null && next.getVal().equals(e)){
            Node nnext = next.getNext();
            next = null;
            curr.setNext(nnext);
            return;
        }else {
            remove(next,e);
        }
    }


    public class Node<E> {
        private E val;
        private Node next;

        public Node(E val, Node next) {
            this.val = val;
            this.next = next;
        }

        public E getVal() {
            return val;
        }

        public void setVal(E val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }


    public void print(){
        if (this.head != null) {
            Node curr = head;
            while (curr!=null){
                System.out.println(curr.val);
                curr = curr.getNext();
            }
        }

    }


    public void reverse(){
        reverse(head);
    }

    private Node reverse(Node node){
        if(node.getNext()==null){
            head = node;
            return node;
        }else {
            Node reNode = reverse(node.getNext());
            node.setNext(null);
            reNode.setNext(node);
            return node;
        }
    }

}
