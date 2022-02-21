/*
Assignment: Debugging Challenge
Notes: The program should prompt the user for an array size. The user will then input two arrays, the index of the first array should be
multiplied by the corresponding index of the second array using a method.
e.g. arr1[0] * arr2[0], arr1[1] * arr2[1], arr1[2] * arr2[2], etc.

The console should display the correct index address and the total.

Sample input:
array size: 2
arr1 values: 1, 2
arr2 values: 3, 4

calculations
1 * 3 = 3
2 * 4 = 8

output:
Index 0's total is: 3
Index 1's total is: 8

 */

import java.util.Scanner;
public class ArrayTimesTable {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an array size: ");
        int arraySize = keyboard.nextInt();
        int[] arr1 = new int[arraySize], arr2 = new int[arraySize];

        System.out.println("Input the values for the first array: ");
        for(int i = 0; i < arr1.length; i++){
            int firstArray = keyboard.nextInt();
            arr1[i] == firstArray;
        }

        System.out.println("Input the values for the second array: ");
        for(int i = 0; i < arr1.length; i++){
            int secondArray = keyboard.nextInt();
            arr2[i] == secondArray;
        }

        void(arr1, arr2);
    }

    static void(int[] arr1, int[] arr2){
        for(int i = 0; i < arr1.length; i++){
            int total = arr1[i] * arr2[i];
            System.out.println("Index " + i+1 + "'s total is: " + total);
        }
    }
}