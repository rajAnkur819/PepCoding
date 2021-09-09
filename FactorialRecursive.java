public class FactorialRecursive {

    public static int fact(int n){
        if ( n == 1)
        {
            return 1;
        }
        int factnm1 = fact( n - 1);
        int ans = n * factnm1;
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
    
}
