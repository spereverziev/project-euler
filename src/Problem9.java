public class Problem9 {

    public static double solve() {

        for (int a = 1; a < 1000; a++) {
            for (int b = 1; b < 1000; b++) {
                int value = a * a + b * b;
                if (isPerfectSquare(value)) {
                    double c = Math.sqrt(value);
                    if (a + b + c == 1000) {
                        return a * b * c;
                    }
                }
            }
        }

        return 0;
    }


    private static boolean isPerfectSquare(long n) {
        if (n < 0)
            return false;

        switch ((int) (n & 0x3F)) {
            case 0x00:
            case 0x01:
            case 0x04:
            case 0x09:
            case 0x10:
            case 0x11:
            case 0x19:
            case 0x21:
            case 0x24:
            case 0x29:
            case 0x31:
            case 0x39:
                long sqrt;
                if (n < 410881L) {
                    //John Carmack hack, converted to Java.
                    // See: http://www.codemaestro.com/reviews/9
                    int i;
                    float x2, y;

                    x2 = n * 0.5F;
                    y = n;
                    i = Float.floatToRawIntBits(y);
                    i = 0x5f3759df - (i >> 1);
                    y = Float.intBitsToFloat(i);
                    y = y * (1.5F - (x2 * y * y));

                    sqrt = (long) (1.0F / y);
                } else {
                    //Carmack hack gives incorrect answer for n >= 410881.
                    sqrt = (long) Math.sqrt(n);
                }
                return sqrt * sqrt == n;

            default:
                return false;
        }
    }
}
