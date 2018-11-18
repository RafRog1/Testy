package FibonacciChain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciChainTest {

    @ParameterizedTest
    @MethodSource("numbersToTest")
    void testParameterizedSubtract(int first, int second) {
        FibonaciChain fibonaciChain = new FibonaciChain();
        if (first < 0) {
            Assertions.assertThrows(LessThanZero.class, () -> fibonaciChain.calculate(first));
        } else {
            int fibonacciResult = fibonaciChain.calculate(first);
            assertEquals(fibonacciResult, second);
        }
    }

    private static Stream<Arguments> numbersToTest() {
        return Stream.of(
                Arguments.arguments(-1, 10),
                Arguments.arguments(-10, 10),
                Arguments.arguments(-100, 0),
                Arguments.arguments(35, 9227465),
                Arguments.arguments(0, 0),
                Arguments.arguments(1, 1),
                Arguments.arguments(2, 1),
                Arguments.arguments(3, 2),
                Arguments.arguments(10, 55),
                Arguments.arguments(14, 377),
                Arguments.arguments(20, 6765)
        );
    }
}
