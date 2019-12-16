public class StackOverFlow {

    public static void main(String[] args) {
        recursion(1);
    }

    private static void recursion(int count) {
        System.out.println("recursion count = " + count);
        count++;
        recursion(count);
    }
}
