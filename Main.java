public class Main {

    // Función que calcula el promedio de temperaturas de cada ciudad
    public static double[] calcularPromedio(double[][] temperaturas) {
        double[] promedios = new double[temperaturas.length];

        for (int i = 0; i < temperaturas.length; i++) {
            double suma = 0;
            for (int j = 0; j < temperaturas[i].length; j++) {
                suma += temperaturas[i][j];
            }
            promedios[i] = suma / temperaturas[i].length;
        }

        return promedios;
    }

    public static void main(String[] args) {
        // Ejemplo de datos: 3 ciudades, 4 semanas
        double[][] temperaturas = {
            {20.5, 22.1, 21.3, 23.0},  // Ciudad 1
            {18.4, 19.2, 17.8, 20.0},  // Ciudad 2
            {25.0, 24.5, 26.1, 27.3}   // Ciudad 3
        };

        // Llamada a la función
        double[] promedios = calcularPromedio(temperaturas);

        // Mostrar resultados
        for (int i = 0; i < promedios.length; i++) {
            System.out.println("Ciudad - Main.java:31" + (i + 1) + " - Promedio: " + promedios[i] + "°C");
        }
    }
}
