package com.problemset;

public class SecondLargestEle {

    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 9, 10, 45, 100};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
