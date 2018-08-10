package com.airtel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class MokedTest {

    private DummyClass dummyClass = mock(DummyClass.class);

    @Test
    public void testMockedClass(){
        when(dummyClass.getName()).thenReturn("Mocked Name");

        when(dummyClass.addNumbers(anyInt(),anyInt())).thenReturn(anyInt());

        assertEquals(dummyClass.getName(),"Mocked Name");

    }

    @Test
    public void testMockedDependency(){
        when(dummyClass.getName()).thenReturn("Mocked Name");

        DummyClass2 dummyClass2 = new DummyClass2();

        assertEquals(dummyClass2.setNameFromDummyClass(dummyClass),"Mocked Name");

    }

}
