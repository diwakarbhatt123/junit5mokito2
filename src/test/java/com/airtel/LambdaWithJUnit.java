package com.airtel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LambdaWithJUnit {

    @Test
    public void testWithLambda(){
        assertAll("A lot of assertion", ()->{
            assertTrue(true);
        }, ()->{
            assertEquals(22,22);
        });
    }

}
