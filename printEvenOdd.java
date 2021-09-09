import java.util.Scanner;
public class printEvenOdd{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scn.nextInt();

        for(int i = 1; i <= n; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
                System.out.println(i - 1);
            }
           
            
        }



        
    }
}