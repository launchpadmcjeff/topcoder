package io.foo;

import static org.junit.Assert.*;
import io.foo.MedalTable;

import org.junit.Before;
import org.junit.Test;


/*
 Examples
 0)	

 {"ITA JPN AUS", "KOR TPE UKR", "KOR KOR GBR", "KOR CHN TPE"}
 Returns: 
 { "KOR 3 1 0",
 "ITA 1 0 0",
 "TPE 0 1 1",
 "CHN 0 1 0",
 "JPN 0 1 0",
 "AUS 0 0 1",
 "GBR 0 0 1",
 "UKR 0 0 1" }
 These are the results of the archery competitions.
 1)	

 {"USA AUT ROM"}
 Returns: { "USA 1 0 0",  "AUT 0 1 0",  "ROM 0 0 1" }
 2)	

 {"GER AUT SUI", "AUT SUI GER", "SUI GER AUT"}
 Returns: { "AUT 1 1 1",  "GER 1 1 1",  "SUI 1 1 1" }
 */
public class MedalTableTest {

	MedalTable sut;

	@Before
	public void setUp() {
		sut = new MedalTable();
	}

	@Test
	public void testGenerate0() {
		String[] results = sut.generate(new String[] { "ITA JPN AUS",
				"KOR TPE UKR", "KOR KOR GBR", "KOR CHN TPE" });
		assertArrayEquals(
				new String[] { "KOR 3 1 0", "ITA 1 0 0", "TPE 0 1 1",
						"CHN 0 1 0", "JPN 0 1 0", "AUS 0 0 1", "GBR 0 0 1",
						"UKR 0 0 1" }, results);
	}

	@Test
	public void testGenerate1() {
		String[] results = sut.generate(new String[] { "USA AUT ROM" });
		assertArrayEquals(
				new String[] { "USA 1 0 0", "AUT 0 1 0", "ROM 0 0 1" }, results);
	}

	@Test
	public void testGenerate2() {
		String[] results = sut.generate(new String[] { "GER AUT SUI",
				"AUT SUI GER", "SUI GER AUT" });
		assertArrayEquals(
				new String[] { "AUT 1 1 1", "GER 1 1 1", "SUI 1 1 1" }, results);
	}

}
