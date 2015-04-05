public class Problem6 {

    public static double solve() {
        return getSquareOfTheSumForFirst100Numbers() - getSumOfTheSquaresForFirst100Numbers();
    }

    private static double getSumOfTheSquaresForFirst100Numbers() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i,2);
        }
        return sum;
    }

    private static double getSquareOfTheSumForFirst100Numbers() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return Math.pow(sum,2);
    }


}