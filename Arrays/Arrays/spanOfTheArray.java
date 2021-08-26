
import java.util.*;
public class spanOfTheArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int arr [] = new int [n];
        
        for(int i = 0; i < n; i++)
        {
           System.out.println("Enter the " + i + "th element");
            arr[i] = scn.nextInt();
        }
       
       int max = arr[0];
       int min = arr[0];
       
       
       for (int i = 0; i < n; i++)
       {
           if (arr[i] >= max)
           {
               max = arr[i];
           }
       }
       
        for (int i = 0; i < n; i++)
       {
           
           if (arr[i] <= min)
           {
               min = arr[i];
           }
       }
       System.out.print("The Span of the array is  ");
       System.out.print(max - min);
    }
    }
