public class findGCDandLCM {
    public static void main(String[] args) {
        int a = 32;
        int b = 42;
        int n1 = 32;
        int n2 = 42;

        while (n2 % n1 != 0)
        {
            int rem = n2 % n1;
            n2 = n1;
            n1 = rem;
        }
        int GCD = n1;
        int LCM = (n1 * n2) / GCD;
        System.out.println("LCM of " + a + " and " + b + "is - " + LCM);
        System.out.println("GCD of " + a + " and " + b + "is - " + GCD);
    }
}
