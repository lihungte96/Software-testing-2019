import org.junit.Test;
import org.junit.*; // before after ...

import static org.junit.Assert.assertEquals;

import java.io.InputStream;
import java.io.ByteArrayInputStream;

import java.net.*; // Socket

import org.mockito.Mockito.*; // java mock: Mockito
import static org.mockito.Mockito.*;

public class TestTcpClient {

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
