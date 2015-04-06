public class Problem4 {
    public static int solve() {

        int largest = 0;

        for (int i = 999; i >= 800; i--) {
            for (int j = 999; j >= 800; j--) {
                int value = i * j;
                if (isNumberPalindrome(value)) {
                    if (largest < value) {
                        largest = value;
                    }
                }
            }
        }

        return largest;
    }


    public static boolean isNumberPalindrome(int value) {
        char[] numbers = String.valueOf(value).toCharArray();

        int length = numbers.length;
        int i = 0;
        while (i < length / 2) {
            if (numbers[i] == numbers[length - i - 1]) {
                i++;
            } else {
                break;
            }
        }
        return i == length / 2;
    }
}
