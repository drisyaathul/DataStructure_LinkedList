package com.linkedlistdatastructure;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        //UC1: Create Simple Linked List of 56,30,70.
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);
        System.out.println("Simple Linked List => "+linkedList);
    }
}
