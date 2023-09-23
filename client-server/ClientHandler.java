import java.io.*;
import java.net.*;

public class ClientHandler implements Runnable {
    private Socket clientSocket;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    @Override
    public void run() {
        try (PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            System.out.println("Handling client: " + clientSocket);

            String clientMessage;
            while ((clientMessage = in.readLine()) != null) {
                System.out.println("Client (" + clientSocket + "): " + clientMessage);
                out.println("Server received: " + clientMessage);

                if (clientMessage.equalsIgnoreCase("exit")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
                System.out.println("Client disconnected: " + clientSocket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
