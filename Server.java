import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {

        try {

            ServerSocket ss = new ServerSocket(22222);
            System.out.println("Server started...");

            // establishes connection
            Socket soc = ss.accept();

            // invoking input stream
            DataInputStream dis = new DataInputStream(soc.getInputStream());

            String str = (String) dis.readUTF();

            System.out.println("message= " + str);

            // closing socket
            ss.close();

        } // for catching Exception in run time
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
