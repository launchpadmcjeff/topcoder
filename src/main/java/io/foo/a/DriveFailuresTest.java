package io.foo.a;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DriveFailuresTest {

	private DriveFailures sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new DriveFailures();
	}

	@Test
	public void testFailureChances0() {
		double[] failureProb = {1.0, 0.25, 0.0};
		double[] expecteds = {0.0, 0.75, 0.25, 0.0 };
		double[] actuals = sut.failureChances(failureProb);
		double delta = 1.0e-9;
		assertArrayEquals(expecteds, actuals, delta);
	}
	@Test
	public void testFailureChances1() {
		double[] failureProb = {0.4, 0.7};
		double[] expecteds = {0.18000000000000002, 0.54, 0.27999999999999997 };
		double[] actuals = sut.failureChances(failureProb);
		double delta = 1.0e-9;
		assertArrayEquals(expecteds, actuals, delta);
	}
	@Test
	public void testFailureChances2() {
		double[] failureProb = {0.2, 0.3, 0.0, 1.0, 0.8, 0.9};
		double[] expecteds = {0.0, 0.011199999999999993, 0.15319999999999995, 0.5031999999999999, 0.2892, 0.0432, 0.0 };
		double[] actuals = sut.failureChances(failureProb);
		double delta = 1.0e-9;
		assertArrayEquals(expecteds, actuals, delta);
	}

}
