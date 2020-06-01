package com.alayo.app;

public class CSLL {
}

/*
##Circular Singly Linked List (CSLL)

#####++Common Operations:++
* Creation of Linked List
* Insertion
* Traversal
* Searching
* Deletion of a node from a Linked List
* Deletion of a Linked List

#####++1. Creation of a CSLL++
>Time Complexity: O(1)
>Space Complexity: O(1) *(since only creating head, tail, and node)*

```CSS
createLinkedList(nodeValue):
O(1)	create a head, tail ptr, and initialize with NULL
O(1)	create a blank node
O(1)		a) node.value = nodeValue;
O(1)		b) node.next = node;	//Node will point to itself
O(1)	head = node; (since node 1 is first node) -> creates link
O(1)	tail = node; (since node 1 is last node) -> creates link
```

#####++2. Insertion of a CSLL++
>Time Complexity: O(n)
>Space Complexity: O(1) *(since only creating head, tail, and node)*

* There are 3 cases to consider:
	1. Insert at start of LL
	2. Insert at end of LL
	3. Insert in middle of LL

```CSS
insertInLinkedList(head, nodeValue, location):
O(1)	create a blank node
O(1)		a) node.value = nodeValue;
O(1)	if(!existsLinkedList(head))
O(1)		return error;	//Linked list does not exist
O(1)	else if(locatoin equals 0)    //Case 1: Insert at start
O(1)		node.next = head;
O(1)		head = node; tail.next = head
O(1)	else if(location equals last)	//Case 2: Insert at last
O(1)		node.next = head;
O(1)		tail.next = node;
O(1)		tail = node		//to keep track of last node
O(1)	else	//Case 3: insert at specified location
O(n)		loop: tmpNode = 0 to location - 1;	//loop till we reach specified node & end the loop
O(1)		node.next = tempNode.next;
O(1)		tmpNode.next = node;
```

#####++3. Traversal of a CSLL++
>Time Complexity: O(n)
>Space Complexity: O(1) *(since only creating head, tail, and node)*

```CSS
traverseLinkedList(head):
O(1)	if(head == NULL), then return;
O(n)	loop: head to tail
O(1)		print currentNode.value;
```

#####++4. Searching a node of a CSLL++
>Time Complexity: O(n)
>Space Complexity: O(1) *(since only creating head, tail, and node)*

```CSS
searchNode(head, nodeValue):
O(n)	loop: tmpNode = start to tail
O(1)		if(tmpNode.value equals nodeValue)
O(1)			print tmpNode.value	//node value found
O(1)			return;
O(1)	return	//node value not found
```

#####++5. Deletion of a node from a CSLL++
>Time Complexity: O(n)
>Space Complexity: O(1) *(since only creating head, tail, and node)*

* There are 3 cases to consider:
	1. Delete first node
	2. Delete last node
	3. Delete middle node

```CSS
deletionOfNode(head, location):
O(1)	if(!existsLinkedList(head))
O(1)		return error;	//Linked List does not exist
O(1)	else if(location equals 0)	//Case 1: Delete first node
O(1)		head = head.next; tail.next = head;
O(1)		if this was the only node in list, then update head = tail = node.next = null;
O(1)	else if(location >= last)	//Case 2: Delete last node
O(1)		if(current node is only node in list) then, head = tail = node.next = null; return;
O(n)		loop till 2nd last node (tmpNode)
O(1)		tail = tmpNode; tmpNode.next = head;
O(1)	else 	//Case 3: Delete middle node
O(n)		loop: tmpNode = start to location - 1; //we need to traverse till we find the previous location
O(1)	tmpNode.next = tmpNode.next.next	//delete the required node
```

#####++6. Deletion of entire CSLL++
>Time Complexity: O(1)
>Space Complexity: O(1) *(since only creating head, tail, and node)*

```CSS
deleteLinkedList(head,tail):
O(1)	head = null;
O(1)	tail.next = null;
O(1)	tail = null;
```
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