import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker w;

    @BeforeEach
    void setUp() {
        w = new Worker("000001","Test","Worker","Mr.",1969,20);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(800.0,w.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Hours of regular pay: 40.0\nTotal regular pay: $800.0\nHours of overtime pay: 0\nTotal overtime pay: $0\nTotal weekly pay: $800.0",w.displayWeeklyPay(40));
    }
}