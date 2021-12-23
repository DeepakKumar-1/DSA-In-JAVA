import java.util.Scanner;
import java.util.Arrays;

public class LinearSearch {
    // Linear Search
    public static void main(String [] args){
        // Creating Scanner Object For Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take SIZE of Input Array from the USER
        System.out.print(" Enter SIZE of the ARRAY: ");
        int n = sc.nextInt();
        // Create an Array of Require SIZE i.e of SIZE n
        int [] arr = new int[n];
        // Fill this Array By taking n Inputs from the USER
        System.out.print(" Enter " + n  + " Elements: ");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        // Take the Target Element that USER wants to Find
        System.out.print(" Enter Element that You Want to Find : ");
        int target = sc.nextInt();
        // Display Is Element Found in Given Array or Not
        if(linearSearch(arr, target))
            System.out.println(" Congratulations!! " + target + " Found in the Array " + Arrays.toString(arr));
        else
            System.out.println(" Sorry!! " + target + " Doesn't Found in the Array " + Arrays.toString(arr));
    }

    static boolean linearSearch(int [] arr, int target){
        for(int element : arr){   // For Every Element in Array
            if(element == target)  // Check Is the Element a Target Element or Not ?
                // if YES then return true
                return true;
        }
        // otherwise Return False
        return false;
    }
}
