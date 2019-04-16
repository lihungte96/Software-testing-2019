import java.net.*;
import java.io.*;

// 1. 本程式必須與 TcpServer.java 程式搭配執行，先執行 TcpServer 再執行本程式。
// 2. 本程式必須有一個參數，指定伺服器的 IP。
// 用法範例： java TcpClient

class TcpClientParseCommunicate {
    private Socket client;
    private InputStream inputStream;
    private StringBuffer buf;

    public TcpClientParseCommunicate(Socket client) {
        this.client = client;
    }

    public StringBuffer getBuf() {
        return buf;
    }

    public void communicate() throws Exception {
        this.inputStream = client.getInputStream(); // 取得輸入訊息的串流
    }

    public void parseInput() throws Exception {
        try {
            buf = new StringBuffer(); // 建立讀取字串。
            while (true) { // 不斷讀取。
                int x = inputStream.read(); // 讀取一個 byte。(read 傳回 -1 代表串流結束)
                if (x == -1)
                    break; // x = -1 代表串流結束，讀取完畢，用 break 跳開。
                byte b = (byte) x; // 將 x 轉為 byte，放入變數 b.
                buf.append((char) b);// 假設傳送ASCII字元都是 ASCII。
            }
        } catch (Exception e) {
            inputStream.close(); // 關閉輸入串流。
        }
    }

}

public class TcpClient {
    private Socket client;
    private TcpClientParseCommunicate tcpClientParseCommunicate;

    public TcpClient(String ip, int port) throws Exception {
        client = new Socket(ip, port); // 連接至遠端機器
    }

    public void read() throws Exception {
        tcpClientParseCommunicate = new TcpClientParseCommunicate(client);
        tcpClientParseCommunicate.communicate();
        tcpClientParseCommunicate.parseInput();
    }

    public void output() throws Exception {
        StringBuffer buf = tcpClientParseCommunicate.getBuf();
        System.out.println(buf); // 印出接收到的訊息。
        client.close();
    }
}
