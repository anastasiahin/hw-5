public class Fibonacci {
    public static int iterativeFibonacci(int n) {
        if (n <= 1) return n;
        int prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }

    public static void main(String[] args) {
        System.out.println(iterativeFibonacci(6)); // Виведе 8
    }
}
