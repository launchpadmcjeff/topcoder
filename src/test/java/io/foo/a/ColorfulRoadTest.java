package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.ColorfulRoad;

import org.junit.Before;
import org.junit.Test;

public class ColorfulRoadTest {

	private ColorfulRoad sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new ColorfulRoad();
	}

	@Test
	public void testGetMin0() {

		String road = "RGGGB";
		int expected = 8;
		int actual = sut.getMin(road);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMin1() {
		String road = "RGBRGBRGB";
		int expected = 8;
		int actual = sut.getMin(road);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMin2() {
		String road = "RBBGGGRR";
		int expected = -1;
		int actual = sut.getMin(road);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMin3() {
		String road = "RBRRBGGGBBBBR";
		int expected = 50;
		int actual = sut.getMin(road);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMin4() {
		String road = "RG";
		int expected = 1;
		int actual = sut.getMin(road);
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMin5() {
		String road = "RBRGBGBGGBGRGGG";
		int expected = 52;
		int actual = sut.getMin(road);
		assertEquals(expected, actual);
	}
	
	/*


	"RB"		-1		Passed	


	"RR"		-1		Passed	


	"RBRBRBRBRBRBRBG"		196		Passed	


	"RGRGRGRGRGRGRGR"		-1		Passed	


	"RBRBRBRBRGRGRGR"		-1		Passed	


	"RRRRRRRRRRRRRRR"		-1		Passed	


	"RGGGGGGGGGGGGGR"		-1		Passed	


	"RBBBBBBBBBBBBBR"		-1		Passed	


	"RGGGBBRRRRGGBBR"		34		Passed	


	"RGGBBRRGGBBRRG"		25		Passed	


	"RGGGBBBRRRGGGB"		35		Passed	


	"RGGGGBBBBRRRRG"		43		Passed	


	"RGGGGGBBBBBRRRG"		50		Passed	


	"RG"		1		Passed	


	"RRB"		-1		Passed	


	"RGBR"		3		Passed	


	"RGRBG"		16		Passed	


	"RGBRRG"		7		Passed	


	"RRBRBGG"		36		Passed	


	"RRGBGRRR"		21		Passed	


	"RGBGBRRRB"		34		Passed	


	"RRGGGBBGGR"		27		Passed	


	"RBGGGRGRRGB"		52		Passed	


	"RBRGBRBGBGBG"		47		Passed	


	"RGBGBBRGBBBBG"		50		Passed	


	"RRGRGRGGRRRRBR"		73		Passed	


	"RGGBGBGBRBRGBGG"		50		Passed	


	"RRBRB"		-1		Passed	


	"RRRBR"		-1		Passed	


	"RGBGG"		16		Passed	


	"RBBBB"		-1		Passed	


	"RRRRB"		-1		Passed	


	"RBBGBBGGGGRGRGG"		54		Passed	


	"RRRRRGBGRBRBRRG"		54		Passed	


	"RBRRBRRGRRGGBGR"		78		Passed	


	"RRGBRGRGRRBBBBR"		40		Passed	


	"RGBGRGRGRGRGRBR"		44		Passed	


	"RGGBR"		6		Passed	


	"RGBBBR"		9		Passed	


	"RRRGBBR"		14		Passed	


	"RRRGGBBR"		17		Passed	


	"RRRRRRRRRRRRRG"		169		Passed	


	"RRRRRRRRGGGGGB"		89		Passed	


	"RRGGGGGGGGBBR"		54		Passed	


	"RGGGGGGGGGBRG"		52		Passed	


	"RRRRRRRRRRRRRRG"		196		Passed	


	"RGGGGGGGGGGGGGB"		98		Passed	


	"RGGGGGGGBBBBBBR"		66		Passed	


	"RRRGGGGBRRRRRRG"		50		Passed	


	"RRRRGGGBBBBBRGB"		50		Passed	


	"RRRRGBBBBBRRGBR"		40		Passed	


	"RRRRRGBBBBRGBRG"		42		Passed	


	"RGBRRRRGGGGBRGB"		32		Passed	


	"RGBBRGBBBRGGGBR"		24		Passed	


	"RGBRGGGBBRRGBRG"		22		Passed	


	"RGBBRGBBRGGBRGB"		20		Passed	


	"RGBRGBRGBBRGBBR"		18		Passed	


	"RRGBRGBRGBRGBRG"		16		Passed	


	"RGBRGBRGBRGBRGB"		14		Passed	


	"RRRRRRGGGGGBRRG"		66		Passed	


	"RRRRGGBBBBBBRRG"		52		Passed	


	"RGGGGGGGGBRRRRG"		54		Passed	


	"RRRRRRRRRRGBRRG"		106		Passed	


	"RGGGGBBBBRGGGGB"		40		Passed	


	"RRRRGBBBBBRGGGB"		42		Passed	


	"RRRGGGGBBRRRRGB"		44		Passed	


	"RGGGBBBRRRRRRGB"		44		Passed	


	"RGGBBBBBRGGGBBR"		34		Passed	


	"RRRRGBBRRRRGBBR"		38		Passed	


	"RGBBRRRRRRRRGBR"		48		Passed	


	"RGGGBBRRRRRGGBR"		36		Passed	


	"RRRRRRRRRRRRRRR"		-1		Passed	


	"RGBRGBRGBRGB"		11		Passed	


	"RGGRB"		8		Passed	


	"RGBGRR"		11		
	*/
}
