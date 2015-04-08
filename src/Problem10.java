public class Problem10 {

    public static long solve() {
        int N = 2000000;

        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i*i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i; i*j <= N; j++) {
                    isPrime[i*j] = false;
                }
            }
        }

        long sum = 0;

        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                sum += i;
            }
        }

        return sum;
    }

}
