import java.io.*;
import java.net.*;

public class ServerSocket_2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");

        Socket socket = serverSocket.accept();
        System.out.println("Connected to " + socket.getRemoteSocketAddress());

        DataInputStream in = new DataInputStream(socket.getInputStream());
        System.out.println(in.readUTF());

        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.writeUTF("Thank you for connecting to " + socket.getLocalSocketAddress());

        socket.close();
    }
}
