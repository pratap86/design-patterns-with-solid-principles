package com.pratap.designpatterns.behaviour.iterator;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class IteratorTest {

	@Test
	void testHasNext() {
		
		Iterator<ThemeColor> iterator = ThemeColor.getIterator();
		assertTrue(iterator.hasNext());
		
	}
	
	@Test
	void testNext() {
		
		Iterator<ThemeColor> iterator = ThemeColor.getIterator();
		assertAll(() -> {
			while(iterator.hasNext()) {
				assertNotNull(iterator.next());
			}
		});
		
	}

}
