package com.linkedlistdatastructure;

public class LinkedListMain {
    public static void main(String[] args) {
        //UC1: Create Simple LinkedList of 56,30,70.
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);
        System.out.println("Simple LinkedList :-");
        linkedList.display();

        //UC2: Ability to create LinkedList by adding 30 and 56 to 70.
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(70);
        linkedList1.add(30);
        linkedList1.add(56);
        System.out.println("\nLinkedList by Adding :-");
        linkedList1.display();

        //UC3: Ability to create LinkedList by appending 30 and 70 to 56.
        LinkedList<Integer>linkedList2 = new LinkedList<>();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        System.out.println("\nLinkedList by Appending :-");
        linkedList2.display();

        //UC4: Ability to insert 30 between 56 and 70.
        LinkedList<Integer>linkedList3 = new LinkedList<>();
        linkedList3.append(56);
        linkedList3.append(70);
        System.out.println("\nOriginal LinkedList:-");
        linkedList3.display();
        boolean isInserted = linkedList3.insert(56,30);
        if (isInserted)
            System.out.println("\nElement 30 is Inserted between 56 and 70.");
        else
            System.out.println("\nElement 30 is not Inserted.");
        System.out.println("LinkedList After Insertion :-");
        linkedList2.display();
    }
}
