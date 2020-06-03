package com.alayo.app;

public class CSLL {
    //Note: head & tail are references to something that will be of Node type. Don't let "Node" confuse u.
    //only when u use new Node(30) is when u instantiate an object of Node type. (head = new Node(30))
    //head (in the stack) will store the address of the new Node object (in the heap) that contains the data =30.
    //All in all, head (reference type) just holds the address aka points to the 1st node in Linked List. It is not
    //a node itself, just a reference to the first node.
    //so head and tail should not be treated as nodes but as reference variables (aka variables that hold addresses of objects or Nodes)
    private Node head;  //why isn't head used with new. so does it not have data, next properties (answer above^^)
    private Node tail;
    private int size;

    public CSLL() {
        head = null;
        tail = null;
    }

    public CSLL(Node node) {
        node.next = node;   //Node will point to itself
        head = node;
        tail = node;
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
            node.next = node;
            head = node;
            tail = node;
        } else if (location == 0) {   //Case 1: Insert at start
            /*if (size == 1) {
                node.next = head;
                head = node;
                tail.next = head;
            }
            */
            node.next = head;   //whatever address head is holding, put it in node's .next data field. so now node is pointing to that
            head.next = node;
            head = node;
           /* node.next = head;
            head = node;*/
            //tail = head;    //last node points to first node
        } else if (location >= size) {    //Case 2: Insert at last      //why head.next (or head) = node; node.next = head; tail = node; giving infinite loop
            if(size == 1) {
                node.next = head;
                head.next = node;
                tail = node;
            } else {
            //traverseLinkedList();
            /*for (Node iterator = head; iterator.next != head; iterator = iterator.next) {
                if (iterator.next == head) {
                    node.next = head;
                    iterator.next = node;
                    tail = node;
                    break;
                }
            }*/

            //head = node;    //head should hold reference of node, so not node = head
            //tail = node;

                node.next = head;
                tail.next = node;
                tail = node;
            }
            //traverseLinkedList();
        } else {    //Case 3: insert at specified location
            int counter = 0;
            for (Node iterator = head; iterator.next != head; iterator = iterator.next) {
                if (counter == location - 1) {
                    node.next = iterator.next;
                    iterator.next = node;
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

        Node iterator = head;

        while (iterator.next != head) {
            System.out.print(iterator.data);
            System.out.print(" -> ");
            iterator = iterator.next;
        }
        //if did it with for loop couldn't print out last node since for loop initiates iterator within braces
        System.out.print(iterator.data);

        /*
        do{
            System.out.print(iterator.data);
            if(size > 1) {
                System.out.print(" -> ");
            }
            iterator = iterator.next;   //this will update it to 10 again, can use if statement to prevent 10 printing out twice.
        } while(iterator.next != head);

        if (size > 1) {
            System.out.print(iterator.data);
        }
        */
        /*
        for (Node iterator = head; iterator.next != head; iterator = iterator.next) {
            System.out.print(iterator.data);
            System.out.print(" -> ");
        }
         */
        System.out.println(" -> COMPLETED FULL ITERATION");
    }

    public int searchNode(int nodeValue) {
        if (head == null) {
            System.out.println("No Linked List found");
            return -1;
        }

        int counter = 0;

        Node iterator = head;
        while (iterator.next != head) {
            if (iterator.data == nodeValue) {
                return counter;
            }
            ++counter;
            iterator = iterator.next;
        }

        if (iterator.data == nodeValue) {
            return counter;
        }

        return -1;
    }

    //barely changed anything from SLL
    public void deletionOfNode(int location) {
        if (head == null) {     //Check: Linked List does not exist
            System.out.println("Linked List is empty");
            return;
        } else if (location == 0) {   //Case 1: Delete first node
            if (head.next == head) {    //Check: if 1st node was only node in Linked List
                head = null;
                tail = null;
                --size;
                return;
            }

            head = head.next;
            tail.next = head;

        } else if (location >= size) {   //Case 2: Delete last node
            if (size == 1) {    //Check: if node is only node in Linked List
                head = null;
                tail = null;
                --size;
                return;
            }

            for (Node iterator = head; iterator.next != null; iterator = iterator.next) {
                if (iterator.next.next == tail.next) {
                    tail = iterator;
                    iterator.next = head;
                    break;
                }
            }

        } else {   //Case 3: Delete middle node
            int count = 0;
            for (Node iterator = head; iterator.next != tail.next; iterator = iterator.next) {
                if (count == location - 1) {
                    iterator.next = iterator.next.next;
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