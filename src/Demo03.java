import java.util.Scanner;

/**
 * @author cairunduo
 * @date 2019/10/3 - 18:01
 */
public class Demo03 {
    /**
     * @param s          字符数组
     * @param usedLength 字符串长度
     * @return
     */
    public static int replaceBlank(char[] s, int usedLength) {
        if (s == null) {
            return -1;
        }
        //空格数
        int blank = 0;
        for (int i = 0; i < usedLength; i++) {
            if (s[i] == ' ') {
                blank++;
            }
        }
        //转换后字符串的长度
        int targetLength = 2 * blank + usedLength;
        //记录返回值
        int tmp = targetLength;
        if (targetLength > s.length) {
            return -1;
        }
        if (blank == 0) {
            return usedLength;
        }
        //从后往前处理的第一个字符
        usedLength--;
        targetLength--;

        while (usedLength >= 0 || usedLength < targetLength) {
            if (s[usedLength] == ' ') {
                s[targetLength--] = '0';
                s[targetLength--] = '2';
                s[targetLength--] = '%';
            } else {
                s[targetLength] = s[usedLength];
                targetLength--;
            }
            usedLength--;
        }
        return tmp;
    }

    public static void main(String[] args) {
        char[] s = new char[50];
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        for (int i = 0; i < string.length(); i++) {
            s[i] = string.charAt(i);
        }
        
/*      s[0] = 'w';
        s[1] = 'e';
        s[2] = ' ';
        s[3] = 'a';
        s[4] = 'r';
        s[5] = 'e';
        s[6] = ' ';
        s[7] = 'h';
        s[8] = 'a';
        s[9] = 'p';
        s[10] = 'p';
        s[11] = 'y';
        s[12] = '.';
        */

        int length = replaceBlank(s, 13);
        System.out.println(new String(s, 0, length));
    }
}
