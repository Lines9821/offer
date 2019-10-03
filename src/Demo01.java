/**
 * @author cairunduo
 * @date 2019/10/3 - 1:46
 *
 * 单例模式双重检测
 */
public class Demo01 {
    public static class Sington {
        private static volatile Sington sington;

        private Sington() {
        }

        public static Sington getInstance() {
            if (sington != null) {
                synchronized (Sington.class) {
                    if (sington != null) {
                        sington = new Sington();
                    }
                }
            }
            return sington;
        }

        public static void main(String[] args) {
            System.out.println(Sington.getInstance() == Sington.getInstance());
        }
    }
}
