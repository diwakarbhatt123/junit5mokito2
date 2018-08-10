package com.airtel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class TestWithBefore {

    @BeforeAll
    public static void init(){
        System.out.println("This will be called only first time");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("This will be called before every test case");
    }

    @Test
    public void anotherDummyTest(){
        assertEquals(4,2+2,"This test was success");
    }

    @Test
    public void secondDummyTest(){
        assertEquals(5,3+2);
    }

    @AfterEach
    public void afterEach(){
        System.out.println("This will be called after each test case");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("This will called at the end of test cases");
    }
}
