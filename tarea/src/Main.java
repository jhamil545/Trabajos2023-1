import java.util.*;
public class Main {
    public static void main(String args) {
        List<String> velocidad = new ArrayList<>();
        velocidad.add("52");
        velocidad.add("10");
        velocidad.add("30");
        velocidad.add("89");
        velocidad.add("90");
        velocidad.add("200");
        velocidad.add("140");

        int f;
        Integer number = Integer.valueOf(velocidad);
        for(f=1;f<=100;f++) {


            if(number<80){
                System.out.print("*");
                System.out.println(velocidad + " no es una velocidad execiva" );
            }
            if(number>80){
                System.out.print("*");
                System.out.println(velocidad + " es una velocidad execiva" );
            }}

        long tiempoInicio = (System.nanoTime());
        velocidad.stream().forEach(s->System.out.println(s));
        long tiempoFin = (System.nanoTime());
        System.out.println();
        System.out.println("diferencia de tiempo sin programacion paralela"+ ((tiempoFin-tiempoInicio)/1_000_000_000));

        tiempoInicio = (System.nanoTime());
        velocidad.stream().parallel().forEach(s->System.out.println(s));
        tiempoFin = (System.nanoTime());
        System.out.println();
        System.out.println("diferencia de tiempo con programacion paralela"+ ((tiempoFin-tiempoInicio)/1_000_000_000));





    }

    }
