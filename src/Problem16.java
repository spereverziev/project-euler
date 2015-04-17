import java.math.BigDecimal;

public class Problem16 {

    public static int solve() {
        int result = 0;
        BigDecimal value = new BigDecimal(Math.pow(2, 1000));
        for (Character c : value.toString().toCharArray()) {
            result += Character.getNumericValue(c);
        }

        return result;
    }

}
