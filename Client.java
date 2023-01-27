import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String username;

    public Client(Socket socket, String username) {
        try {
            this.socket = socket;
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.username = username;
        } catch (IOException e){
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }

    public void sendMessage(){
        try{
            bufferedWriter.write(username);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            Scanner scanner = new Scanner(System.in);
            while (socket.isConnected()) {
                String messageToSend = scanner.nextLine();
                bufferedWriter.write(username + ": " + messageToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            scanner.close();
        } catch (IOException e){
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }

    public void listenForMessage() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String msgFromGroupChat;

                while (socket.isConnected()) {
                    try {
                        msgFromGroupChat = bufferedReader.readLine();
                        System.out.println(msgFromGroupChat);
                    } catch (IOException e){
                        closeEverything(socket, bufferedReader, bufferedWriter);
                    }
                }
            }
        }).start();
    }

    public void closeEverything (Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter){
        try {
            if (bufferedReader != null){
                bufferedReader.close();
            }
            if (bufferedWriter != null){
                bufferedWriter.close();
            }
            if (socket != null){
                socket.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username for the group chat: ");
        String username = scanner.nextLine();

        /*System.out.println("Enter your password for the group chat: ");
        String password = scanner.nextLine();

        System.out.println("Enter port Number:");
        int portNum = scanner.nextInt();

        if (User.login.containsKey(username) && User.login.get(username).equals(password)){  //Authentication not working as data is not being written permanently
            Socket socket = new Socket("localhost", User.portNum.get(username));
            Client client = new Client(socket, username);
            client.listenForMessage();  //Both run on same time because they use different threads
            client.sendMessage();
        }
        else{
            System.out.println("Login credentials do not match!");
        }*/

        System.out.println("Enter port Number:");
        int portNum = scanner.nextInt();

        if (portNum == 8001){
            System.out.println("Suggested Content Links: ");
            System.out.println("https://www.youtube.com/watch?v=uTnGHknbu8U");
            System.out.println("https://www.youtube.com/watch?v=LfmA_ufFDCg");
            System.out.println("https://www.youtube.com/watch?v=QAsJvKsd2Xk");
            System.out.println("https://www.youtube.com/watch?v=Rv9SwZWVkOs");
            System.out.println("https://www.youtube.com/watch?v=QAsJvKsd2Xk");
            System.out.println("https://www.youtube.com/watch?v=_wVuCGG2qFs");
            System.out.println("https://www.youtube.com/watch?v=DmAVxAMPZuk");
            System.out.println("https://www.youtube.com/watch?v=HR-PwsUayY0");
            System.out.println("https://www.youtube.com/watch?v=EOOzC9PT8GY");
            System.out.println("https://www.youtube.com/watch?v=lvgM39UgHbA&t=7s");
        }
        else if (portNum == 8002){
            System.out.println("Suggested Content Links: ");
            System.out.println("https://www.youtube.com/watch?v=QAsJvKsd2Xk");
            System.out.println("https://www.youtube.com/watch?v=Rv9SwZWVkOs");
            System.out.println("https://www.youtube.com/watch?v=QAsJvKsd2Xk");
            System.out.println("https://www.youtube.com/watch?v=_wVuCGG2qFs");
            System.out.println("https://www.youtube.com/watch?v=DmAVxAMPZuk");
            System.out.println("https://www.youtube.com/watch?v=HR-PwsUayY0");
            System.out.println("https://www.youtube.com/watch?v=EOOzC9PT8GY");
            System.out.println("https://www.youtube.com/watch?v=lvgM39UgHbA&t=7s");
        }
        else if (portNum == 8003){
            System.out.println("Suggested Content Links: ");
            System.out.println("https://www.youtube.com/watch?v=uTnGHknbu8U");
            System.out.println("https://www.youtube.com/watch?v=LfmA_ufFDCg");
            System.out.println("https://www.youtube.com/watch?v=QAsJvKsd2Xk");
            System.out.println("https://www.youtube.com/watch?v=_wVuCGG2qFs");
            System.out.println("https://www.youtube.com/watch?v=DmAVxAMPZuk");
            System.out.println("https://www.youtube.com/watch?v=HR-PwsUayY0");
            System.out.println("https://www.youtube.com/watch?v=EOOzC9PT8GY");
            System.out.println("https://www.youtube.com/watch?v=lvgM39UgHbA&t=7s");
        }
        else if (portNum == 8004){
            System.out.println("Suggested Content Links: ");
            System.out.println("https://www.youtube.com/watch?v=uTnGHknbu8U");
            System.out.println("https://www.youtube.com/watch?v=LfmA_ufFDCg");
            System.out.println("https://www.youtube.com/watch?v=QAsJvKsd2Xk");
            System.out.println("https://www.youtube.com/watch?v=Rv9SwZWVkOs");
            System.out.println("https://www.youtube.com/watch?v=DmAVxAMPZuk");
            System.out.println("https://www.youtube.com/watch?v=HR-PwsUayY0");
            System.out.println("https://www.youtube.com/watch?v=EOOzC9PT8GY");
            System.out.println("https://www.youtube.com/watch?v=lvgM39UgHbA&t=7s");
        }
        else if (portNum == 8005){
            System.out.println("Suggested Content Links: ");
            System.out.println("https://www.youtube.com/watch?v=uTnGHknbu8U");
            System.out.println("https://www.youtube.com/watch?v=LfmA_ufFDCg");
            System.out.println("https://www.youtube.com/watch?v=QAsJvKsd2Xk");
            System.out.println("https://www.youtube.com/watch?v=Rv9SwZWVkOs");
            System.out.println("https://www.youtube.com/watch?v=QAsJvKsd2Xk");
            System.out.println("https://www.youtube.com/watch?v=_wVuCGG2qFs");
            System.out.println("https://www.youtube.com/watch?v=EOOzC9PT8GY");
            System.out.println("https://www.youtube.com/watch?v=lvgM39UgHbA&t=7s");
        }
        else if (portNum == 8006){
            System.out.println("Suggested Content Links: ");
            System.out.println("https://www.youtube.com/watch?v=uTnGHknbu8U");
            System.out.println("https://www.youtube.com/watch?v=LfmA_ufFDCg");
            System.out.println("https://www.youtube.com/watch?v=QAsJvKsd2Xk");
            System.out.println("https://www.youtube.com/watch?v=Rv9SwZWVkOs");
            System.out.println("https://www.youtube.com/watch?v=QAsJvKsd2Xk");
            System.out.println("https://www.youtube.com/watch?v=_wVuCGG2qFs");
            System.out.println("https://www.youtube.com/watch?v=DmAVxAMPZuk");
            System.out.println("https://www.youtube.com/watch?v=HR-PwsUayY0");
        }

        Socket socket = new Socket("localhost", portNum);
        Client client = new Client(socket, username);
        client.listenForMessage();  //Both run on same time because they use different threads
        client.sendMessage();

    }
}
