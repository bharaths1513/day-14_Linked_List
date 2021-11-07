package day14;

// Created Node class

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Node{" + "data=" + data + ", next=" + next;
	}

}

class operations {

	// Taking variables to store the head

	Node head;
	Node tail;

	public Node pushData(int data) {

		// created the object of the Node class to get the address of the Node and
		// passing the "data" it will store in constructor
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
		} else {

			// swapping the value to get the new node address

			Node temp = head;
			this.head = newnode;
			newnode.next = temp;

		}
		return newnode;

	}

	public void print() {
		if (head == null)
			System.out.println("Empty LinkList");

		else {

			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}

		}

	}

	public void append(int data) {

		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			tail = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;

		}
	}

	public void inBetweenInsert(Node previousNode, Node newNode) {
		Node tempNode = previousNode.next;
		previousNode.next = newNode;
		newNode.next = tempNode;

	}

	public void pop() {
		this.head = this.head.next;
	}

}

public class linkedlist {

}
