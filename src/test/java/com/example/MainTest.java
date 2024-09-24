package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testGreet() {
        Main app = new Main();
        assertEquals("Hello, CI/CD!", app.greet());
    }
}
