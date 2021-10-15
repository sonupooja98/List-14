package com.linklist;

import java.util.Scanner;

/*
 * Created Node class
 */
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
	Node tail;

	public void pushData(int data) {

		//created the object of the Node class to get the address of the Node and passing the "data" it will store in constructor
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

	public void append(int data) {

		Node newnode=new Node(data);
		if (head == null) {
			head=newnode;
			tail=newnode;
		}
		else {
			tail.next=	newnode;
			tail=newnode;

		}
	}

}


public class LinkList {
	
public static void addDataStart() {	
	operations link=new operations ();
	link.pushData(70);
	link.pushData(30);
	link.pushData(56);
	link.print();
}
	
public static void addDataEnd() {	
	operations link=new operations ();
	link.append(56);
	link.append(30);
	link.append(70);
	link.print();
}
	

	public static void main(String[] args) {

		System.out.println("*** Welcome To LinkList Program ***");
		Scanner sc= new Scanner(System.in);
		System.out.println();
		System.out.println("Press 1 to add data at start");
		System.out.println("Press 2 to add data at end");
		int input=sc.nextInt();
		
		switch (input) {
		
		/*
		 * if user press 1 then addDataStart method will execute data will be store at starting
		 */
		
		case 1:
			 addDataStart() ;
			break;

			/*
			 * if user press 2 then addDataEnd method will execute data will be store 
			 */
			
		case 2:
		
			addDataEnd();
			break;

		default:
			System.out.println("Invalid Choice");
			
		}
		
	}

}