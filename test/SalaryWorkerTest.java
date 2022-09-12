import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker sw;

    @BeforeEach
    void setUp() {
        sw = new SalaryWorker("000001","Test","Salary","Mr.",1969,0,52000);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1000,sw.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Weekly pay is $1000.0, or 1/52nd of yearly salary, $52000.0",sw.displayWeeklyPay(40));
    }
}