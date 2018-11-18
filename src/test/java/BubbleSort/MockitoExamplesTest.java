package BubbleSort;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.Period;
import java.util.LinkedList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MockitoExamplesTest {

    @Test
    void firstTest() {
        LinkedList mockedList = mock(LinkedList.class);
        //stubbing
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenThrow(new RuntimeException());
        //following prints "first"
        System.out.println(mockedList.get(0));
        //following throws runtime exception
        //System.out.println(mockedList.get(1));
    }

    @Test
    void testPersonMock() {
        Person personMock = Mockito.mock(Person.class);
        Mockito.when(personMock.getFirstName()).thenReturn("Jan");
        Mockito.when(personMock.getLastName()).thenReturn("Nowak");

        System.out.println(personMock.getFirstName());
        System.out.println(personMock.getLastName());
    }
}
