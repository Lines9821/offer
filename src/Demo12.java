import java.util.Scanner;

/**
 * @author cairunduo
 * @date 2019/10/5 - 17:36
 * <p>
 * 调整数组顺序使奇数位于偶数前面
 * 思路：我们可以维护两个指针，第一个指针初始化时指向数组的第一个数字，它只向后移动：第二个指针初始化时指向数组的最后一个数字， 它只向前移动。
 * 在两个指针相遇之前，第一个指针总是位于第二个指针的前面。如果第一个指针指向的数字是偶数，并且第二个指针指向的数字是奇数，我们就交换这两个数字。
 */
public class Demo12 {
    /**
     * 调整数组顺序
     *
     * @param arr
     */
    public static void recorderOddEven(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //两个指针
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            //前指针，偶数停，交换位置；奇数继续跑
            //两个限制条件注意
            if (start < end && arr[start] % 2 != 0) {
                start++;
            }
            //后指针，奇数停，交换位置；偶数继续跑
            //两个限制条件注意
            if (start < end && arr[end] % 2 == 0) {
                end--;
            }
            //奇偶交换位置
            int tmp = arr[end];
            arr[end] = arr[start];
            arr[start] = tmp;
        }
    }

    /**
     * 打印数组
     *
     * @param arr
     */
    public static void printArray(int[] arr) {
        if (arr != null || arr.length > 0) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strings = s.split(" ");
        int[] arr = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        recorderOddEven(arr);
        printArray(arr);
    }
}
