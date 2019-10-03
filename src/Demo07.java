/**
 * @author cairunduo
 * @date 2019/10/4 - 0:45
 *
 * 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾， 我们称之数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3, 4, 5, 1, 2｝为｛1 ,2, 3, 4, 5}的一个旋转，该数组的最小值为 1
 */
public class Demo07 {
    public static int getMin(int[] num) {
        if (num == null || num.length == 0) {
            throw new RuntimeException("invalid numArray...");
        }

        int low = 0;
        int high = num.length - 1;
        int mid = low;

        //循环条件不是low<=high，目的防止array5，单调数组无旋转
        while (num[low] >= num[high]) {
            // 当处理范围只有两个数据时，返回后一个结果，后一个结果对应的是最小的值
            if (high - low == 1) {
                return num[high];
            }

            mid = (low + high) / 2;

            if (num[low] == num[mid] && num[mid] == num[high]) {
                return minInorder(num,low,high);
            }

            if (num[low] >= num[mid]) {
                high = mid;
            } else if (num[high] <= num[mid]) {
                low = mid;
            }
        }
        return num[mid];
    }


    /**
     * 防止重复元素数组和单一元素数组
     *
     * @param numbers
     * @param start
     * @param end
     * @return
     */
    public static int minInorder(int[] numbers, int start, int end) {
        int result = numbers[start];
        for (int i = start + 1; i <= end; i++) {
            if (result > numbers[i]) {
                result = numbers[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // 典型输入，单调升序的数组的一个旋转
        int[] array1 = {3, 4, 5, 1, 2};
        System.out.println(getMin(array1));

        // 有重复数字，并且重复的数字刚好的最小的数字
        int[] array2 = {3, 4, 5, 1, 1, 2};
        System.out.println(getMin(array2));

        // 有重复数字，但重复的数字不是第一个数字和最后一个数字
        int[] array3 = {3, 4, 5, 1, 2, 2};
        System.out.println(getMin(array3));

        // 有重复的数字，并且重复的数字刚好是第一个数字和最后一个数字
        int[] array4 = {1, 0, 1, 1, 1};
        System.out.println(getMin(array4));

        // 单调升序数组，旋转0个元素，也就是单调升序数组本身
        int[] array5 = {1, 2, 3, 4, 5};
        System.out.println(getMin(array5));

        // 数组中只有一个数字
        int[] array6 = {2};
        System.out.println(getMin(array6));

        // 数组中数字都相同
        int[] array7 = {1, 1, 1, 1, 1, 1, 1};
        System.out.println(getMin(array7));

        // 输入NULL
        System.out.println(getMin(null));


    }

}
