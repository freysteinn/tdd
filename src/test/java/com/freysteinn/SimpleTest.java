package com.freysteinn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleTest {

	@Test
	void sum() {
		int sum = 2 + 3;
        assertEquals(5, sum);
    }
	
	@Test
	void sum2() {
		int sum = 12 + 1;
        assertEquals(13, sum);
    }
}
