package datastructures;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class KListTest {
	@Test(expected = IndexOutOfBoundsException.class)
	public void testKList() {
		KList<Integer> list = new KList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		assertTrue(4 == list.get(4));
		assertTrue(2 == list.get(1));
		assertTrue(3 == list.get(2));

		list.get(6);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testNegative() {
		KList<Integer> list = new KList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.get(-1);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testList() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		assertTrue(4 == list.get(4));
		assertTrue(2 == list.get(1));
		assertTrue(3 == list.get(2));

		list.get(6);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemove() {
		KList<Integer> list = new KList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.remove(3);
		assertTrue(4 == list.size());
		assertTrue(4 == list.get(3));
		assertTrue(4 == list.get(4));
	}
}
