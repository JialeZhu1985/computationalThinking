public class Factor {

    public static void main(String[] args) {
        int i = 50;
        System.out.println(i + " 的阶乘= " + factor(i));
    }

    /**
     * 求阶乘
     *
     * @param num
     * @return
     */
    public static int factor(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factor(num -1);
        }
    }

    public static long factor2(int num) {
        int counter;
        long product = 1;
        for (counter = 1; counter <= num; counter++) {
            product = product * counter;
        }
        return product;
    }

}
