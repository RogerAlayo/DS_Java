package com.alayo.app;

public class Main {

    public static void main(String[] args) {
        Node sixty = new Node(60);
        Node fifty = new Node(50);
        Node forty = new Node(40);
        Node thirty = new Node(30);
        Node twenty = new Node(20);
        Node ten = new Node(10);

        LinkedList prac = new LinkedList();
        prac.insertInLinkedList(ten, 1);
        prac.insertInLinkedList(ten, 0);
        prac.insertInLinkedList(twenty, 1);
        System.out.println("Size = " + prac.getSize());
        prac.traverseLinkedList();
        prac.deletionOfNode(1);
        prac.traverseLinkedList();

        System.out.println("----------");

        //deleting the only node in LL
        /*prac.deletionOfNode(0);
        prac.traverseLinkedList();
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

        //System.out.println(SinglyLinkedList.head.data);
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