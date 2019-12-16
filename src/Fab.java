public class Fab {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            double currentNum = fab(i);
            double nextNum = fab(i + 1);
            System.out.println(currentNum + " 除以 " + nextNum + " 的值为 " + currentNum / nextNum);
        }
    }

    public static long fab(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return fab(n - 1) + fab(n -2);
        }
    }
}
