import org.junit.Test;
import org.junit.*; // before after ...

import static org.junit.Assert.assertEquals;

import java.net.*; // Socket

public class TestTcpSocket {
    @Test
    public void testTcpClientWithServer() throws Exception {
        final String initialString = "From Server : Hi !"; // Guess what server response // Not good

        System.out.println("Try to connect with remote server");

        final Socket socket = new Socket("127.0.0.1", 6666);

        TcpClientParseCommunicate tcpClientParseCommunicate = new TcpClientParseCommunicate(socket);
        tcpClientParseCommunicate.communicate();
        tcpClientParseCommunicate.parseInput();
        StringBuffer sb = tcpClientParseCommunicate.getBuf();

        assertEquals(initialString, sb.toString());
    }
}
