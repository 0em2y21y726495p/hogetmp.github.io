import java.io.*;
import java.net.*;

public class HTTPServer {
    public static final int HTTP_port = 80;

    public static void main(String[] args) {
        try(Socket sock = new Socket()) {
            //Terminalから文字列を受け取る用
            BufferedReader read = new BufferedReader(new InputStreamReader(sock.getInputStream())); 
            //
            

        }
    }
}
