import java.util.Scanner;
public class isPalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int temp = n;
        int sum = 0;
        while ( temp != 0)
        {
            int a = temp % 10;
            sum = sum * 10 + a;
            temp = temp / 10;
        }
        if ( n == sum)
        {
            System.out.println("is Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
    
}
