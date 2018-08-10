package com.airtel;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionalEnabledDisabledTest {

    @Test
    @EnabledIf("2 + 2 === 4")
    public void enabledOnCondition(){
        assertTrue(true);
    }

    @Test
    @DisabledIf("2 + 2 === 4")
    public void disabledOnCondition(){
        assertTrue(true);
    }

}
