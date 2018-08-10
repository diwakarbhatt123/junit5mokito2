package com.airtel;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DisabledTest {

    @Test
    public void enabledTestCase(){
        assertEquals(30,20+10);
    }

    @Test
    @Disabled("Will fail till i fix the code")
    public void disabledTestCase(){
        assertEquals(50,25+25);
    }
}
