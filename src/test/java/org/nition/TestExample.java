package org.nition;

import org.junit.jupiter.api.Test;
import org.nition.Example;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExample {

    @Test
    void testGreeting(){
        assertEquals(Example.greeting(), "Hello World!");
    }

    @Test
    void testGetDatabasePassword(){
        assertEquals(Example.getDatabasePassword(), "superSecretPassword");
    }
}
