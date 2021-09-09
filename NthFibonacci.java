import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if (n == 0 || n == 1)
        {
            System.out.println(n);
            return;
        } 
        else{
            int a = 0;
            int b = 1;
            for(int i = 2; i <= n; i++)
            {
                int sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println(b);
        }

    }
    
}
