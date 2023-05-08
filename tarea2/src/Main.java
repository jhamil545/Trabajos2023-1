import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Generar una lista de velocidades aleatorias entre 0 y 200
        List<Integer> velocidad = new ArrayList<>();
        List<String> velocidadcontrolada = new ArrayList<>();
        
        String velcompl;
        for (int i = 0; i < 10000; i++) {
            int v = (int)(Math.random()*(200-0+1)+0); // Genera un número aleatorio entre 0 y 200
            velocidad.add(v);

            if (v < 80) {
                velcompl=v + " no es una velocidad excesiva";
               
            } else {
                velcompl=v+ " es una velocidad excesiva";
               
            }
            //velocidadcontrolada.add(velcompl);
        }
        // Iterar sobre la lista y verificar si cada velocidad es excesiva o no
        

        // Medir el tiempo de ejecución para el procesamiento secuencial y paralelo
        long tiempoInicio = System.nanoTime();
        velocidadcontrolada.stream().forEach(s->System.out.println(s));
        long tiempoFin = System.nanoTime();
        System.out.println();
        System.out.println("Tiempo sin programación paralela: " + ((tiempoFin - tiempoInicio) / 1_000_000_000.0) + " segundos");
        
        tiempoInicio = System.nanoTime();
        velocidadcontrolada.stream().parallel().forEach(s->System.out.println(s));
        tiempoFin = System.nanoTime();
        System.out.println();
        System.out.println("Tiempo con programación paralela: " + ((tiempoFin - tiempoInicio) / 1_000_000_000.0) + " segundos");
    }
}