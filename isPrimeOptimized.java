import java.util.Scanner;

public class isPrimeOptimized {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number of Test cases");
        int testCase = scn.nextInt();

        for(int j = 1; j <= testCase; j++)
        {
        System.out.println("Enter the Number");
        int n = scn.nextInt();
        if ( n == 1)
        {
         System.out.println("Neither prime nor composite");
            return;
        }
      

        int count = 0;

        for (int i = 2; i * i  <= n; i++)
        {
           

            if (n % i == 0)
            {
                count++;
                break;
            }
        }

        if (count > 0)
        {
            System.out.println("Not Prime");
        }
        else
        {
            System.out.println("Prime");
        }
    }

    }
}
