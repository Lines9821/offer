/**
 * @author cairunduo
 * @date 2019/10/4 - 1:37
 * <p>
 * 求斐波那契（Fibonacci) 数列的第n项
 */
public class Demo08 {
    public static long fibonacci(int n) {
        if (n <= 0) {
            throw new RuntimeException("invalid num...");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        //记录前两个数中第n-1个数
        long pre = 1;
        //记录前两个数记录第n-2个数
        long prePre = 1;
        long sum = pre + prePre;

        //递归思想
        for (int i = 3; i < n; i++) {
            sum = pre + prePre;
            prePre = pre;
            pre = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(95));
        System.out.println(fibonacci(0));
    }
}
