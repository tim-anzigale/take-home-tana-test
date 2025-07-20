public class Question3_ArraystoZero {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};  // test case
        System.out.println(canMakeZeros(nums));  // should be 1
    }

    public static int canMakeZeros(int[] arr) {
        if (arr.length == 0) return 0;

        int g = arr[0];  // start with first element

        // go through rest and find gcd
        for (int i = 1; i < arr.length; i++) {
            g = gcd(g, arr[i]);
        }

        // if gcd equals first element, we can do it
        if (g == arr[0]) {
            return 1;
        } else {
            return 0;
        }
    }

    // calculate gcd
    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
