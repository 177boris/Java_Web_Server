import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


// Java program to create a simple HTTP server
// and demonstrate how to use 
// ServerSocket and Socket class 

public class Sockets {
    
    public static void main(String args[]) throws IOException{

            // 1. Read HTTP request from the client socket 
            // 2. Prepare an HTTP response 
            // 3. Send HTTP response to the client 
            // 4. Close the socket 

            // Remember, ServerSocket is used to receive connections in the Server application and Socket is used to send and receive data from the individual clients.

            
        try (ServerSocket server = new ServerSocket(8080)) {
            System.out.println("listening for connection on port 8080 ... ");
            while(true){
                try (Socket socket = server.accept()){
                    Date today = new Date(); 
                    String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today; 
                    socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
                }
            }
        }
    }
}
