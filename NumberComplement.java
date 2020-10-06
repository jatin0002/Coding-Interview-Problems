public class NumberComplement {
    // Leetcode Problem 476
    // Given a positive integer num, output its complement number. The complement
    // strategy is to flip the bits of its binary representation.

    // Input: n = 5
    // Output: 2

    // Input: num = 1
    // Output: 0

    public static int NumComplement(int n) {

        if (n == 0) {
            return 1;
        }
        int numberOfBits = ((int) (Math.log(n) / Math.log(2)) + 1);
        int mask = (1 << numberOfBits) - 1;
        return mask ^ n;
    }

    public static void main(String[] args) {
        int n = 5;
        int res = NumComplement(n);
        System.out.println(res);
    }
}
