//12.	Counting Distinct Elements in an Array

package in.set3;

import java.util.HashSet;
import java.util.Set;

public class DistinctElement {

	public static void main(String[] args) {
		int[] arr = { 4, 6, 2, 4, 3, 2, 4, 3, 6 };

		// Use a HashSet to store unique elements
		Set<Integer> uniqueElements = new HashSet<>();

		// Add elements to the HashSet
		for (int num : arr) {
			uniqueElements.add(num);
		}

		// The size of the HashSet is the count of distinct elements
		int countDistinct = uniqueElements.size();

		// Print the count of distinct elements
		System.out.println("The count of distinct elements is: " + countDistinct);
		
		// Print the unique elements
        System.out.println("The unique elements are: ");
        for (int num : uniqueElements) {
            System.out.print(num + " ");
        }
	}

}
