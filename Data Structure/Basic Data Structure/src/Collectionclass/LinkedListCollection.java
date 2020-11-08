package Collectionclass;

import java.util.LinkedList;

public class LinkedListCollection {

	public static void main(String[] args) {

		LinkedList<String> ll=new LinkedList<String>();
		ll.add("val");
		ll.add("val1");
		ll.add("val2");
		ll.add("val3");
		ll.addFirst("val4");
		ll.addLast("val4");
		
		//size of linked list
		System.out.println("The size of the linkedlist is  =  " + ll.size() );
		//print the linked List
		System.out.println("The size of the linkedlist is  =  " + ll );
		ll.remove("val1");		
		System.out.println("The size of the linkedlist is  =  " + ll );
		ll.remove(2);
		System.out.println("The size of the linkedlist is  =  " + ll );
		ll.removeLast();
		System.out.println("The size of the linkedlist is  =  " + ll );
	
	}

}
