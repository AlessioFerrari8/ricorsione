import java.util.Scanner;

public class Fattoriale {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il numero su cui calcolare il fattoriale");
        int n = in.nextInt();

        System.out.printf("Fattoriale di %d! = %d", n, fattoriale(n));
        in.close();

    }

    public static int fattoriale(int n) {
        // Condizione di uscita
        if (n == 1) {
            return 1; // Caso banale: 0! e 1! = 1
        } else {
            // Legame funzionale: n! = n * (n-1)!                                    
            return n * fattoriale(n - 1);
        }
    }

    

    
}

