public class Fibonacci {
    public static int recursiveFibonacci(int n) {
        if (n <= 1) return n;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(recursiveFibonacci(6)); // Виведе 8
    }
}
