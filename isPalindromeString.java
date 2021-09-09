import java.util.Scanner;
public class isPalindromeString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int i = 0;
        int j = str.length() - 1;

        while (i < j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                System.out.println("Not a Palindrome");
                return;

            }
            else{
               i++;
               j--;
            }
        }
        System.out.println("is Palindrome");


    }
    
}
