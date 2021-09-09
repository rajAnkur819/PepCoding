import java.util.Scanner;

public class NthFibonacciRecursive {

    public static int fib(int n){
        if ( n == 0 || n == 1)
        {
            return n;
        }
        else{
            int a = fib(n - 1);
            int b = fib(n - 2);
            int c = a + b;
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fib(n));
        
        
    }
    
}
