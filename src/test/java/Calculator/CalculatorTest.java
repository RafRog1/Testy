package Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

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
    void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 5);
        assertEquals(7, result);
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(2, 5);
        assertEquals(-3, result);
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 5);
        assertEquals(10, result);
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(2, 5);
        assertEquals(0.4, result);
    }

    @ParameterizedTest
    @MethodSource("addNumberProviderAdd")
    void testParameterizedAdd(int first, int second, int result) {
        Calculator calculator = new Calculator();
        int addResult = calculator.add(first, second);
        assertEquals(addResult, result);
    }

    @ParameterizedTest
    @MethodSource("addNumberProviderSubtract")
    void testParameterizedSubtract(int first, int second, int result) {
        Calculator calculator = new Calculator();
        int addResult = calculator.subtract(first, second);
        assertEquals(addResult, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5})
    void testValueSourceAdd(int number) {
        Calculator calculator = new Calculator();
        int addResult = calculator.add(number, number);
        assertEquals(number * 2, addResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, 0, 7, 0})
    void testValueSourceDivide(int number) {
        Calculator calculator = new Calculator();
        if(number != 0) {
            double addResult = calculator.divide(number, number);
            assertEquals(1, addResult);
        } else {
            testShouldThrowDivideByZeroException(number);
        }
    }

    @Test
    static void testShouldThrowDivideByZeroException(int number) {
        Calculator calculator = new Calculator();
        //calculator.divide(9, 0);
        Assertions.assertThrows(DivideByZeroDenominator.class, () -> calculator.divide(number, number));
    }

    @Test
    void testShouldThrowDivideByZeroException() {
        Calculator calculator = new Calculator();
        //calculator.divide(9, 0);
        Assertions.assertThrows(DivideByZeroDenominator.class, () -> calculator.divide(9, 0));
    }

    @Test
    void testDoesNotThrowDivideByZeroException() {
        Calculator calculator = new Calculator();
        //calculator.divide(9, 0);
        Assertions.assertDoesNotThrow(() -> calculator.divide(9, 1));
    }


    static Stream<Arguments> addNumberProviderAdd() {
        return Stream.of(
                Arguments.arguments(1, 2, 3),
                Arguments.arguments(2, 2, 4),
                Arguments.arguments(5, 5, 10),
                Arguments.arguments(5, 10, 15),
                Arguments.arguments(5, -5, 0),
                Arguments.arguments(0, 0, 0),
                Arguments.arguments(-1, -5, -6),
                Arguments.arguments(-2, -5, -7),
                Arguments.arguments(999, -9, 990)
        );
    }

    static Stream<Arguments> addNumberProviderSubtract() {
        return Stream.of(
                Arguments.arguments(1, 2, -1),
                Arguments.arguments(2, 2, 0),
                Arguments.arguments(5, 5, 0),
                Arguments.arguments(5, 10, -5),
                Arguments.arguments(5, -5, 10),
                Arguments.arguments(0, 0, 0),
                Arguments.arguments(-1, -5, 4),
                Arguments.arguments(-2, -5, 3),
                Arguments.arguments(999, -9, 1008)
        );
    }
}
