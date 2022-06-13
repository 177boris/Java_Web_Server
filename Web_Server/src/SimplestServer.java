import java.io.IOException;
import java.net.ServerSocket; 

public class SimplestServer {

    public static void main(String[] args) {
        
        try (ServerSocket server = new ServerSocket(8080)) {
            System.out.println("listening for connection on port 8080 .... ");
        while(true){
            //spin forever
            }
        } catch (IOException e) {
            e.printStackTrace();
        }   
    }
} 