package Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    /*@BeforeAll
    static void beforeAll(){
        System.out.println("Test się robi");
    }

    @BeforeEach
    void before(){
        System.out.println("Testy się robią");
    }*/

    @Test
    void testAdd(){
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 5);
        assertEquals(7, result);
    }

    @Test
    void testSubtract(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(2, 5);
        assertEquals(-3, result);
    }

    @Test
    void testMultiply(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 5);
        assertEquals(10, result);
    }

    @Test
    void testDivide(){
        Calculator calculator = new Calculator();
        double result = calculator.divide(2, 5);
        assertEquals(0.4, result);
    }
}
