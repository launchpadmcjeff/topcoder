package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.Islands;

import org.junit.Before;
import org.junit.Test;

public class IslandsTest {

	private Islands sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Islands();
	}

	@Test
	public void testBeachLength0() {
		String[] kingdom = {".#...#.."};
		int expected = 4;
		int actual = sut.beachLength(kingdom);
		assertEquals(expected, actual);
	}
	@Test
	public void testBeachLength1() {
		String[] kingdom = {"..#.##", 
				".##.#.", 
				"#.#..."};
		int expected = 19;
		int actual = sut.beachLength(kingdom);
		assertEquals(expected, actual);
	}
	@Test
	public void testBeachLength2() {
		String[] kingdom = {"#...#.....",
				"##..#...#."};
		int expected = 15;
		int actual = sut.beachLength(kingdom);
		assertEquals(expected, actual);
	}
	@Test
	public void testBeachLength3() {
		String[] kingdom = {"....#.",
				".#....",
				"..#..#",
				"####.."};
		int expected = 24;
		int actual = sut.beachLength(kingdom);
		assertEquals(expected, actual);
	}

}
