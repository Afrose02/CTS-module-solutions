// File: TCPServer.java
import java.io.*;
import java.net.*;
public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        Socket client = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        String msg;
        while ((msg = in.readLine()) != null) {
            out.println("Server: " + msg);
        }
        client.close();
        server.close();
    }
}

// File: TCPClient.java
import java.io.*;
import java.net.*;
public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 5000);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = console.readLine()) != null) {
            out.println(input);
            System.out.println(in.readLine());
        }
        socket.close();
    }
}
