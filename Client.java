import java.io.IOException;
import java.net.Socket;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {

        try {

            Socket soc = new Socket("127.0.0.1", 22222);
            System.out.println("Client Started...");

            DataOutputStream d = new DataOutputStream(soc.getOutputStream());

            d.writeUTF("Hello from the client side!");

            d.flush();
            d.close(); // closing DataOutputStream
            soc.close(); // closing socket
        }

        // to initialize Exception in run time
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
