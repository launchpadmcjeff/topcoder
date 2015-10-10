package io.foo;

import static org.junit.Assert.assertArrayEquals;
import io.foo.Bonuses;

import org.junit.Before;
import org.junit.Test;


public class BonusesTest {

	Bonuses sut;

	@Before
	public void setUp() {
		sut = new Bonuses();
	}

	@Test
	public void testGetDivision0() {
		assertArrayEquals(new int[] { 6, 13, 20, 27, 34 },
				sut.getDivision(new int[] { 1, 2, 3, 4, 5 }));
	}

	@Test
	public void testGetDivision1() {
		assertArrayEquals(new int[] { 17, 17, 17, 17, 16, 16 },
				sut.getDivision(new int[] { 5, 5, 5, 5, 5, 5 }));
	}

	@Test
	public void testGetDivision2() {
		assertArrayEquals(
				new int[] { 8, 6, 4, 2, 8, 5, 5, 3, 1, 4, 5, 4, 6, 3, 5, 4, 1,
						8, 1, 6, 3, 8 },
				sut.getDivision(new int[] { 485, 324, 263, 143, 470, 292, 304,
						188, 100, 254, 296, 255, 360, 231, 311, 275, 93, 463,
						115, 366, 197, 470 }));
	}

}
