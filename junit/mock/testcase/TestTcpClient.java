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
