import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<String> ciudades = new ArrayList<>();
        ciudades.add("Puno");
        ciudades.add("Juliaca");
        ciudades.add("Jauja");
        ciudades.add("Tacna");
        ciudades.add("Moquegua");
        ciudades.add("Arequipa");
        ciudades.add("Lima");
        for (int i=0; i<ciudades.size();i++){
            System.out.println(ciudades.get(i));
        }

        System.out.println();
        for (String ciudad : ciudades){
            System.out.println(ciudad);
        }
        System.out.println();
        ciudades.stream().forEach(s->System.out.println(s));

        System.out.println();

        ciudades.stream().parallel().forEach(s->System.out.println(s));
        System.out.println("hello world");
    }
}