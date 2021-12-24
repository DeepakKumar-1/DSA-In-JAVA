
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    // Binary Search  --> Only Works for Sorted Array
    public static void main(String [] args) {
        // Creating Scanner Object For Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take SIZE of Input Array from the USER
        System.out.print(" Enter SIZE of the ARRAY: ");
        int n = sc.nextInt();
        // Create an Array of Require SIZE i.e of SIZE n
        int[] arr = new int[n];
        // Fill this Array By taking n Inputs from the USER
        System.out.print(" Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Take the Target Element that USER wants to Find
        System.out.print(" Enter Element that You Want to Find : ");
        int target = sc.nextInt();
        // Display Is Element Found in Given Array or Not
        if (binarySearch(arr, target))
            System.out.println(" Congratulations!! " + target + " Found in the Array " + Arrays.toString(arr));
        else
            System.out.println(" Sorry!! " + target + " Doesn't Found in the Array " + Arrays.toString(arr));
    }

    static boolean binarySearch(int [] arr, int target){
        // Take Two Pointers
        // Start and End
        int start = 0;
        int end   = arr.length - 1;
        while(start <= end){
            // find mid
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
                return true;
            else if(arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }
}
