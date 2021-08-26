import java.util.Scanner;
import java.io.*;
import java.util.*;

public class sumOfTwoArrays {

     /*
    1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to add the numbers represented by two arrays and print the
arrays.
    */

public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    
    
    // To take input of of the first array
    System.out.println("Enter the size of array 1");
    int n1 = scn.nextInt();
    int arr1 [] = new int [n1];
    for(int i = 0; i < n1; i++)
    {
        System.out.println("Enter the " + i + "th element");
        arr1[i] = scn.nextInt();
    }
    
    // To take input of of the second array
    
    System.out.println("Enter the size of array 2");
     int n2 = scn.nextInt();
     int arr2[] = new int [n2];
    for(int i = 0; i < n2; i++)
    {
        System.out.println("Enter the " + i + "th element");
        arr2[i] = scn.nextInt();
    }
    
    // We have created a third array to store the answer
    int sz = Math.max(n1, n2) + 1;
    int ans [] = new int [sz];
    
    // We will use here three variables i j and k for the arrays n1 n2 and the ans and initialise them with the last index of their respective arrays
    
    int i = n1-1;
    int j = n2 - 1;
    int k = ans.length - 1;
    int carry = 0;
    int sum = 0;
    
    
    while( k >= 0)   // We will not use k != 0 here because in that case k will not consider the 0th index
    {
        sum =  carry;    // Here its is important to check for i and j as to protect them if they are negative
        
        if(i >= 0)
        {
            sum = sum + arr1[i];
        }
        
        if (j >= 0)
        {
            sum = sum + arr2[j];
        }
        
        if (sum < 10)
        
        {
            ans[k] = sum;
            carry = 0;
        }
        else
        {
            carry = 1;
            sum = sum - 10;
            ans[k] = sum;
            
        }
      
        
        i--;
        j--;
        k--;
    }

    System.out.println("The sum of the two array is");
    
    // To print the ans array
    
    for( i =0; i < ans.length; i++)
    {
        if(i == 0 && ans[0] == 0)
        {
          // There is no need to print a 0 at the 0th index
        }
        else
        {
            System.out.println(ans[i]);
        }
}
    
 }

}
    

