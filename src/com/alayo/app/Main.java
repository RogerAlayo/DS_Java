package com.alayo.app;

public class Main {

    public static void main(String[] args) {
        Node sixty = new Node(60);
        Node fifty = new Node(50);
        Node forty = new Node(40);
        Node thirty = new Node(30);
        Node twenty = new Node(20);
        Node ten = new Node(10);

        LinkedList tempList = new LinkedList();
        tempList.insertInLinkedList(ten, 1);
        tempList.insertInLinkedList(ten, 0);
        tempList.insertInLinkedList(twenty, 1);
        System.out.println("Size = " + tempList.getSize());
        tempList.traverseLinkedList();
        tempList.deletionOfNode(1);
        tempList.traverseLinkedList();

        System.out.println("----------");

        //deleting the only node in LL
        /*tempList.deletionOfNode(0);
        tempList.traverseLinkedList();
        System.out.println("----------");*/

        //Start & insert at position 0
        LinkedList SinglyLinkedList = new LinkedList(thirty);
        System.out.println("Size = " + SinglyLinkedList.getSize());
        SinglyLinkedList.traverseLinkedList();
        System.out.println("----------");

        //insert node in beginning of LL
        SinglyLinkedList.insertInLinkedList(sixty, 0);
        System.out.println("Size = " + SinglyLinkedList.getSize());
        SinglyLinkedList.traverseLinkedList();
        System.out.println("----------");

        //insert @ position 1
        SinglyLinkedList.insertInLinkedList(fifty, 1);
        System.out.println("Size = " + SinglyLinkedList.getSize());
        SinglyLinkedList.traverseLinkedList();
        System.out.println("----------");

        //insert @ position 1
        SinglyLinkedList.insertInLinkedList(forty, 2);
        System.out.println("Size = " + SinglyLinkedList.getSize());
        SinglyLinkedList.traverseLinkedList();
        System.out.println("----------");

        //insert @ position last
        SinglyLinkedList.insertInLinkedList(twenty, SinglyLinkedList.getSize()); //or 3, whats the difference?
        System.out.println("Size = " + SinglyLinkedList.getSize());
        SinglyLinkedList.traverseLinkedList();
        System.out.println("----------");

        //search for data, returns Node position;
        System.out.println("***Found Node " + SinglyLinkedList.searchNode(20) + "***");

        //Delete @ position last
        SinglyLinkedList.deletionOfNode(4);
        System.out.println("Size = " + SinglyLinkedList.getSize());
        SinglyLinkedList.traverseLinkedList();
        System.out.println("----------");

        //search for data, returns Node position;
        System.out.println("***Found Node " + SinglyLinkedList.searchNode(20) + "***");
        System.out.println("----------");

        SinglyLinkedList.deleteLinkedList();
        SinglyLinkedList.traverseLinkedList();
    }
}