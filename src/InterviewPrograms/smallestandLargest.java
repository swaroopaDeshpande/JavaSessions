package InterviewPrograms;

import java.util.Arrays;

public class smallestandLargest {

	public static void main(String[] args) {

		int numbers[] = {0, -100,-10, -24, -50, -88, -98765678 ,-98765679};
		int smallest = numbers[0];
		int largest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("/n given array is ::: " + Arrays.toString(numbers));
		System.out.println("Largest Number of array is ::: " + largest);
		System.out.println("Smallest number of array is ::: " + smallest);
	}

}
