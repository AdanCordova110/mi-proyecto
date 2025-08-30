import java.util.Arrays;

public class OrdenacionMatriz {
    public static void main(String[] args) {
        // Declaramos una matriz 3x3
        int[][] matriz = {
            {5, 8, 12},
            {7, 3, 9},
            {4, 6, 1}
        };

        // Mostramos la matriz original
        System.out.println("Matriz original: - ordenacionmatriz.java:13");
        mostrarMatriz(matriz);

        // Fila que queremos ordenar (ejemplo: fila 1 -> la segunda fila)
        int filaOrdenar = 1;

        // Ordenamos la fila con Arrays.sort (puedes cambiar por BubbleSort si quieres)
        Arrays.sort(matriz[filaOrdenar]);

        // Mostramos la matriz después de ordenar
        System.out.println("\nMatriz con la fila - ordenacionmatriz.java:23" + filaOrdenar + " ordenada:");
        mostrarMatriz(matriz);
    }

    // Método para mostrar la matriz en pantalla
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t - ordenacionmatriz.java:31");
            }
            System.out.println();
        }
    }
}
