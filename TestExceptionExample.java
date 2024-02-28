package com.junit.examples;



import org.junit.jupiter.api.Test;

class TestExceptionExample {

	@Test
	void test() {
		try {
		SortingArray array=new SortingArray();
		int unsorted[]={3,1,5,4};
		int sortedArray[]=array.sortingArray(unsorted);
		for(int elem:sortedArray) {
			System.out.println(elem);
		}
		}
		catch(NullPointerException e){
			System.out.println("Exception generated");
		}
	}

}
