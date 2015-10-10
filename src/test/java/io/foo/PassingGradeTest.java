package io.foo;

import static org.junit.Assert.*;
import io.foo.PassingGrade;

import org.junit.Before;
import org.junit.Test;


public class PassingGradeTest {

	private PassingGrade sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new PassingGrade();
	}

	@Test
	public void testPointsNeeded0() {
		int[] pointsEarned = {55,77,82,60};
		int[] pointsPossible = {100,100,100,100};
		int finalExam = 300;
		int expected = 181;
		int actual = sut.pointsNeeded(pointsEarned, pointsPossible, finalExam);
		assertEquals(expected, actual);
	}
	@Test
	public void testPointsNeeded1() {
		int[] pointsEarned = { 1, 2, 3, 4 };
		int[] pointsPossible = { 2, 3, 4, 5 };
		int finalExam = 7;
		int expected = 4;
		int actual = sut.pointsNeeded(pointsEarned, pointsPossible, finalExam);
		assertEquals(expected, actual);
	}
	@Test
	public void testPointsNeeded2() {
		int[] pointsEarned = { 1, 2, 2, 1 };
		int[] pointsPossible = { 9, 9, 9, 9 };
		int finalExam = 9;
		int expected = -1;
		int actual = sut.pointsNeeded(pointsEarned, pointsPossible, finalExam);
		assertEquals(expected, actual);
	}
	@Test
	public void testPointsNeeded3() {
		int[] pointsEarned = { 7, 8, 7, 6 };
		int[] pointsPossible = { 8, 8, 8, 8 };
		int finalExam = 9;
		int expected = 0;
		int actual = sut.pointsNeeded(pointsEarned, pointsPossible, finalExam);
		assertEquals(expected, actual);
	}
	@Test
	public void testPointsNeeded4() {
		int[] pointsEarned = { 17, 23, 50, 200, 19, 56, 83, 91, 77, 9, 0 };
		int[] pointsPossible = { 20, 30, 50, 250, 20, 70, 100, 100, 100, 10, 10 };
		int finalExam = 400;
		int expected = 129;
		int actual = sut.pointsNeeded(pointsEarned, pointsPossible, finalExam);
		assertEquals(expected, actual);
	}
	@Test
	public void testPointsNeeded5() {
		int[] pointsEarned = {600,600,600,600,600,600,600,600,600,600,
					 600,600,600,600,600,600,600,600,600,600};
		int[] pointsPossible = {1000,1000,1000,1000,1000,1000,1000,1000,
				 1000,1000,1000,1000,1000,1000,1000,1000,
				 1000,1000,1000,901};
		int finalExam = 3000;
		int expected = 2886;
		int actual = sut.pointsNeeded(pointsEarned, pointsPossible, finalExam);
		assertEquals(expected, actual);
	}

}
