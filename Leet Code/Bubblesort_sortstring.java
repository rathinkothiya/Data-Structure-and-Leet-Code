class Bubblesort_sortstring {
    /**
    This is the code for sorting the character of any string using bubble sort.
    Example
    Input:
    "tree"
    
    Output:
    "eert"
     */
	public static void main(String args[]) {
        //convert string to char array 
		char[] carray = "tree".toCharArray();
		//calculate the length of the array
        int length_carray = carray.length;
		//complexity is o(n*n)
        //
		for (int i = 0; i < length_carray; i++) {
			for (int j = i + 1; j < length_carray; j++) {
				if (carray[i] > carray[j]) {
					char temp = carray[i];
					carray[i] = carray[j];
					carray[j] = temp;
					
				}
				
			}
		}
		System.out.println("Inverted String Using Bubble sort = " + String.valueOf(carray));
	}
}