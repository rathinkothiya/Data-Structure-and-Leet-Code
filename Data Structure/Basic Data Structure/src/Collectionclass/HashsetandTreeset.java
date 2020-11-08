package Collectionclass;

import java.util.HashSet;
import java.util.TreeSet;

public class HashsetandTreeset {
	public static void main(String args[]) {
		//note:- it is not stored in a same order.
		HashSet<String> hs = new HashSet<String>();
		hs.add("string1");
		hs.add("string2");
		hs.add("string3");
		hs.add("string4");
		hs.add("string5");
		hs.add("string6");
		hs.add("string7");
		hs.add("string8");
		hs.add("string9");
		System.out.println("The HasSet Value is " + hs);
		//for that we can use treeset.
		TreeSet<String> tr=new TreeSet<String>();
		tr.add("string1");
		tr.add("string2");
		tr.add("string3");
		tr.add("string4");
		tr.add("string5");
		tr.add("string6");
		tr.add("string7");
		tr.add("string8");
		tr.add("string9");
		System.out.println("The TreeSet Value is " + tr);
		
	}
}
