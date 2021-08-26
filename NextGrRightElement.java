import java.util.Scanner;
import java.util.*;

public class NextGrRightElement {

    public static int [] solve (int arr [])
    {
        int n = arr.length;

        int ans [] = new int [n];

        Stack <Integer> st = new Stack <>();

        for (int i = n - 1; i >= 0; i--)
        {
            while (st.size() > 0 && arr[i] > st.peek())
            {
                st.pop();
            }

            if (st.size() == 0)
            {
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }

            st.push(arr[i]);
        }
        return ans;

    }

    public static void print (int arr [])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr [] = {2,5,9,3,1,12,6,8,7};
        int a [] = solve(arr);
        print(a);
      
        
    }
    
}
