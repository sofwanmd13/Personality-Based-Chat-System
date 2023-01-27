import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private ServerSocket serverSocket;

    public Server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public void startServer(){

        try{

            while(!serverSocket.isClosed()){

                Socket socket = serverSocket.accept();
                System.out.println("A new member has joined the chat!");
                ClientHandler clientHandler = new ClientHandler(socket);

                Thread thread = new Thread(clientHandler);
                thread.start();

            }

        }catch (IOException e){

        }

    }

    public void closeServerSocket(){
        try{
            if (serverSocket!= null){
                serverSocket.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter server port Number");
        int port = input.nextInt();
        ServerSocket serverSocket = new ServerSocket (port);
        Server server = new Server(serverSocket);
        server.startServer();

        input.close();
    }
}
