import java.util.Scanner;

public class printPrimeTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int low = scn.nextInt();
        System.out.println("Enter the last number");
        int high = scn.nextInt();

        for(int i = low; i <= high; i++)
        {
            if (i == 1)
            {
                i++;`
            }
            int count = 0;
            for(int div = 2; div * div <= i; div++)
            {
                if ( i % div == 0)
                {
                    count++;
                    break;
                    
                }

            }
           
            if (count == 0)
            {
                System.out.println(i);
            }
        }

    }
    
}
