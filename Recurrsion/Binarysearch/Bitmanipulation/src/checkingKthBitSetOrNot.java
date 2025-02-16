public class checkingKthBitSetOrNot {
    public static void main(String[] args) {
        System.out.println(check(147, 5)); // Expected output: true
    }

    public static boolean check(int n, int k) {
        return (n & (1 << (k - 1))) != 0;
    }
}