package com.caomt.mockitotest;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.*;
public class App {

    @Test
    public void testList(){
        List mockedList = mock(List.class);
        mockedList.add("first");
        mockedList.clear();
        verify(mockedList).add("first");
        verify(mockedList).clear();

        when(mockedList.get(0)).thenReturn("first").thenReturn("second");

        when(mockedList.get(anyInt())).thenReturn(null);
        System.out.println(mockedList.get(0));
        System.out.println(mockedList.get(-2));
        System.out.println(mockedList.get(1));
    }
}
