import java.io.*;
import java.util.*;

public class differenceOfTwoArrays{
    
    
    /*
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

Assumption - number represented by a2 is greater.
    */



public static void main(String[] args) throws Exception {
    
    
    Scanner scn = new Scanner(System.in);
    
    // Input of array1 


    System.out.println("Enter the size of array 1");
    int n1 = scn.nextInt();
    int arr1[] = new int[n1];
    for(int i = 0; i < n1; i++)
    {
        System.out.println("Enter the " + i + "th element");
        arr1[i] = scn.nextInt();
    }
    
    
    
    // input of array2

    System.out.println("Enter the size of array 2");
      int n2 = scn.nextInt();
    int arr2[] = new int[n2];
    for(int i = 0; i < n2; i++)
    {
        System.out.println("Enter the " + i + "th element");
        arr2[i] = scn.nextInt();
    }
    
    // creating an ans array for difference
    
    int ans [] = new int [n2]; // By default it is assumed that n2 is larger
    
    int i = n1 - 1;
    int j = n2 - 1;
    int k = n2 - 1;
    int borrow = 0;
   
    
    
    while (k >= 0)
    {
      int  diff = ( arr2[j] - borrow ) ;
        
        if (i >= 0)
        {
            diff = diff - arr1[i];
        }
        
        if (diff >= 0)
        {
            ans[k] = diff;
            borrow = 0;
        }
        else
        {
            diff = diff + 10;
            ans[k] = diff;
            borrow = 1;
        }
        i--;
        j--;
        k--;
    }

    System.out.println("The differnce of the arrays is");
    
    
    i = 0;
    while (ans[i] == 0)
    {
        i++;
    }
    
    for (; i < ans.length; i++)
    {
        System.out.println(ans[i]);
    }
  
    }

    
 }