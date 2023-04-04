import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Generar una lista de velocidades aleatorias entre 0 y 200
        List<Integer> velocidad = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int v = rand.nextInt(201); // Genera un número aleatorio entre 0 y 200
            velocidad.add(v);
        }
        // Iterar sobre la lista y verificar si cada velocidad es excesiva o no
        for (Integer v : velocidad) {
            if (v < 80) {
                System.out.println(v + " no es una velocidad excesiva");
            } else {
                System.out.println(v + " es una velocidad excesiva");
            }
        }

        // Medir el tiempo de ejecución para el procesamiento secuencial y paralelo
        long tiempoInicio = System.nanoTime();
        velocidad.stream().forEach(System.out::println);
        long tiempoFin = System.nanoTime();
        System.out.println();
        System.out.println("Tiempo sin programación paralela: " + ((tiempoFin - tiempoInicio) / 1_000_000_000.0) + " segundos");
        
        tiempoInicio = System.nanoTime();
        velocidad.parallelStream().forEach(System.out::println);
        tiempoFin = System.nanoTime();
        System.out.println();
        System.out.println("Tiempo con programación paralela: " + ((tiempoFin - tiempoInicio) / 1_000_000_000.0) + " segundos");
    }
}