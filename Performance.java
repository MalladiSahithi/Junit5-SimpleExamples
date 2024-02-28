package com.junit.examples;

import java.util.Arrays;

public class Performance {
	public int [] performance(int[] array) {
		for(int i=0;i<=1000000;i++) {
			Arrays.sort(array);
		}
		return array;
	}

}
