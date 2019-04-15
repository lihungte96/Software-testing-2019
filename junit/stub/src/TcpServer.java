import java.net.*;
import java.io.*;

// 1. 本程式必須與 TcpClient.java 程式搭配執行，先執行本程式再執行 TcpClient。
// 2. 執行方法 : java TcpServer

public class TcpServer {
    private int port;

    public TcpServer(int port) {
        this.port = port;
    }

    public void tcpServer() throws Exception {
        ServerSocket ss = new ServerSocket(port); // 建立 TCP 伺服器。
        while (true) { // 不斷的接收處理輸入訊息。
            Socket sc = ss.accept(); // 接收輸入訊息。
            OutputStream os = sc.getOutputStream(); // 取得輸出串流。
            os.write("From Server : Hi !".getBytes("UTF-8"));// 送訊息到 Client 端。
            os.close(); // 關閉輸出串流。
            sc.close(); // 關閉 TCP 伺服器。
        }
    }
}