package com.alayo.app;

public class Main {

    public static void main(String[] args) {
        Node sixty = new Node(60);
        Node fifty = new Node(50);
        Node forty = new Node(40);
        Node thirty = new Node(30);
        Node twenty = new Node(20);
        Node ten = new Node(10);

        //DLL tempList = new DLL();
        DLL tempList = new DLL();

        //Insert node @ position 1 in empty LL
        tempList.insertInLinkedList(ten, 1);

        System.out.println("----------");

        //Insert node(10) @ position 0 in empty LL
        tempList.insertInLinkedList(ten, 0);
        tempList.traverseLinkedList();
        //Insert node(20) @ position 1 in LL (size 1)
        tempList.insertInLinkedList(twenty, 1);
        //tempList.traverseLinkedList();
        //print LL size (=2)
        System.out.println("Size = " + tempList.getSize());
        //print LL (HEAD -> 10 -> 20)
        tempList.traverseLinkedList();
        //delete node in position 1
        tempList.deletionOfNode(1);
        //print LL size (=1)
        System.out.println("Size = " + tempList.getSize());
        //print LL (HEAD -> 10)
        tempList.traverseLinkedList();

        System.out.println("----------");

        //deleting the only node in LL
        /*tempList.deletionOfNode(0);
        tempList.traverseLinkedList();
        System.out.println("----------");*/

        //Start & insert at position 0
        DLL Llist = new DLL(thirty);
        System.out.println("Size = " + Llist.getSize());
        Llist.traverseLinkedList();
        System.out.println("----------");

        //insert node in beginning of LL
        Llist.insertInLinkedList(sixty, 0); //location starts at coutn 0, 1, 2; not at 1
        System.out.println("Size = " + Llist.getSize());
        Llist.traverseLinkedList();
        System.out.println("----------");

        //insert @ position 1
        Llist.insertInLinkedList(fifty, 1);
        System.out.println("Size = " + Llist.getSize());
        Llist.traverseLinkedList();
        System.out.println("----------");

        //insert @ position 1
        Llist.insertInLinkedList(forty, 2);
        System.out.println("Size = " + Llist.getSize());
        Llist.traverseLinkedList();
        System.out.println("----------");

        //insert @ position last
        Llist.insertInLinkedList(twenty, Llist.getSize()); //or 3, whats the difference?
        System.out.println("Size = " + Llist.getSize());
        Llist.traverseLinkedList();
        System.out.println("----------");

        //search for data, returns Node position;
        System.out.println("***Found Node " + Llist.searchNode(20) + "***");

        //Delete @ position last
        Llist.deletionOfNode(4);
        System.out.println("Size = " + Llist.getSize());
        Llist.traverseLinkedList();
        System.out.println("----------");

        //search for data, returns Node position;
        System.out.println("***Found Node " + Llist.searchNode(20) + "***");
        System.out.println("----------");

        //Delete @ position last
        Llist.deletionOfNode(2);
        System.out.println("Size = " + Llist.getSize());
        Llist.traverseLinkedList();
        System.out.println("----------");

        //Delete @ position last
        Llist.insertInLinkedList(ten, 2);
        System.out.println("Size = " + Llist.getSize());
        Llist.traverseLinkedList();
        System.out.println("----------");

        //search for data, returns Node position;
        System.out.println("***Found Node " + Llist.searchNode(10) + "***");

        Llist.deleteLinkedList();
        System.out.println("----------");
        Llist.traverseLinkedList();
    }
}
/*
    //CSLL
    Node sixty = new Node(60);
    Node fifty = new Node(50);
    Node forty = new Node(40);
    Node thirty = new Node(30);
    Node twenty = new Node(20);
    Node ten = new Node(10);

    //CSLL tempList = new CSLL();
    CSLL tempList = new CSLL();

    //Insert node @ position 1 in empty LL
    tempList.insertInLinkedList(ten, 1);

    System.out.println("----------");

    //Insert node(10) @ position 0 in empty LL
    tempList.insertInLinkedList(ten, 0);
    tempList.traverseLinkedList();
    //Insert node(20) @ position 1 in LL (size 1)
    tempList.insertInLinkedList(twenty, 1);
    //tempList.traverseLinkedList();
    //print LL size (=2)
    System.out.println("Size = " + tempList.getSize());
    //print LL (HEAD -> 10 -> 20)
    tempList.traverseLinkedList();
    //delete node in position 1
    tempList.deletionOfNode(1);
    //print LL size (=1)
    System.out.println("Size = " + tempList.getSize());
    //print LL (HEAD -> 10)
    tempList.traverseLinkedList();

    System.out.println("----------");

    //deleting the only node in LL
    */
    /*tempList.deletionOfNode(0);
    tempList.traverseLinkedList();
    System.out.println("----------");*//*


    //Start & insert at position 0
    CSLL Llist = new CSLL(thirty);
    System.out.println("Size = " + Llist.getSize());
    Llist.traverseLinkedList();
    System.out.println("----------");

    //insert node in beginning of LL
    Llist.insertInLinkedList(sixty, 0); //location starts at coutn 0, 1, 2; not at 1
    System.out.println("Size = " + Llist.getSize());
    Llist.traverseLinkedList();
    System.out.println("----------");

    //insert @ position 1
    Llist.insertInLinkedList(fifty, 1);
    System.out.println("Size = " + Llist.getSize());
    Llist.traverseLinkedList();
    System.out.println("----------");

    //insert @ position 1
    Llist.insertInLinkedList(forty, 2);
    System.out.println("Size = " + Llist.getSize());
    Llist.traverseLinkedList();
    System.out.println("----------");

    //insert @ position last
    Llist.insertInLinkedList(twenty, Llist.getSize()); //or 3, whats the difference?
    System.out.println("Size = " + Llist.getSize());
    Llist.traverseLinkedList();
    System.out.println("----------");

    //search for data, returns Node position;
    System.out.println("***Found Node " + Llist.searchNode(20) + "***");

    //Delete @ position last
    Llist.deletionOfNode(4);
    System.out.println("Size = " + Llist.getSize());
    Llist.traverseLinkedList();
    System.out.println("----------");

    //search for data, returns Node position;
    System.out.println("***Found Node " + Llist.searchNode(20) + "***");
    System.out.println("----------");

    Llist.deleteLinkedList();
    Llist.traverseLinkedList();
}*/
