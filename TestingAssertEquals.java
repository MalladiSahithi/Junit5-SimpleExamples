package com.junit.examples;

import static org.junit.Assert.assertThrows;
import org.junit.jupiter.api.Test;

class TestingAssertEquals{

	@Test
	void test() {
		SortingArray array=new SortingArray();
		int unsorted[]=null;
		assertThrows(NullPointerException.class,()->array.sortingArray(unsorted));
	}
}
