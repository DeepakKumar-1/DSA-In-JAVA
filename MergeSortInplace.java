package Sorting;

import java.util.Arrays;

public class MergeSortInplace {
    // Merge Sort inplace Without Creating a Copy of Array
    public static void main(String [] args){
        int [] arr = {5,4,3,2,1};
        // Print Array Before Sorting
        System.out.println("Array Before Sorting is: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length-1);
        // Print Array After Sorting
        System.out.println("Array After Sorting is: " + Arrays.toString(arr));
    }
     static void mergeSort(int [] arr, int start, int end) {
         if (start < end) {
             // Find the Mid Index
             int mid = start + (end - start) / 2;
             // Apply Merge Sort on the First Half of the Array i.e from start to mid
             mergeSort(arr, start, mid);
             // Apply Merge Sort on the Second Half of the Array i.e from start to mid
             mergeSort(arr, mid + 1, end);
             // Now Merge the First and Second Half of the Array
             merge(arr, mid, start, end);
         }
     }

     static void merge(int []arr, int mid, int start, int end){
        int i = start;
        int j = mid + 1;
        int k = start;
        int [] mix  = new int[arr.length];

        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
                k++;
            } else{
                mix[k] = arr[j];
                j++;
                k++;
            }
        }
        // Above loop will end Only when Either i or j is Not Complete
         // if i is not Completed the Copy all the Element of i to mix Array
         while(i <= mid){
             mix[k] = arr[i];
             i++;
             k++;
         }
         while(j <= end){
             mix[k] = arr[j];
             j++;
             k++;
         }

         // Now Sorted Array in the Main Array
         for(int c = start; c <= end; c++){
            arr[c] = mix[c];
        }
     }
}
