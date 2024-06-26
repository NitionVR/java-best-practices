package org.nition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestExample {


    @Test
    void testGreeting(){

        assertEquals(Example.greeting(),"Hello World!");
    }

}
