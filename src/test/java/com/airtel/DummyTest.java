package com.airtel;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DummyTest {

    //Simple Test Case
    @Test
    public void firstTest(){
        Assertions.assertEquals(2,1,"Dummy test failed");
    }

    @Test
    public void failingTest(){
        Assertions.assertEquals(40, 2+2);
    }
}
