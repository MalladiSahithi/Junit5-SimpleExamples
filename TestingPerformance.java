package com.junit.examples;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TestingPerformance {

	@Test
	void test() {
		Performance performance=new Performance();
		int unsorted[]= {6,3,1,9};
		assertTimeout(Duration.ofMillis(100),()-> performance.performance(unsorted));
	}

}
