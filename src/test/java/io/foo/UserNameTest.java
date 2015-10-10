package io.foo;

import static org.junit.Assert.*;
import io.foo.UserName;

import org.junit.Before;
import org.junit.Test;


public class UserNameTest {
/*
	0)	
   	
	{"MasterOfDisaster", "DingBat", "Orpheus", "WolfMan", "MrKnowItAll"}
	"TygerTyger"
	Returns: "TygerTyger"
	"TygerTyger" is available.
	1)	
	   	
	{"MasterOfDisaster", "TygerTyger1", "DingBat", "Orpheus", 
	"TygerTyger", "WolfMan", "MrKnowItAll"}
	"TygerTyger"
	Returns: "TygerTyger2"
	"TygerTyger" and "TygerTyger1" are taken.
	2)	
	   	
	{"TygerTyger2000", "TygerTyger1", "MasterDisaster", "DingBat", 
	"Orpheus", "WolfMan", "MrKnowItAll"}
	"TygerTyger"
	Returns: "TygerTyger"
	There are higher-numbered variants of "TygerTyger", but the base name is available.
	3)	
	   	
	{"grokster2", "BrownEyedBoy", "Yoop", "BlueEyedGirl", 
	"grokster", "Elemental", "NightShade", "Grokster1"}
	"grokster"
	Returns: "grokster1"
	Note that "Grokster1" is not the same as "grokster1".
	4)	
	   	
	{"Bart4", "Bart5", "Bart6", "Bart7", "Bart8", "Bart9", "Bart10",
	"Lisa", "Marge", "Homer", "Bart", "Bart1", "Bart2", "Bart3",
	"Bart11", "Bart12"}
	"Bart"
	Returns: "Bart13"
		*/
	
	private UserName sut;
	
	@Before
	public void setup() {
		sut = new UserName();
	}
	@Test
	public void testNewMember0() {
		String result = sut.newMember(new String[] {"MasterOfDisaster", "DingBat", "Orpheus", "WolfMan", "MrKnowItAll"}, "TygerTyger");
		assertEquals("TygerTyger", result);
	}
	@Test
	public void testNewMember1() {
		String result = sut.newMember(new String[] {"MasterOfDisaster", "TygerTyger1", "DingBat", "Orpheus", 
			"TygerTyger", "WolfMan", "MrKnowItAll"}, "TygerTyger");
		assertEquals("TygerTyger2", result);
	}
	@Test
	public void testNewMember2() {
		String result = sut.newMember(new String[] { "TygerTyger2000",
				"TygerTyger1", "MasterDisaster", "DingBat", "Orpheus",
				"WolfMan", "MrKnowItAll" }, "TygerTyger");
		assertEquals("TygerTyger", result);
	}
	@Test
	public void testNewMember3() {
		String result = sut.newMember(new String[] {"grokster2", "BrownEyedBoy", "Yoop", "BlueEyedGirl", 
				"grokster", "Elemental", "NightShade", "Grokster1"}, "grokster");
		assertEquals("grokster1", result);
	}
	@Test
	public void testNewMember4() {
		String result = sut.newMember(new String[] {"Bart4", "Bart5", "Bart6", "Bart7", "Bart8", "Bart9", "Bart10",
				"Lisa", "Marge", "Homer", "Bart", "Bart1", "Bart2", "Bart3",
				"Bart11", "Bart12"}, "Bart");
		assertEquals("Bart13", result);
	}

}
