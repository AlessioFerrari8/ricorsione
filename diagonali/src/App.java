public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 4; i < 20; i++) {
            System.out.print(diagonali(i) + " ");
        }

    }

    public static int diagonali(int lati) {
        if (lati < 3) { // caso di uscita
            return 0; // caso banale
        } else {
            return diagonali(lati - 1) + lati;
        }
    }


}
