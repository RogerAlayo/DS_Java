package com.alayo.app;

public class CDLL {
    private Node head;
    private Node tail;
    private int size;

    public CDLL() {
        this.head = null;
        this.tail = null;
    }

    public CDLL(Node node) {
        node.next = node.prev = null;
        this.head = node;
        this.tail = node;
        ++this.size;
    }

    public int getSize() {
        return this.size;
    }

    public void insertInLinkedList(Node node, int location) {
        if (head == null && location > 0) {     //Check: Linked list DNE & user doesn't know so inserts at position > 0.
            System.out.println("No Linked List Found");
            return;
        } else if (head == null && tail == null && location == 0) {     //Check: Linked List DNE & user knows
            node.next = node.prev = null;
            this.head = node;
            this.tail = node;
            //TODO & FIXME
        } else if (location == 0) {   //Case 1: Insert at start
            node.prev = null;
            node.next = head;
            head.prev = node;   //This says head.prev holds node's address. if (head.prev = node.next), which will have head.prev hold the address that node points which is itself.
            head = node;
        } else if (location >= size) {    //Case 2: Insert at last
            node.next = null;
            tail.next = node;
            tail = node;
        } else {    //Case 3: insert at specified location
            int counter = 0;
             /*
                Node<E> currentNode = head;
                for (int i = 0; i < position; i++) {    //can also use for loop to just move iterator (currentNode) to where u want it
                    currentNode = currentNode.next;
                }
             */
            for (Node iterator = head; iterator != null; iterator = iterator.next) {
                if (counter == location - 1) {
                    node.next = iterator.next;
                    iterator.next.prev = node;
                    iterator.next = node;
                    node.prev = iterator;

                    /*System.out.println(node.next.prev.data);
                    System.out.println(node.next.data);
                    System.out.println(node.next.data);*/
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
        System.out.print("HEAD <-> ");
        for (Node iterator = head; iterator != null; iterator = iterator.next) {
            System.out.print(iterator.data);
            System.out.print(" <-> ");
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

    public void deletionOfNode(int location) {
        if (head == null) {     //Check: Linked List does not exist
            System.out.println("Linked List is empty");
            return;
        } else if (location == 0) {   //Case 1: Delete first node
            if (head.next == null) {    //Check: if 1st node was only node in Linked List
                head = tail = null;
                --size;
                return;
            }

            head = head.next;
            head.prev = null;
        } else if (location >= size-1) {   //Case 2: Delete last node
            if (size == 1) {    //Check: if node is only node in Linked List
                head = tail = null;
                --size;
                return;
            }

            int count = 0;

            for (Node iterator = head; iterator.next != null; iterator = iterator.next) {
                if (iterator.next.next == null) {
                    tail = iterator;
                    iterator.next = null;
                    break;
                }
            }
        } else {   //Case 3: Delete middle node
            int count = 0;
            for (Node iterator = head; iterator.next != null; iterator = iterator.next) {
                if (count == location - 1) {
                    iterator.next = iterator.next.next;
                    iterator.next.prev = iterator;
                    break;
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










