package com.airtel;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatingTest {

    @RepeatedTest(5)
    public void thisTestWillRepeat(){
        assertEquals("Ok","Ok");
    }

}
