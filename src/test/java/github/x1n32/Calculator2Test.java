package github.x1n32;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class Calculator2Test {
    
	private Calculator2 calculator2;

    @BeforeEach
	void initEach() {
		calculator2 = new Calculator2();
		System.out.println("Now running tests");
	}

    @Nested
	class AddTest {
        @Test
		public void squareNumberCheck() {
            System.out.println("Doing Square number checks. Should return the input value multiplied by itself. e.g. 2 * 2 = 4");
            assertAll(
				() -> assertEquals(1, calculator2.squareOfB(1)),
				() -> assertEquals(1, calculator2.squareOfB(-1)),
				() -> assertEquals(4, calculator2.squareOfB(2)),
                () -> assertEquals(25, calculator2.squareOfB(5)),
				() -> assertEquals(10000, calculator2.squareOfB(100)),
                () -> assertEquals(0, calculator2.squareOfB(0)),
				() -> assertEquals(100, calculator2.squareOfB(-10)),
                () -> assertEquals(225, calculator2.squareOfB(-15)),
				() -> assertEquals(0.25, calculator2.squareOfB(0.5f))
				);
        }


        @Test
		@DisplayName("Testing 4AC")
		public void fouracCheck() {
            System.out.println("Doing 4 *a *c");
            assertAll(
				() -> assertEquals(4, calculator2.fourAC(1,1), " 4 * 1 * 1 = 4"),
				() -> assertEquals(0, calculator2.fourAC(1,0), " 4 * 1 * 0 = 0"),
				() -> assertEquals(0, calculator2.fourAC(0,1), " 4 * 0 * 1 = 0"),
                () -> assertEquals(400,calculator2.fourAC(10,10), " 4 * 10 * 10 = 400"),
                () -> assertEquals(-4, calculator2.fourAC(1,-1), " -4 * 1 * -1 = -4"),
                () -> assertEquals(64,calculator2.fourAC(4,4), " 4 * 4 * 4 = 64"),
				() -> assertEquals(-4, calculator2.fourAC(-1, 1), "4 * -1 * 1")
				);
        }

        @Test
		public void sqrtTest() {
            System.out.println("Testing Square roots. Where a gets taken away by b, then sqrt the answer");
            assertAll(
				() -> assertEquals(4, calculator2.squareRootAnswer(20,4), "sqrt 16 = 4"),
				() -> assertEquals(8, calculator2.squareRootAnswer(63,-1), "sqrt 64 = 8"),
				() -> assertEquals(10, calculator2.squareRootAnswer(110, -10), "sqrt 100 = 10")
				);
        }


		@Test
		public void OverallQuadraticFormulaCheck() {
            float a = 2;
            float b = -5;
            float c = -6;
            calculator2.quadraticFormula(a,b,c);
            assertEquals((b*b), calculator2.squareOfB(b), "This should return the value of b * b. e.g. 5 * 5 which equals 25");
			assertEquals((4*a *c), calculator2.fourAC(a, c), "This should return the result of 4 * a * c. If a = 2 and c = -6: 4*2*-6 = -48");
            assertEquals(8.54400374531753, calculator2.squareRootAnswer(calculator2.squareOfB(b), calculator2.fourAC(a, c)), "This should return the square root of b^2 - 4ac. Can use Math.sqrt to square root the answer.");
            assertEquals(3.3860009363293826,calculator2.positiveAnswer(a,b,c),
					"Using the answer form the square root function, it should ADD to -b, then divide it by 2a");
            assertEquals(-0.8860009363293826,calculator2.negativeAnswer(a,b,c),
					"Using the answer form the square root function, it should SUBTRACT from -b, then divide it by 2a");
                         

		}


    }
}