package example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class dummyTest {

    @Test
    @Tag("a")
    public void testA() {
        System.out.println("Test tagged 'A'");
        assertTrue(true);
    }

    @Test
    @Tag("b")
    public void testB() {
        System.out.println("Test tagged 'B'");
        assertTrue(true);
    }
}