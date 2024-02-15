package socat;


import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;

public class CreateSocket {

    public static void main(String[] args) {
        ServerSocket theServer = null;
        int port;
        String sPort = "277";
        port = Integer.parseInt(sPort);
        Scanner sc = new Scanner(System.in);
        System.out.print(sc.nextInt());
        try {
            theServer = new ServerSocket(port);
            System.out.println(port + "에 바인드된 서버 소켓 객체를 생성 했음");

            theServer.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
