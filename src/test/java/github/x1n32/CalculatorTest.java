package github.x1n32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * Testing Math Utils class
 * Testing is not debugging. We take a single object, and test it, by invoking
 * it and
 * making sure we get the correct result.
 * Testing should be repeatable, self-verifying, runs simultaneouslt, and return
 * the same results.
 * 
 */
class CalculatorTest {

	private Calculator calculator;

	@BeforeEach
	void initEach() {
		calculator = new Calculator();
		System.out.println("Now running tests");
	}

	@Nested
	class AddTest {

		@Test
		public void shouldAnswerWithTrue() {
			assertTrue(true);
		}

		@Test
		public void shouldAnswerWithFalse() {
			assertFalse(false);
		}

		@Test
		void testAddingTwoPositives() {
			assertEquals(2, calculator.add(1, 1),
					"Add method should return the sum of two numbers");
		}

		@Test
		@DisplayName("Adding 2 negative numbers")
		void testAddingTwoNegatives() {
			assertEquals(-2, calculator.add(-1, -1),
					"Add method should return the sum of two numbers");
		}

		@Test
		void testAddingAPositiveAndANegative() {
			assertEquals(0, calculator.add(-1, 1),
					"Add method should return the sum of two numbers");
		}
	}

	@Nested
	class multiplyTest {
		@Test
		void testMultiply() {
			assertAll(
					() -> assertEquals(0, calculator.multiply(1, 0),
							"1*0 = 0. Numbers must have been changed if there's an error."),
					() -> assertEquals(1, calculator.multiply(1, 1), "1*1 = 1"),
					() -> assertEquals(6, calculator.multiply(2, 3), "2*3 = 6"));
		}

		@Test
		public void testFiftyTimesTwo_ReturnsOneHundred() {
			// Arrange
			final float expected = 100;
			// Act
			final float actual = calculator.multiply(50, 2);
			// Assert
			assertEquals(actual, expected, "Should return 100. 50 x 2 = 100");
		}

		@Test
		void computeCircleArea() {
			assertEquals(314.1592653589793, calculator.computeCircleArea(10),
					"Should return right circle area");
		}

		@Nested
		class DivideTest {
			@Test
			void testDivide() {
				assertAll(
						() -> assertEquals(10, calculator.divide(100, 10)),
						() -> assertEquals(100, calculator.divide(150, 1.5f)),
						() -> assertEquals(0.5, calculator.divide(50, 100)));
			}

			@Test
			void testDivideArgumentException() {
				assertThrows(IllegalArgumentException.class, () -> calculator.divide(4, 0),
						"Divide should throw ArithmeticException when denominator is zero");
			}

		}
	}
}
