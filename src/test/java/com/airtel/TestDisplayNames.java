package com.airtel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDisplayNames {

    @Test
    @DisplayName("This test is dummy")
    public void dummyName(){
        assertEquals("Ok","Ok");
    }

}
