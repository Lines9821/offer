/**
 * @author cairunduo
 * @date 2019/10/5 - 0:00
 *
 * 实现函数double Power(double base, int exponent)，求base的exponent次方。
 * 不得使用库函数，同时不需要考虑大数问题。
 */
public class Demo09 {
    public static double power(double base, int exponent) {
        //底数指数不能同时为 0
        if (base == 0 && exponent == 0) {
            throw new RuntimeException("invalid input. base and exponent both are zero...");
        }
        //指数为 0 就返回 1
        if (exponent == 0) {
            return 1;
        }
        //指数为 1 就返回原数字
        if (exponent == 1) {
            return base;
        }
        //求指数的绝对值
        long exp = exponent;
        if (exponent < 0) {
            exp = -exp;
        }
        double result = powerWithUnsignedExponent(base, exp);
        if (exponent < 0) {
            result = 1 / result;
        }
        return result;
    }

    private static double powerWithUnsignedExponent(double base, long exponent) {
        double result = 1.0;
        for (int i = 2; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(0.0000000000000000000000001111 == 0);
        System.out.println(0.0000000000000000000000000000 == 0);

        System.out.println(power(2, -4));
        System.out.println(power(2, 4));
        System.out.println(power(2, 1));
        System.out.println(power(2, 0));
        System.out.println(power(0.00000000000000000000000000001, -1));
        System.out.println(power(0.00000000000000000000000000001, 1));
        System.out.println(power(0.00000000000000000000000000001, 0));
        System.out.println(power(0.00000000000000000000000000000, 0));
    }
}
