
import java.util.*;

class Bubblesort_sortbasedonfrequency {

	/**
	Code to organize the string based on frequency
	EG.Given a string, sort it in decreasing order based on the frequency of characters.
	
	Example 1:
	Input:
	"tree"
	Output:
	"eert"
	Explanation:
	'e' appears twice while 'r' and 't' both appear once.
	So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
	
	Example 2:
	Input:
	"cccaaa"
	Output:
	"cccaaa"
	Explanation:
	Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
	Note that "cacaca" is incorrect, as the same characters must be together.
	
	Example 3:
	Input:
	"Aabb"
	Output:
	"bbAa"
	Explanation:
	"bbaA" is also a valid answer, but "Aabb" is incorrect.
	Note that 'A' and 'a' are treated as two different characters.

	 */
	public static void main(String args[]) {
		char[] carray = "raaeaedere".toCharArray();
		int length_carray = carray.length;

		//create a hasmap to store the details of string where key will be the character and the value will 
		//be the count of character 
		HashMap<String, String> stringval = new HashMap<String, String>();

		//saving all the data to hashmap.
		for (int i = 0; i < length_carray; i++) {
			String temp1 = stringval.get(String.valueOf(carray[i]));
			if (temp1 == null) {
				stringval.put(String.valueOf(carray[i]), "1");

			} else {
				int temp = Integer.parseInt(stringval.get(String.valueOf(carray[i])));

				temp = temp + 1;
				stringval.put(String.valueOf(carray[i]), Integer.toString(temp));
			}
		}

		Set<String> keys = stringval.keySet(); //fetching all the available keys
		int length_dict = stringval.size(); //fetching the size of all the keys
		int[] carray1 = new int[length_dict];
		char[] keys1 = new char[0];

		for (String Keys : keys) {
			keys1 = Arrays.copyOf(keys1, keys1.length + 1);
			keys1[keys1.length - 1] = Keys.charAt(0);
			
		}
		System.out.println(keys);
    //copying values to another int array
		for (int i = 0; i < keys1.length; i++) {
			carray1[i] = Integer.parseInt(stringval.get(String.valueOf(keys1[i])));
		}
        //sorting using bubble sort
		for (int i = 0; i < length_dict; i++) {
			for (int j = i + 1; j < length_dict; j++) {
				if (carray1[i] < carray1[j]) {
					int temp = carray1[i];
					carray1[i] = carray1[j];
					carray1[j] = temp;

				}
			}
		}
		String finals = "";
		int size = carray1.length;
		int another_len = length_dict;
        //sorting based on keys using the newly created array that contains the sorted value
		for (int i = 0; i < length_dict; i++) {

			for (int j = 0; j <= another_len; j++) {
				System.out.println("I am inside i loop"+i);
				System.out.println(keys1[j]+""+stringval.get(String.valueOf(keys1[j])));
				if (stringval.get(String.valueOf(keys1[j])) != null) {

					if (Integer.parseInt(stringval.get(String.valueOf(keys1[j]))) == carray1[i]) {
						for (int k = 0; k < Integer.parseInt(stringval.get(String.valueOf(keys1[j]))); k++) {
							finals += String.valueOf(keys1[j]);
						}
						stringval.remove(String.valueOf(keys1[j]));
						break;
					}
				}
			}

		}
		System.out.print(finals);
	}
}