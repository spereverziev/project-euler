public class Problem7 {

    public static int solve() {
        int primeNumber = 0;
        int i = 1;

        while(primeNumber != 10001) {
            if (isPrime(i++)) {
                primeNumber++;
            }
        }
        return  i-1;
    }


    private static boolean isPrime(int n) {
        if (n%2==0) return false;

        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

}
