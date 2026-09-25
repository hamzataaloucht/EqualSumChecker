public class EqualSumChecker {

    // Implementing the method hasEqualSum
    public static boolean hasEqualSum(int a, int b, int c) {
        // Returning true iff the sum of the first two elements is equal to the third element
        return a + b == c;
    }

    public static void main(String[] args) {
        // Testing the method hasEqualSum
        System.out.println(hasEqualSum(1, 1,1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1 , 0));

    }
}
