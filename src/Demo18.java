/**
 * @author cairunduo
 * @date 2019/10/6 - 2:17
 *
 * 顺时针打印矩阵
 * 未完待续。。。
 */
public class Demo18 {
    /**
     *
     * @param numbers 输入的二维数组，二维数组必须是N*M的
     */
    public static void printMatrixClockWisely(int[][] numbers) {
        // 输入的参数不能为空
        if (numbers == null) {
            return;
        }

        // 记录一圈（环）的开始位置的行
        int x = 0;
        // 记录一圈（环）的开始位置的列
        int y = 0;
        // 对每一圈（环）进行处理，
        // 为了成环，行号最大是(numbers.length-1)/2
        // 为了成环，列号最大是(numbers[0].length-1)/2
        while (x * 2 < numbers.length && y * 2 < numbers[0].length) {
            printMatrixInCircle(numbers, x, y);
            // 指向下一个要处理的的环的第一个位置
            x++;
            y++;
        }
    }

    private static void printMatrixInCircle(int[][] numbers, int x, int y) {
    }


}
