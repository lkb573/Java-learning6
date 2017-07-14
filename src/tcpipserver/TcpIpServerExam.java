package tcpipserver;


import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServerExam {
    public static void main(String[] args){

        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime() + "SERVER READY");
        } catch (IOException e){
            e.printStackTrace();
        }

        while(true){
            try {
                System.out.println(getTime() + "wait request...");
                Socket socket = serverSocket.accept();

                System.out.println(getTime() + socket.getInetAddress() + " --> Account Request..");
                OutputStream out = socket.getOutputStream();

                DataOutputStream dos = new DataOutputStream(out);
                dos.writeUTF("[TEST] Message for Server!");
                System.out.println(getTime() + "data throw..");

                dos.close();
                socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    static String getTime() {
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    }
}