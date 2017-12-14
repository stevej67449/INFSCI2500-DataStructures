public class TestDate {

	public static void main (String[] args) {

		// Create Date objects to compare
		Date m = new Date(); 
		Date n = new Date(1,1,2002);
		Date p = m;
		Date k = new Date(5,7,1480);
		Date j = new Date();

		// Display all the Dates to the user
		System.out.println("Date m is " +  m.toString());
		System.out.println("Date n is " +  n.toString());
		System.out.println("Date p is " +  p.toString());
		System.out.println("Date k is " +  k.toString() + "\n");

		// Test if the '==' operator works for each pair
		// Compare m and n
		if (m == n) {
			System.out.println("m == n true");
		} else {
			System.out.println("m == n false");
		}

		// Compare m and p
		if (m == p) {
			System.out.println("m == p true");
		} else {
			System.out.println("m == p false");    	  
		}

		// Compare m and k
		if (m == k) {
			System.out.println("m == k true");
		} else {
			System.out.println("m == k false");    	  
		}

		// Compare m and j
		if (m == j) {
			System.out.println("m == j true");
		} else {
			System.out.println("m == j false\n");    	  
		}

		// Test the 'equals()' method for each pair
		// Compare m and n
		if (m.equals(n)) {
			System.out.println("m.equals(n) is true");
		} else {
			System.out.println("m.equals(n) is false");
		}

		// Compare m and p
		if (m.equals(p)) {
			System.out.println("m.equals(p) is true");
		} else {
			System.out.println("m.equals(p) is false");
		} 

		// Compare m and k
		if (m.equals(k)) {
			System.out.println("m.equals(k) is true");
		} else {
			System.out.println("m.equals(k) is false");
		} 

		// Compare m and j
		if (m.equals(j)) {
			System.out.println("m.equals(j) is true");
		} else {
			System.out.println("m.equals(j) is false");
		} 

	} // End of main method

} // End of TestDate class