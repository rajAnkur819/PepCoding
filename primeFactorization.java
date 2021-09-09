import java.util.Scanner;
public class primeFactorization {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 2; i * i <= n; i++){
            while(n % i == 0){
                System.out.print(i + " ");
                n = n / i;
            }
        }
        
        if(n != 1) // This is the prime factor having value greater than root n and there can only be one such factor
            System.out.print(n);
	}
}
