# Ricorsione
Funzioni
- ricorsione diretta
- ricorsione indiretta

3 elementi fondamentali:
- condizione di uscita
- caso banale
- legame funzionale (chiamata ricorsiva)

Esempio: calcolo fattoriale
- caso banale: 1! = 1
- legame funzionale: n! = n * (n-1)!
- condizione di uscita: n == 0 || n > 1

```java
public class Fattoriale {
    public static void main(String[] args) {
        int n = 5; // esempio di input
        int risultato = fattoriale(n);
        System.out.println("Il fattoriale di " + n + " è: " + risultato);
    }

    public static int fattoriale(int n) {
        // Condizione di uscita
        if (n == 0 || n == 1) {
            return 1; // Caso banale: 0! e 1! = 1
        } else {
            // Legame funzionale: n! = n * (n-1)!
            return n * fattoriale(n - 1);
        }
    }
}
```
