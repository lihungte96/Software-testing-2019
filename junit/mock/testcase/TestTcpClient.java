import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.*; // before after ...

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.*;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.Mockito.*;

import static org.mockito.Mockito.*;

public class TestTcpClient {	

	@Test
	public void testTcpClientWithServer() throws Exception {
		final String initialString = "From Server : Hi !"; // Guess what server response // Not good

		final Socket socket = new Socket("127.0.0.1", 6666);

		TcpClientParseCommunicate tcpClientParseCommunicate = new TcpClientParseCommunicate(socket);
		tcpClientParseCommunicate.communicate();
		tcpClientParseCommunicate.parseInput();
		StringBuffer sb = tcpClientParseCommunicate.getBuf();

		assertEquals(initialString, sb.toString());
	}

	@Test
	public void testTcpClientWithMockMockito() throws Exception {
		Socket clientMock = mock(Socket.class);

		TcpClientParseCommunicate tcpClientParseCommunicate = new TcpClientParseCommunicate(clientMock);
		tcpClientParseCommunicate.communicate();
		
		verify(clientMock).getInputStream();
	}

	@Test
	public void testTcpClientWithMockMockitoVerify() throws Exception {
		Socket clientMock = mock(Socket.class);

		TcpClientParseCommunicate tcpClientParseCommunicate = new TcpClientParseCommunicate(clientMock);
		
		verify(clientMock, never()).getInputStream();
	}
}
