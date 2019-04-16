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
	public void testTcpClientWithStub() throws Exception {
		final String initialString = "testTcpClientWithStub";
		final InputStream targetStream = new ByteArrayInputStream(initialString.getBytes());

		class SocketStub extends Socket {
			SocketStub(String host, int port) {
				// Without connect with remote
			}

			public InputStream getInputStream() {
				return targetStream;
			}
		}

		final Socket socket = new SocketStub(null, -1);

		TcpClientParseCommunicate tcpClientParseCommunicate = new TcpClientParseCommunicate(socket);
		tcpClientParseCommunicate.communicate();
		tcpClientParseCommunicate.parseInput();
		StringBuffer sb = tcpClientParseCommunicate.getBuf();

		assertEquals(initialString, sb.toString());
	}

	@Test
	public void testTcpClientWithStubMockito() throws Exception {
		final String initialString = "testTcpClientWithStubMockito";
		final InputStream targetStream = new ByteArrayInputStream(initialString.getBytes());

		Socket clientStub = mock(Socket.class);
		when(clientStub.getInputStream()).thenReturn(targetStream);

		TcpClientParseCommunicate tcpClientParseCommunicate = new TcpClientParseCommunicate(clientStub);
		tcpClientParseCommunicate.communicate();
		tcpClientParseCommunicate.parseInput();
		StringBuffer sb = tcpClientParseCommunicate.getBuf();

		assertEquals(initialString, sb.toString());
	}
}
