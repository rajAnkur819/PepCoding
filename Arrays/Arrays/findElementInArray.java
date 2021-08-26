import java.util.*;

public class findElementInArray {

    public static void main(String[] args) throws Exception {
    
        // To take the input of n , d and array
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = scn.nextInt();
        
        
        int arr  [] = new int [n]; // To create a new array
       
        for(int i = 0; i < n ; i++)
        {
        System.out.println("Enter the " + i + "th element");
            arr[i] = scn.nextInt();
        }
        
         System.out.println("Enter the element that you want to search");
        int d = scn.nextInt();
        
        
        for(int i = 0; i < n ; i++)
        {
            if (arr[i] == d)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
        
         
    }}
        
     

    

