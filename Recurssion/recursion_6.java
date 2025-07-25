public class recursion_6 {
    public static int calcpower(int x, int n) {
        if (n == 0) { // base case 1
            return 1;

        }
        if (x == 0) { // base case 2
            return 0;

        }
        int xPowenm1 = calcpower(x, n - 1);
        int xPown = x * xPowenm1;
        return xPown;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calcpower(x, n);
        System.out.println(ans);

    }

}
