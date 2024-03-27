import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(5, Calculator.add(2,3));
        assertEquals(1, Calculator.add( -2,3));
        assertEquals(3, Calculator.add(0,3));
    }

    @Test
    void subtract() {
        assertEquals(2, Calculator.subtract(5,3));
        assertEquals(-5, Calculator.subtract( -2,3));
        assertEquals(-3, Calculator.subtract(0,3));
    }

    @Test
    void multiply() {
        assertEquals(6.9, Calculator.multiply(2.3,3),6.9);
        assertEquals(-6, Calculator.multiply( -2,3));
        assertEquals(0, Calculator.multiply(0,3));
    }

    @Test
    void divide() {
        assertEquals(1.2, Calculator.divide(6,5));
        assertEquals(-2, Calculator.divide( -6,3));
        assertEquals(0, Calculator.divide(0,3));
        assertEquals(Double.POSITIVE_INFINITY,Calculator.divide(3,0));
    }
}