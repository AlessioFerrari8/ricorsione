import java.util.Arrays;

public class array {
    public static void main(String[] args) throws Exception {
        int[] array = {2, 5, 11, 17, 12, 48, 456};
        System.out.println(cercaMinimo(array, array[0], array.length - 1));
        int[] array2 = {2, 5, 11, 17, 12, 48, 456};
        System.out.println(cercaMinimo2(array2, array.length - 1));

        int[] es = {5, 4, 1, 3, 9, 12};
        bubbleSort(es, es.length); 
        System.out.println(Arrays.toString(es));

        int [] esesmepio = {5, 3, 7, 9, 1, 5, 6};
        shakerSortLeft(esesmepio, 0, esesmepio.length - 1);        
        System.out.println(Arrays.toString(esesmepio));


    }

    public static int cercaMinimo(int[] v, int minimo, int ultimo) {
        // clausola di chiusura
        // se ho controllato tutto l'array
        if (ultimo == -1) 
            return minimo;
        
        // chiamata ricorsiva
        if (minimo > v[ultimo]) {
            minimo = v[ultimo];
        }

        return cercaMinimo(v, minimo, --ultimo);        
    }

    public static int cercaMinimo2(int[] v, int ultimo) {
        // clausola di chiusura
        // se ho controllato tutto l'array
        if (ultimo == 0) 
            return v[ultimo];
        
        // chiamata ricorsiva
        return Math.min(v[ultimo], cercaMinimo2(v, --ultimo));        
    }

    public static void bubbleSort(int[] v, int fine) {        
        if (fine == 0) {
            return; 
        }

        for (int i = 0; i < fine - 1; i++) {
            if (v[i] > v[i + 1])
                swap(v, i, i + 1);
        }

        bubbleSort(v, --fine);
        return;
    }

    public static void swap(int[] v, int i, int j) {
        int temp;
        temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    // public static void shakerSort(int[] v, int fine) {

    // }

    public static void shakerSortRiht(int[] v, int inizio, int fine) {
        if(fine <= inizio) {
            return;
        }

        for (int i = inizio; i < fine; i++) {
            if (v[i] > v[i+1])
                swap(v, i, i + 1);
        }

        shakerSortLeft(v, inizio, --fine);
    }

    public static void shakerSortLeft(int[] v, int inizio, int fine) {
        if(fine <= inizio) {
            return;
        }

        for (int i = fine; i > inizio; i--) {
            if (v[i] < v[i-1])
                swap(v, i, i - 1);
        }

        shakerSortRiht(v, ++inizio, fine);
    }
}
