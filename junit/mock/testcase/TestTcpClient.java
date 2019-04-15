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
import static org.mockito.Mockito.withSettings;
//import static org.mockito.Mockito.CALLS_REAL_METHODS;

public class TestTcpClient {

	@Before
	public void setup() {
	}

	@Test
	public void testTcpClientWithServer() throws Exception {
		final String initialString = "From Server : Hi !";
		TcpClient tcpClient = new TcpClient("127.0.0.1", 6666);
		tcpClient.connect();
		tcpClient.communicate();
		tcpClient.parseInput();
		StringBuffer sb = tcpClient.getBuf();
		assertEquals(initialString, sb.toString());
	}

	@Test
	public void testTcpClientWithMockMockito() throws Exception {
		Socket clientMock = mock(Socket.class);

		TcpClient tcpClient = new TcpClient(null, -1) {
			@Override
			public void connect() throws Exception {
				setClient(clientMock);
			}
		};

		tcpClient.connect();
		tcpClient.communicate();

		verify(clientMock).getInputStream();
	}

	@Test
	public void testTcpClientWithMockMockitoVerify() throws Exception {
		Socket clientMock = mock(Socket.class);

		TcpClient tcpClient = new TcpClient(null, -1) {
			@Override
			public void connect() throws Exception {
				setClient(clientMock);
			}
		};

		tcpClient.connect();

		verify(clientMock, never()).getInputStream();
	}
}
