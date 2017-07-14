package tcpipserver;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClientExam {
    public static void main(String[] args){

        try {
            String serverIp = "127.0.0.1";

            System.out.println("Connecting Server... " + serverIp);

            Socket socket = new Socket(serverIp, 7777);

            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            System.out.println("Return Message... " + dis.readUTF());
            System.out.println("Connect End");

            dis.close();
            socket.close();
            System.out.println("Exit!");

        } catch (ConnectException ce) {
            ce.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}