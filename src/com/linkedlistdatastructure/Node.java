package com.linkedlistdatastructure;

public class Node <T> {
// Initializing Data and Node Using Generics
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}
