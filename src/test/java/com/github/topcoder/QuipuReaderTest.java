package com.github.topcoder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class QuipuReaderTest {

	private QuipuReader sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new QuipuReader();
	}

	@Test
	public void testReadKnots0() {
		
		String[] knots = { 
				"-XXXXXXX--XX-----XXXXX---",
				"---XX----XXX-----XXXX----",
		        "-XXXXX---XXXXX--XXXXXXXX-" };
		int[] expecteds = { 725,  234,  558 };
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots1() {
		String[] knots = { 
				  "XX---XXXX",
				  "XXX-----X" };
		int[] expecteds = { 24,  31 };
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots2() {
		String[] knots = { 
				  "-XXX---XX----X",
				  "--X----X-XXXXX",
				  "-XX--XXXX---XX" };
		int[] expecteds = { 321,  115,  242 };
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots3() {
		String[] knots = { 
				  "-------X--------",
				  "--XXX----XXXX---",
				  "--------------XX" };
		int[] expecteds = { 100,  3040,  2 };
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots4() {
		String[] knots = { 
				  "--XXX-XXXXXXXX----------XXXXXXXXX--XXXXXXXX-",
				  "--XX----XXXX-----XXXXXX---XXX------XXXXXXXX-",
				  "--------------------X----XXXXXXXX--XXXXXXXX-",
				  "--XX-------X------XXXX----XXX-------XXXXXX--",
				  "--XXX---XXXXX-------X------XX--------X------",
				  "-XXXX--XXXXXXX-----------XXXXXXX----XXXXX---",
				  "-----------X---XXXXXXXX----XX--------XXX----",
				  "-----------X---XXXXXXXX----X----------------",
				  "---X--XXXXXXXX--XXXXXXX---XXX---------------",
				  "--XX---XXXXXXX--XXXXXXX----XX-------XXXXX---" };
		int[] expecteds = { 38098,  24638,  188,  21436,  35121,  47075,  1823,  1810,  18730,  27725 };
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots5() {
		String[] knots = {"X","-"};
		int[] expecteds = { 1,  0 };
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testReadKnots6() {
		String[] knots = { 
				  "XXXX------------",
				  "----XXXXXXXXX---",
				  "-------------XXX" };
		int[] expecteds = { 400,  90,  3 };
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots7() {
		String[] knots = { 
				"-XXX------------",
				"----XXXXXXXXX---",
				"--X----------XXX" };
		int[] expecteds = { 300,  90,  103 };
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots8() {
		String[] knots = {"-XXXXXXX--XX-----XXXXX---", "---XX----XXX-----XXXX----", "-XXXXX---XXXXX--XXXXXXXX-"};
		int[] expecteds = {725, 234, 558};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots9() {
		String[] knots = {"XX---XXXX", "XXX-----X"};
		int[] expecteds = {24, 31};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots10() {
		String[] knots = {"-------X--------", "--XXX----XXXX---", "--------------XX"};
		int[] expecteds = {100, 3040, 2};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots11() {
		String[] knots = {"XXXXXXXXX-XXXXXXXXX-XXXXXXXXX-XXXXXXXXX-XXXXXXXX-X", "XXXXXXXX---XXXXXXXX-XXXXXXXX---XXXXXXXX--XXXXXXX--", "------------XXX---------X-------XXXXXXX--XXXXXXX--", "-----XXX--XXXXXXXXX-----XXXX----XXX---------XXX--X"};
		int[] expecteds = {999981, 888870, 31770, 394331};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots12() {
		String[] knots = {"XXXXXXXXX-XXXXXXXXX-XXXXXXXXX-XXXXXXXXX-XXXXXXXX-X", "XXXXXXXX---XXXXXXXX-XXXXXXXX---XXXXXXXX--XXXXXXX--", "------------XXX---------X-------XXXXXXX--XXXXXXX--", "-----XXX--XXXXXXXXX-----XXXX----XXX---------XXX--X"};
		int[] expecteds = {999981, 888870, 31770, 394331};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots13() {
		String[] knots = {"-X-X-X-X-", "XX----XXX"};
		int[] expecteds = {1111, 2003};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots14() {
		String[] knots = {"--XX--------XXXXXX---X-----XX--------", "--XXXXXXXX--XXXX-----XX----XXXXXXXXX-", "--XXXXXXXX-----------XXX---XXXXXXXXX-", "--XXXXX-----XXXXXXXX-XXX---XX--------", "--XXXXXXXXX-XXX------XXXXX-XXXXXXXXX-"};
		int[] expecteds = {2612, 8429, 8039, 5832, 9359};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots15() {
		String[] knots = {"-XXXXXXXXX-XX-------------XXXXXXX---", "-XXXXXX----XXXXXX---XXXX--XXX-------", "-XXXX------XXX------XXX---XXXX------", "-XXXXXXX------------X---------------", "-X---------XXXXX----XXXXX-XXXXXXXX--"};
		int[] expecteds = {9207, 6643, 4334, 7010, 1558};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots16() {
		String[] knots = {"-XXX-------XXXX------XXXXXXXX---XX-----", "-X-------------------XX---------X------", "-----------XXXXX-----XXX--------XXXXXX-", "-XX--------XXXXXXXXX-XX---------XXXX---", "-XXXXXXXX--XXXXXX----XXXXXX------------", "-X---------XXX-------XXXXXXXX---X------", "-XXX-----------------XX---------X------", "-XXXX------X---------X----------X------"};
		int[] expecteds = {3482, 1021, 536, 2924, 8660, 1381, 3021, 4111};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots17() {
		String[] knots = {"-XXXXX------XXXXXXX---XXXXXXX------XXX---", "-XX---------XXXXX--------XX---------X----", "-XXXX-------XXX------------------XXXXXXX-", "-XXX---------X--------XXXXXX-------------", "-XXXXXXXX--XXXXXXXXX----------------XX---", "-XXXXXX----XXXXXXXXX----------------X----", "-XXXXXX------X----------XXXX-------------", "-XXXXXX-----XXXXX-----XXXXXXXX-XXXXXXXXX-"};
		int[] expecteds = {5773, 2521, 4307, 3160, 8902, 6901, 6140, 6589};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots18() {
		String[] knots = {"---XXX---XXXXXXX----XXXXXXXXX-XXXXXXXXX----XXXX---", "-----------XX------------X----XXXXXXXX---XXXXXXX--", "----X-----XXXX---------XXXXXX---XXXXXX------X-----", "-----------XX------------XX------XXXX-------XX----", "--XXXX-----------------XXXXX----XXXXXX------XX----", "----XX-----XXX--------XXXXXXX---------------X-----", "----X----XXXXX------XXXXXXXXX---XXXXX----XXXXXXXX-", "----XX---XXXXXXXXX-------X-------XXXX-----XXXXX---", "----XX-----XX---------XXXXXXX----XX---------XX----", "---------XXXXXX---------------XXXXXXXX---XXXXXX---"};
		int[] expecteds = {37994, 2187, 14661, 2242, 40562, 23701, 15958, 29145, 22722, 6086};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots19() {
		String[] knots = {"---XXX---XXXXXXX----XXXXXXXXX-XXXXXXXXX----XXXX---", "-----------XX------------X----XXXXXXXX---XXXXXXX--", "----X-----XXXX---------XXXXXX---XXXXXX------X-----", "-----------XX------------XX------XXXX-------XX----", "--XXXX-----------------XXXXX----XXXXXX------XX----", "----XX-----XXX--------XXXXXXX---------------X-----", "----X----XXXXX------XXXXXXXXX---XXXXX----XXXXXXXX-", "----XX---XXXXXXXXX-------X-------XXXX-----XXXXX---", "----XX-----XX---------XXXXXXX----XX---------XX----", "---------XXXXXX---------------XXXXXXXX---XXXXXX---"};
		int[] expecteds = {37994, 2187, 14661, 2242, 40562, 23701, 15958, 29145, 22722, 6086};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots20() {
		String[] knots = {"--XXX-----XXXX----XXXXXXXX--------XXX-----------", "---X--------XX----XXXXXX----------XXXX--XXXXXXX-", "---------XXXXXXXX-------------XXXXXXXXX----X----", "---X--------X------XXXX--------XXXXXXXX--XXXXX--", "---X--------XX------XX---------XXXXXXXX---XXXX--", "--XXX----XXXXX-----XXXXX----------XXXX----------", "---------XXXXX----XXXXXX----------X-------------", "--XXX-------XX----XXXXXXX------------------XXX--", "-XXXX---------------X-------------XXX------XXX--", "---X-----XXXXXXXX-XXXXXXXXX----XXXXXXX-----XXX--"};
		int[] expecteds = {34830, 12647, 8091, 11485, 12284, 35540, 5610, 32703, 40133, 18973};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots21() {
		String[] knots = {"--XXX-XXXXXXXX----------XXXXXXXXX--XXXXXXXX-", "--XX----XXXX-----XXXXXX---XXX------XXXXXXXX-", "--------------------X----XXXXXXXX--XXXXXXXX-", "--XX-------X------XXXX----XXX-------XXXXXX--", "--XXX---XXXXX-------X------XX--------X------", "-XXXX--XXXXXXX-----------XXXXXXX----XXXXX---", "-----------X---XXXXXXXX----XX--------XXX----", "-----------X---XXXXXXXX----X----------------", "---X--XXXXXXXX--XXXXXXX---XXX---------------", "--XX---XXXXXXX--XXXXXXX----XX-------XXXXX---"};
		int[] expecteds = {38098, 24638, 188, 21436, 35121, 47075, 1823, 1810, 18730, 27725};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots22() {
		String[] knots = {"--XXX--XXXXXXX------------XXX-------", "--XXX---XX-----XXXXXX-----XXXX-XXX--", "-------XXXXXXXX-XXXXX--XXXXXXX-XXXX-", "--XX----XXXX---XXXXXX------XX--XXX--"};
		int[] expecteds = {37030, 32643, 8574, 24623};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots23() {
		String[] knots = {"----XXXX-XXXXXXXX----XX-----XXX--XXXXXX---", "----XXXX--XXXXXXX-XXXXXXX----XX-----------", "-----X----XXXXXXX-XXXXXXX---XXX--XXXXXX---", "----XXXX------XX-XXXXXXXX-XXXXXXX-XXXXX---"};
		int[] expecteds = {48236, 47720, 17736, 42875};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots24() {
		String[] knots = {"--XXXX---XXX----XXXXXXXXX--XXXX-----XXXX----", "--XXXX--XXXX--------------XXXXXXX-XXXXXXXX--", "XXXXXX-XXXXXXXX-XXXXXXXXX-XXXXX--XXXXXXXXX--", "--XXXX--XXXXX----XXXXXX---XXXXXXX--XXXXXX---"};
		int[] expecteds = {43944, 44078, 68959, 45676};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots25() {
		String[] knots = {"XXX----X----XXXX-------XX------XXXXXXXXX", "X-----XXXX---XXX---XXXXXXXXX------X-----", "XXX----X--XXXXXXXXX---XXX--------XXXXXX-", "XXX---XXX-XXXXXXXX----------------XXXX--"};
		int[] expecteds = {31429, 14391, 31936, 33804};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots26() {
		String[] knots = {"-----XX-XXX---------XXX-------XXX---XXXX------", "------X-XXXXX-------XXX-----------------------", "------X-XXXXX----XXXXXXXXX----XXX-XXXXXXXXX---", "---XXXX-XXX------XXXXXXXXX-XX-XXXX--XXXXXXX---"};
		int[] expecteds = {233034, 153000, 159039, 439247};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots27() {
		String[] knots = {"------------XXXXXXX----------XXXXX-", "-X---XXXXXXX--XXX---XXXXXX-XXXXXXXX", "-XX-XXXXXXXX--------XXXX-----XXXX--", "-XXX--XXXXXX-XXXXX---X-------XXX---"};
		int[] expecteds = {705, 17368, 28044, 36513};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots28() {
		String[] knots = {"XX----XXXXXXXXX-XXXXX--XXXXXXXXX----XXXXXXXXX-", "XX-------XXXX--XXXXXXXX-----XX-------XXXXXXX--", "XX-------X--------------XXXXXXXX---------XX---", "-------XXXXXXX------------XXXXXX----XXXXXXXXX-"};
		int[] expecteds = {29599, 24827, 21082, 7069};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots29() {
		String[] knots = {"X", "-"};
		int[] expecteds = {1, 0};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots30() {
		String[] knots = {"-XXX---XX----X", "--X----X-XXXXX", "-XX--XXXX---XX", "--------------"};
		int[] expecteds = {321, 115, 242, 0};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots31() {
		String[] knots = {"X-------------------------------------------------", "-XXXXXX-XXXXXX-XXXXXXX-XXXXXX-XXXXXXXXX-XXXXXXXXX-", "-XXX-------XXX---XX-----X----------XXX----XXXXX---", "-XXXXX---XXXXX--XXX-----XXX--------XX-----XXX-----", "------------------------XXXX---------------XX-----", "--X---------X----X------X----------X-------X------"};
		int[] expecteds = {1000000, 667699, 332135, 553323, 402, 111111};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots32() {
		String[] knots = {"X-----", "-X----", "--X---", "---X--", "----X-", "-----X"};
		int[] expecteds = {100000, 10000, 1000, 100, 10, 1};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots33() {
		String[] knots = {"X--", "XX-", "X-X"};
		int[] expecteds = {10, 20, 11};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testReadKnots34() {
		String[] knots = {"X-", "-X"};
		int[] expecteds = {10, 1};
		int[] actuals = sut.readKnots(knots);
		assertArrayEquals(expecteds, actuals);
	}
}
