public class Problem5 {

    public static double solve() {

        for (int i = 2520;;i += 20) {

            for (int j = 1; j <= 20; j++) {
                if (i % j != 0) {
                    break;
                }
                if (j == 20) {
                    return i;
                }
            }
        }
    }

}
