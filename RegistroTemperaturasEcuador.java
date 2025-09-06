public class RegistroTemperaturasEcuador {
    public static void main(String[] args) {
        int ciudades = 4;
        int semanas = 2;
        int dias = 7;

        String[] nombresCiudades = {"Guayaquil", "Quito", "Cuenca", "Manta"};

        double[][][] temperaturas = {
            {   // Guayaquil
                {29, 30, 31, 32, 33, 31, 30}, // Semana 1
                {28, 29, 30, 31, 32, 30, 29}  // Semana 2
            },
            {   // Quito
                {15, 16, 17, 16, 15, 14, 15}, 
                {14, 15, 16, 15, 14, 13, 14}
            },
            {   // Cuenca
                {18, 19, 20, 21, 20, 19, 18}, 
                {19, 20, 21, 22, 21, 20, 19}
            },
            {   // Manta
                {26, 27, 28, 29, 28, 27, 26}, 
                {27, 28, 29, 30, 29, 28, 27}
            }
        };

        // Mostrar promedios (formato con 2 decimales)
        System.out.println("Promedio de temperaturas por ciudad y semana: - RegistroTemperaturasEcuador.java:29");
        for (int c = 0; c < ciudades; c++) {
            for (int s = 0; s < semanas; s++) {
                double suma = 0;
                for (int d = 0; d < dias; d++) {
                    suma += temperaturas[c][s][d];
                }
                double promedio = suma / dias;
                System.out.printf("%s - Semana %d: Promedio = %.2f°C%n", nombresCiudades[c], s + 1, promedio);
            }
        }
    }
}
