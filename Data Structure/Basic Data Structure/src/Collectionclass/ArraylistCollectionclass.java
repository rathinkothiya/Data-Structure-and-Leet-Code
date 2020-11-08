package Collectionclass;

import java.util.*;

public class ArraylistCollectionclass {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(21);
		al.add(15);
		al.add(12);
		al.add(220);
		System.out.println("The size of the arraylist is " + al.size());

		// remove the index value.
		al.remove(0);
		// get to fetch the value
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// fetch the value in another format
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			//.next will more to the next element in the ArrayList
			if (itr.next().equals(220)) {
				itr.remove();
			}
		}
		System.out.println("The size of array list is " + al.size());
		
		//Array list to normal array
		Integer[] arr=new Integer[al.size()];
		arr=al.toArray(arr);
		for (int i :arr) {
			System.out.println("The array   " + i);
		}
	 	
	}
	
	

	
}
