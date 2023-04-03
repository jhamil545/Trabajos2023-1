import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import  java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) throws IOException {
        String rutaUrl = "https://upeu.edu.pe/";
        URL url = new URL(rutaUrl);
        HttpURLConnection httpURLConnection =(HttpURLConnection) url.openConnection();
        InputStream inputStream =httpURLConnection.getInputStream();
        String resultado =new BufferedReader(new InputStreamReader(inputStream)).lines()
                .collect(Collectors.joining());
        System.out.println(resultado);

        List<String> rutaUrls = new ArrayList<>();
        rutaUrls.add("https://upeu.edu.pe/");
        rutaUrls.add("https://upeu.edu.pe/facihed/");
        rutaUrls.add("https://upeu.edu.pe/facihed/educacion-primaria/");
        rutaUrls.add("https://upeu.edu.pe/facihed/linguistica-e-ingles/");
        rutaUrls.add("https://upeu.edu.pe/facihed/musical-y-artes/");
        rutaUrls.add("https://upeu.edu.pe/fce/contabilidad/");
        rutaUrls.add("https://upeu.edu.pe/fsalud/nutricion-humana/");


        long tiempoInicio = (System.nanoTime());
        rutaUrls.stream().forEach(s-> obtenerContenidoPagina(s));
        long tiempoFin = (System.nanoTime());
        System.out.println();
        System.out.println("diferencia de tiempo sin programacion paralela"+ ((tiempoFin-tiempoInicio)/1_000_000_000));

        tiempoInicio = (System.nanoTime());
        rutaUrls.stream().parallel().forEach(s -> obtenerContenidoPagina(s));
        tiempoFin = (System.nanoTime());
        System.out.println();
        System.out.println("diferencia de tiempo con programacion paralela"+ ((tiempoFin-tiempoInicio)/1_000_000_000));
    }

    private static String obtenerContenidoPagina(String rutaUrl){
        try{
            URL url = new URL(rutaUrl);
            HttpURLConnection httpURLConnection =(HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            Stream<String> lineas=new BufferedReader(new InputStreamReader(inputStream)).lines();
            return lineas.collect(Collectors.joining());
            //.collect(Collectors.joining());
        }
        catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
        return "";
    }
}