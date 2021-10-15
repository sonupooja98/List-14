package com.linklist;


class Node{ 
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}
class operations{


	/*
	 * Taking variables to store the head 
	 */
	Node head;

	public void pushData(int data) {

		
		Node newnode= new Node(data);

		if(head == null) {

			head=newnode;

		}
		else {
					/*
					 * swapping the value to get the new node address 
					 */
			Node temp= head;
			this.head=newnode;
			newnode.next=temp;

		}

	}

	public void print() {
		if (head== null)
			System.out.println("Empty LinkList");


		else {

			Node temp= head;
			while(temp!=null) {
				System.out.print(temp.data+" -> ");
				temp= temp.next;
			}

		}


	}

}


public class LinkList {

	public static void main(String[] args) {

		System.out.println("*** Welcome To LinkList Program ***");

		operations link=new operations ();
		link.pushData(70);
		link.pushData(30);
		link.pushData(56);
		link.print();
	}

}