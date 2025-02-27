import java.util.HashMap;

public class Fibonacci {
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int dpFibonacci(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);

        int result = dpFibonacci(n - 1) + dpFibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(dpFibonacci(6)); // Виведе 8
    }
}
