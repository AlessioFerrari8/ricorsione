import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 20; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) { // caso di uscita
            return 1; // caso banale
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
