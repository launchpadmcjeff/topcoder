package io.foo.a;

import static org.junit.Assert.*;
import io.foo.a.GrafixCorrupt;

import org.junit.Before;
import org.junit.Test;

public class GrafixCorruptTest {

	private GrafixCorrupt sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new GrafixCorrupt();
	}

	@Test
	public void testSelectWord0() {
		String[] dictionary = {"cat", "cab", "lab"};
		String candidate = "dab";
		int expected = 1;
		int actual = sut.selectWord(dictionary, candidate);
		assertEquals(expected, actual);
	}
	@Test
	public void testSelectWord1() {
		String[] dictionary = {"cat", "cab", "lab"};
		String candidate = "lag";
		int expected = 2;
		int actual = sut.selectWord(dictionary, candidate);
		assertEquals(expected, actual);
	}
	@Test
	public void testSelectWord2() {
		String[] dictionary = {"cat", "cab", "lab"};
		String candidate = "bic";
		int expected = -1;
		int actual = sut.selectWord(dictionary, candidate);
		assertEquals(expected, actual);
	}
	@Test
	public void testSelectWord3() {
		String[] dictionary = {"zkv", "izs", "fed", "waa", "ttx", "bgt", "quy", "dtq", "dgo", "yrs",
				 "cid", "nln", "pvz", "txt", "zun", "erd", "jen", "klh", "kxy", "emf",
				 "mqt", "lza", "dzb", "ndx", "vfr", "jhs", "dkm", "elb"};
		String candidate = "cwd";
		int expected = 10;
		int actual = sut.selectWord(dictionary, candidate);
		assertEquals(expected, actual);
	}
	@Test
	public void testSelectWord4() {
		String[] dictionary = {"zhadjsg", "vzptftx", "fbaslxs", "ejejncm", "xpxkeae", "ixrrtzw",
				 "ovctbzx", "sfzekhh", "lxzixjk", "jixdpik", "bkianck", "laclyin",
				 "uqmdkfx", "dimswqo", "fojhetr", "grntrce", "obdtqwx", "bhojwcy",
				 "zuuuvst", "mvqtoly", "aftmupx", "govuidx", "qklpret", "yptccki",
				 "uxdnslh", "wudrusz", "uwxbvou", "ouytqun", "pjdexqe", "xraaqdw",
				 "lxmoncl", "sjnjfgb", "qrlqgvc", "fgvoadm", "yohsrxw", "udpvrsr",
				 "mklucgt"};
		String candidate = "vklikgf";
		int expected = 36;
		int actual = sut.selectWord(dictionary, candidate);
		assertEquals(expected, actual);
	}

}
