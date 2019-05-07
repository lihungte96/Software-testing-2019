import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMultiplication {

	@Test
	public void testMultiplication() {
		// Test simple multiplications
		int a = 3;
		int b = 5;
		int expectedANS = 15;

		Multiplication multiplication = new Multiplication();
		int actualANS = multiplication.multiplication(a, b);

		assertEquals(expectedANS, actualANS);
	}

	@Test
	public void testMultiplicationWithStubMockitoAbsolute() {
		// Test two number multiplications
		int a = 3;
		int b = 5;
		int expectedANS = 15;
		ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(a, b));

		Factorization factorizationStub = mock(Factorization.class);
		when(factorizationStub.factorization(expectedANS)).thenReturn(array);

		Multiplication multiplication = new Multiplication();
		int actualANS = multiplication.multiplicationWithFactorizationAbsolute(factorizationStub, expectedANS);

		assertEquals(expectedANS, actualANS);
	}

	@Test
	public void testMultiplicationWithStubMockito() {
		// Test two number multiplications
		int a = -7;
		int b = 5;
		int expectedANS = -35;
		ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(a, b));

		Factorization factorizationStub = mock(Factorization.class);
		when(factorizationStub.factorization(expectedANS)).thenReturn(array);
		when(factorizationStub.factorizationRoot(-35, true)).thenReturn(1);

		Multiplication multiplication = new Multiplication();
		int actualANS = multiplication.multiplicationWithFactorization(factorizationStub, expectedANS, true);

		assertEquals(expectedANS, actualANS);
	}

	@Test
	public void testMultiplicationWithStubMockitoAny() {
		// Test two number multiplications
		int a = 7;
		int b = 5;
		int expectedANS = -35;
		ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(a, b));

		Factorization factorizationStub = mock(Factorization.class);
		when(factorizationStub.factorization(expectedANS)).thenReturn(array);
		when(factorizationStub.factorizationRoot(anyInt(), anyBoolean())).thenReturn(-1);

		Multiplication multiplication = new Multiplication();
		int actualANS = multiplication.multiplicationWithFactorization(factorizationStub, expectedANS, false);

		assertEquals(expectedANS, actualANS);
	}

	//@Test
	public void testMultiplicationThreeNumberArrayList() {
		// Test three number multiplications
		// Here should init prepared answer

		// Here should new Factorization object with Mockito stub
		// Here should ask stub object to act whatever we want

		Multiplication multiplication = new Multiplication();
		int actualANS = multiplication.multiplicationWithFactorizationAbsolute(factorizationStub, expectedANS);

		assertEquals(expectedANS, actualANS);
	}

	//@Test
	public void testMultiplicationOneNumberArrayList() {
		// Test one number multiplications, complete test coverage to 100%
		// Here should init prepared answer

		// Here should new Factorization object with Mockito stub
		// Here should ask stub object to act whatever we want

		Multiplication multiplication = new Multiplication();
		int actualANS = multiplication.multiplicationWithFactorizationAbsolute(factorizationStub, expectedANS);

		assertEquals(expectedANS, actualANS);
	}
}
