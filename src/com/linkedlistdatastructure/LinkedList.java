package com.linkedlistdatastructure;

public class LinkedList <T> {

    Node<T> head;
    Node<T> tail;
    public void add(T data) {
        /*
         * New Node is created in the LinkedList. So the head and tail are new node.
         * If head is not equal to null, then newNode.next will be head.
         * And head will be new Node.
         */
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else
            newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}
