package com.linkedlistdatastructure;

public class LinkedList <T extends Comparable<T>> {

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

    public T popLast() {
        // Deleting the Last Element
        if (head == null)
            return null;
        T popLastData = tail.data; //last element
        Node<T> temp = head;
        //Second last element is converting to null using while loop
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return popLastData;
    }

    public void delete(T deleteData) {
        //Delete the Element.
        Node node = head;
        Node prev = null;
        int size = 0;
        if (head.data.equals(deleteData)) {
            head = head.next;
            size -= 1;
        }
        while (!node.data.equals(deleteData)) {
            prev = node;
            node = node.next;
        }
        node = node.next;
        prev.next = node;
        node = null;
        size -= 1;
    }

    public void size() {
        /*
         * Size of the Linked list:-
         * create temp node to find the count.
         * count starts from when temp is equal to head.
         * By using while loop, count is added till the temp become null(Tail).
         * print the count value .
         */
        Node<T> temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        System.out.println("\nSize of the LinkedList is " + count);
    }

    public void sort() {
        /*
         * Creates linked list in ascending order:-
         */
        Node<T> temp1 = head;
        Node<T> temp2;
        T temp3;

        if (head != tail) {
            while (temp1 != null) {
                temp2 = temp1.next;
                while (temp2 != null) {
                    if ((temp1.data.compareTo(temp2.data)) > 0) {
                        temp3 = temp1.data;
                        temp1.data = temp2.data;
                        temp2.data = temp3;
                    }
                    temp2 = temp2.next;
                }
                temp1 = temp1.next;
            }
        }
    }
}
