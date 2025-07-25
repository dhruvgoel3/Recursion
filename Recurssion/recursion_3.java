public class recursion_3 {
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += 1;
        printSum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        printSum(1, 5, 0);

    }

}
// done