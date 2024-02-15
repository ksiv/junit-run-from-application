package example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class dummyTest {

    @Test
    @Tag("a")
    public void testPass() {
        System.out.println("Test PASS example");
        assertTrue(true);
    }

    @Test
    @Tag("a")
    public void testFail() {
        System.out.println("Test FAIL example");
        assertTrue(false);
    }
}