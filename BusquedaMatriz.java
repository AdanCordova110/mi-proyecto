public class BusquedaMatriz {
    public static void main(String[] args) {
        // Declaramos una matriz 3x3
        int[][] matriz = {
            {5, 8, 12},
            {7, 3, 9},
            {4, 6, 1}
        };

        int valorBuscado = 9; // valor a buscar
        boolean encontrado = false;

        // Recorremos la matriz para buscar el valor
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valorBuscado) {
                    System.out.println("✅ Valor - busquedamatriz.java:17" + valorBuscado + " encontrado en la posición [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("❌ El valor - busquedamatriz.java:24" + valorBuscado + " no se encontró en la matriz.");
        }
    }
}
