public class Fab {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            double currentNum = fab(i);
            double nextNum = fab(i + 1);
            System.out.println(currentNum + " 除以 " + nextNum + " 的值为 " + currentNum / nextNum);
        }

        for (int i = 0; i <= 20; i++) {
            double currentNum = fab2(i);
            double nextNum = fab2(i + 1);
            System.out.println(currentNum + " 除以 " + nextNum + " 的值为 " + currentNum / nextNum);
        }
    }

    private static long fab(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return fab(n - 1) + fab(n -2);
        }
    }

    private static long fab2(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            int p0 = 1;
            int p1 = 1;
            for (int i = 2; i <= n; i++) {
                int temp = p1;
                p1 = p1 + p0;
                p0 = temp;
            }
            return p1;
        }
    }
}
