import java.util.Scanner;

public class digitsOfNumber {
    public static int don(int n){
        int count = 0;
        for(int i = 10; n != 0; n = n / i)
        {
            count ++;

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(don(n));
        
    }
    
}
