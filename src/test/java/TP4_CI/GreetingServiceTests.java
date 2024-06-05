package TP4_CI;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GreetingServiceTests {

    @Autowired
    private GreetingService greetingService;

    @Test
    void testGreet() {
        String result = greetingService.greet();
        assertEquals("Hello, World!", result);
    }
}