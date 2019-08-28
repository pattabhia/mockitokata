package com.example.ex1.api;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void listTest() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2, listMock.size());
    }

    @Test
    public void listReturnMultipleValues() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);
        assertEquals(2, listMock.size());
        assertEquals(3, listMock.size());
    }

    @Test
    public void listGetMock() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenReturn("welcome");
        assertEquals("welcome", listMock.get(0));
        assertEquals("welcome", listMock.get(1));
    }

    @Test(expected = RuntimeException.class)
    public void listMockThrowException() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenThrow(new RuntimeException());
        listMock.get(0);
    }
}
