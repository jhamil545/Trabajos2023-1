import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) throws Exception {
        // Crea un nuevo servidor de socket en el puerto
        ServerSocket serverSocket = new ServerSocket(8484);
        System.out.println("Servidor de socket iniciado en el puerto 8484");

        while (true) {
            // Espera a que se conecte un cliente
            Socket clientSocket = serverSocket.accept();
            System.out.println("Cliente conectado desde " + clientSocket.getInetAddress());

            // Crea un nuevo hilo para manejar la conexión del cliente
            Thread thread = new Thread(() -> {
                try {
                    // Lee el mensaje del cliente
                    BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    String message = reader.readLine();
                    System.out.println("Mensaje recibido del cliente: " + message);

                    // Envía una respuesta al cliente
                    String response = "Hola, soy el servidor de socket";
                    clientSocket.getOutputStream().write(response.getBytes());
                    System.out.println("Respuesta enviada al cliente");

                    // Cierra el socket del cliente
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }
}
