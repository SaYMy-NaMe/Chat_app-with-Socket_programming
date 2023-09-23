import java.io.*;
import java.net.*;

public class Client {
    private static final String SERVER_IP = "127.0.0.1";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_IP, SERVER_PORT);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to server. Type 'exit' to disconnect.");

            String userInputStr;
            while ((userInputStr = userInput.readLine()) != null) {
                out.println(userInputStr);
                if (userInputStr.equalsIgnoreCase("exit")) {
                    break;
                }
                String serverResponse = in.readLine();
                System.out.println("Server: " + serverResponse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
