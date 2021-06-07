package com.company;

import Exc3.ArrayProcessing;

import java.util.Arrays;

public class Main {

     // Exc. 4
    /**Sorts the elements in array.
     * @param arr [] is the array which we want to sort.
     * @param start is the first element of the array.
     * @param end is the last element of the array.*/
    public static void quickSort(int[] arr, int start, int end){
        int partition = partition(arr, start, end);

        if(partition-1>start) {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];

        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }

        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;
    }

    //Exc.5
    /**Reverses the array.
     * @param a [] is the array which we want to reverse.
     * @param n is the number of elements in the array.*/
    static void reverse(int a[], int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        /*printing the reversed array*/
        System.out.println("Reversed array is: ");
        for (int k = 0; k < n; k++) {
            System.out.print(b[k] + ", ");
        }
    }

    public static void main(String[] args) {
        //Exc. 3
        ArrayProcessing arrayProcessing = new ArrayProcessing();
        int array[] = {12,3,4,15,64,25,78};
        System.out.println("All elements in the array are: " );
        arrayProcessing.printArray(array);
        System.out.println("\nSum of given array is: " + arrayProcessing.getSum(array));
        System.out.println("The smallest element of the array is: " + arrayProcessing.getMinElement(array));

        //Exc. 5
        reverse(array, array.length);

        //Exc. 4
        quickSort(array, 0, array.length-1);
        System.out.println("\nSorted array is: " );
        System.out.println(Arrays.toString(array));

    }
}
