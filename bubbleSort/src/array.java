public class array {
    public static void main(String[] args) throws Exception {
        int[] array = {2, 5, 11, 17, 12, 48, 456};
        System.out.println(cercaMinimo(array, array[0], array.length - 1));
        int[] array2 = {2, 5, 11, 17, 12, 48, 456};
        System.out.println(cercaMinimo2(array2, array.length - 1));

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
        bubbleSort(v, ++fine);
    }

    public static void swap(int[] v, int i, int j) {
        int temp;
        temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
}
