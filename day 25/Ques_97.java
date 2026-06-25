// Write a program to Merge Two Sorted Arrays.

import java.util.Scanner;

public class Ques_97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first sorted array
        System.out.print("Enter the size of the first sorted array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter elements of the first sorted array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input for second sorted array
        System.out.print("Enter the size of the second sorted array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter elements of the second sorted array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merging the two sorted arrays
        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        // Displaying the merged array
        System.out.println("Merged Sorted Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int[] mergedArray = new int[size1 + size2];

        int i = 0, j = 0, k = 0;

        // Merging process
        while (i < size1 && j < size2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < size1) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < size2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}