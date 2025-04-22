import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
    public static void main(String[] args) {

        String hostName = "127.0.0.1";
        int portNumber = 8675;
        try (
                Socket echoSocket = new Socket(hostName, portNumber);
                PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
                BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Connected to chat server 127.0.0.1 on port 8675");

            // ask for username
            System.out.print("Enter your username: ");
            String username = stdIn.readLine();
            out.println(username);

            Thread incomingThread = new Thread(() -> {
                try {
                    String serverMessage;
                    while (((serverMessage = in.readLine()) != null)) {
                        System.out.println(serverMessage);
                    }
                } catch (Exception e) {
                    System.err.println("Connection closed");
                }
            });
            incomingThread.start();

            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
            }
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                    hostName);
            System.exit(1);
        }
    }
}