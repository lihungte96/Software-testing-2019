//import TcpServer;
//import TcpClient;

public class TcpExample {
    public static int port = 6666; // 設定傳送埠為 6666。

    public static void main(String args[]) throws Exception {
        System.out.println("===== " + args[0] + " Mode ====="); // 印出接收到的訊息。
        if ("server".equals(args[0])) {
            TcpServer tcpServer = new TcpServer(port);
            tcpServer.tcpServer();
        } else if ("client".equals(args[0])) {
            TcpClient tcpClient = new TcpClient("127.0.0.1", port);
            tcpClient.read();
            tcpClient.output();
        }
    }

}