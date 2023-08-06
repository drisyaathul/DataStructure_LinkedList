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

    public void append(T data) {
        /*
         * New Node is created in the LinkedList. So the head and tail are new node.
         * If head is not equal to null, then tail.next will be new Node.
         * And tail will be new Node.
         */
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else
            tail.next = newNode;
            tail = newNode;
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public Node<T> search(T searchData) {
        //when temp node is head,and temp is not equal to null then its data equals to search data
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null; //When temp = null
    }
    public boolean insert(T searchData, T insertData) {
        //After Searching the node, the new node is inserted next to it.
        Node<T> newNode = new Node<>(insertData);
        Node<T> searchNode = search(searchData);
        if (searchNode != null) {
            newNode.next = searchNode.next;
            searchNode.next = newNode;
            return true;
        }
        return false;
    }

    public T pop() {
        //Deleting the First Element
        if (head == null)
            return null;
        T popData = head.data;
        head = head.next;
        return popData;
    }
}
