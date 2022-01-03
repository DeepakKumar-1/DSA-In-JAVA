import java.util.Scanner;
import java.util.Arrays;
public class CyclicSort {
    // Cyclic Sort
    public static void main(String [] args){
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking SIZE of 1D Array from the USER
        System.out.print(" Enter SIZE of 1D Array: ");
        int n = sc.nextInt();
        // Creating Array of Required SIZE
        int [] arr = new int[n];
        // Fill this Array By taking n number of Inputs from the USER
        System.out.print(" Enter " + n + " Elements: ");
        // Storing Inputs in the Array
        for(int i=0; i< arr.length ; i++)
            arr[i]  = sc.nextInt();
        // Displaying the Array Before Sorting
        System.out.println(" Array Before Sorting is: " + Arrays.toString(arr));
        // Applying Cyclic Sort
        cyclicSort(arr);
        // Displaying Array After Sorting
        System.out.println(" Array After Sorting is: " + Arrays.toString(arr));
    }
    // Method of Cyclic Sort
     static void cyclicSort(int [] arr){
        // IMPORTANT NOTE --> When Given Numbers from range 1 to N --> USE Cyclic Sort
         // This Will only Work for Numbers Given in range 1 to N
         // Not for range 0 to N
         // For 0 to N use i == arr[i]   --> Because in that Case Every Element must have i as a Correct Index in Sorted Array
         for(int i=0; i<arr.length;){
             if(i == arr[i] - 1)
                 // if Element is not at Correct Index Move ahead
                 i++;
             else
                 // Otherwise Swap the Element at Current Index with Element at Correct Index
                 swap(arr, i, arr[i] - 1);
         }
    }
    // Method to Swap two Elements
    static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a]   = arr[b];
        arr[b]   = temp;
    }
}
