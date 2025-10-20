public class App {
    public static void main(String[] args) throws Exception {
        int array [] = {0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 15, 21, 25, 28};

        System.out.println(ricercaDicotomica(array, 4, 0, 13));    
}

    public static boolean ricercaDicotomica(int[] v, int cercato, int start, int end){
        if (start > end) { // caso base
            return false; // condizione uscita 1
        }
        
        if (v[(start+end)/2] == cercato) {
            return true; // condizione uscita 2
        } else if (cercato < v[(start+end)/2]) {
            return ricercaDicotomica(v, cercato, start, (start+end)/2 - 1);
        } else {
            return ricercaDicotomica(v, cercato, (start+end)/2 + 1, end);
        }

    }
}
