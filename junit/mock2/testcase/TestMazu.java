import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;
import static java.util.Arrays.asList;

import org.junit.Before; // before after ...
import org.junit.Test;
import org.mockito.ArgumentCaptor;

public class TestMazu {
    private String receiverName;
    private int yearInDate;
    private int mounthInDate;
    private int dateInDate;
    private Dream dreamMock;

    @Before
    public void setupWithGou() {
        receiverName = "Terry Gou";
        yearInDate = 2019;
        mounthInDate = 4;
        dateInDate = 16;
        dreamMock = mock(Dream.class);

    }

    @Test
    public void testMazuMockDreamShow() {
        Mazu cihuiMazu = new Mazu(yearInDate);
        cihuiMazu.showMercyInDream(dreamMock, receiverName, mounthInDate, dateInDate);

        verify(dreamMock).show();
    }

    @Test
    public void testMazuMockDreamShowTwice() {
        Mazu cihuiMazu = new Mazu(yearInDate);
        cihuiMazu.showMercyInDream(dreamMock, receiverName, mounthInDate, dateInDate);
        cihuiMazu.showMercyInDream(dreamMock, receiverName, mounthInDate, dateInDate);

        verify(dreamMock, times(2)).show();
    }

    @Test
    public void testMazuMockDreamShowNever() {
        Mazu cihuiMazu = new Mazu(yearInDate);

        verify(dreamMock, never()).show();
    }

    @Test
    public void testMazuMockDreamSetReceiver() {
        Mazu cihuiMazu = new Mazu(yearInDate);
        cihuiMazu.showMercyInDream(dreamMock, receiverName, mounthInDate, dateInDate);

        verify(dreamMock).setReceiver(receiverName);
        // verify(dreamMock).setReceiver("Me");
    }

    @Test
    public void testMazuMockDreamSetReceiverArgumentAny() {

        Mazu cihuiMazu = new Mazu(yearInDate);
        cihuiMazu.showMercyInDream(dreamMock, receiverName, mounthInDate, dateInDate);

        verify(dreamMock).setReceiver(anyString());
    }

    @Test
    public void testMazuMockDreamSetReceiverArgument() {
        ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);

        Mazu cihuiMazu = new Mazu(yearInDate);
        cihuiMazu.showMercyInDream(dreamMock, receiverName, mounthInDate, dateInDate);

        verify(dreamMock).setReceiver(argument.capture());
        String actualReceiverName = argument.getValue();

        assertEquals(receiverName, actualReceiverName);
    }

    @Test
    public void testMazuMockDreamSetDateArgumentAny() {
        Mazu cihuiMazu = new Mazu(yearInDate);
        cihuiMazu.showMercyInDream(dreamMock, receiverName, mounthInDate, dateInDate);

        verify(dreamMock).setDate(anyInt(), anyInt(), anyInt());
    }

    @Test
    public void testMazuMockDreamSetDateArgument() {
        List expectedList = asList(yearInDate, mounthInDate, dateInDate);
        ArgumentCaptor<Integer> argument = ArgumentCaptor.forClass(Integer.class);

        Mazu cihuiMazu = new Mazu(yearInDate);
        cihuiMazu.showMercyInDream(dreamMock, receiverName, mounthInDate, dateInDate);

        verify(dreamMock).setDate(argument.capture(), argument.capture(), argument.capture());
        List actualReceiverName = argument.getAllValues();
        assertEquals(expectedList, actualReceiverName);
    }
}
