import java.util.*;
public class barGraph {

      /*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a.
    */

    public static void main(String[] args) throws Exception {
    
    
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        
        // To take the input of the array
        
        int arr [] =  new int[n];
        for (int j = 0; j < n; j++ )
        {
            arr[j] = scn.nextInt();
        }
        
        
        // To find the max of the array
        
        int max = arr[0];
        for (int j = 1; j < n; j++ )
        {
            if (arr[j] > max)
            {
                max = arr[j];
            }
        }
        
        
        // To print the bar graph
        
        for(int i = max; i > 0; i--)
        {
             for (int j = 0; j < n; j++ )
             {
                 if (i > arr[j])
                 {
                     System.out.print("\t");
                 }
                 else
                 {
                     System.out.print("*\t");
                 }
             }
             System.out.println();
        }
    
     }
    
}
