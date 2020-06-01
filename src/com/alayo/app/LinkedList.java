package com.alayo.app;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public LinkedList(Node node) {
        node.next = null;
        this.head = node;
        this.tail = node;
        ++this.size;
    }

    public int getSize() {
        return this.size;
    }

    public void insertInLinkedList(Node node, int location) {
        //Linked list does not exist & they thought it did so insert at position > 0.
        if (head == null && location > 0) {
            System.out.println("No Linked List Found");
            return;
        }
        //LL DNE and they know it doesnt
        else if (head == null && tail == null && location == 0) {    //can I call above constructor: Linkedlist(Node node) since same code?
            node.next = null;
            head = node;
            tail = node;
        } else if (location == 0) {   //Case 1: Insert at start
            node.next = head;
            head = node;
        } else if (location == size) {    //Case 2: Insert at last
            node.next = null;
            tail.next = node;   //stores address of node in tail's next field, since ref var with last node in LL so its next field gets updated too
            tail = node;    //puts address of node in
        } else {    //Case 3: insert at specified location
            int counter = 0;
            for (Node iterator = head; iterator != null; iterator = iterator.next) {
                if (counter == location - 1) {
                    node.next = iterator.next;
                    iterator.next = node;
                    //++size;
                    //return;
                    break;
                }
                ++counter;
            }
        }
        ++size;
    }

    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("No Linked List found");
            return;
        }
        System.out.print("HEAD -> ");
        for (Node iterator = head; iterator != null; iterator = iterator.next) {
            System.out.print(iterator.data);
            System.out.print(" -> ");
        }
        System.out.println("NULL");
    }

    public int searchNode(int nodeValue) {
        if (head == null) {
            System.out.println("No Linked List found");
            return -1;
        }

        int counter = 0;

        for (Node iterator = head; iterator != null; iterator = iterator.next) {
            if (iterator.data == nodeValue) {
                return counter;
            }
                ++counter;
        }
        return -1;
    }

    //
    //Q:size starts at 1 cuz I did that, but how location starts at 0 by default?
    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("Linked List is empty"); //Linked List does not exist
            return; //have this here since I don't want last statement to execute: update size - 1
        } else if (location == 0) {   //Case 1: Delete first node
            if (head.next == null) {    //if 1st node was only node in LL
                head = null;
                tail = null;
                --size;
                return; //can't use break outside of loop, so can't use it here.
            }

            head = head.next;
            //--size;
        } else if (location >= size) {   //Case 2: Delete last node
            if (size == 1) {    //if node is only node in LL
                head = tail = null;
                --size;
                return;
            }

            int count = 0;

            for (Node iterator = head; iterator.next != null; iterator = iterator.next) {
                if (iterator.next.next == null) {
                    tail = iterator;       //tail = iterator.next;  Q:WHY iterator.next still works?
                                           //cuz iterator.next doesnt do squat (tail doesnt move),
                                           //its the next line that does the work (iterator.next = null;)
                                           //iterator == head (first node), so head(first node).next = null is making first node = null
                    iterator.next = null;
                    break;  //if this was is middle & not last this break would be req., I'm leaving here in case for future work
                    //--size;
                    //return;
                }
            }
        } else {   //Case 3: Delete middle node
            int count = 0;
            for (Node iterator = head; iterator.next != null; iterator = iterator.next) {
                if (count == location - 1) {
                    iterator.next = iterator.next.next;
                    break;
                    //--size;
                    //return;
                }
                ++count;
            }
        }
        --size;
    }

    public void deleteLinkedList() {
        head = null;
        tail = null;
    }
}

/*
#####++Time Complexity & Space Complexity++

| Operations | Time Complexity | Space Complexity |
|------------|-----------------|------------------|
| Creation   | O(1)            | O(1)             |
| Insertion  | O(n)            | O(1)             |
| Searching  | O(n)            | O(1)             |
| Traversing | O(n)            | O(1)             |
| Deletion of node  | O(n)     | O(1)             |
| Deletion of SLL  | O(1)      | O(1)             |

*/










