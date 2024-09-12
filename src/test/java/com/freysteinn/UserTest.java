package com.freysteinn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
	
	private User user;

	@BeforeEach
	void setUp() throws Exception {
		user = new User();
	}

	@Test
	void testNameLength() {
		// The user has to have a name
		user.setName("123456789012345678901"); // 21 letters
		//assertEqual(20, user.getName());
		
	}

	private void assertEqual(int i, Object name) {
		// TODO Auto-generated method stub
		
	}

}
