package com.pratap.designpatterns.solid.lsp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LSPTest {
	
	private static final int HEIGHT = 10;
	private static final int WIDTH = 12;
	private static final int SIDE = 10;
	private Shape shape;

	@Test
	void testRectangle() {
		shape  = new Rectangle(HEIGHT, WIDTH);
		assertNotNull(shape);
		assertEquals(shape.computeArea(), 120);
		
	}
	
	@Test
	void testSquare() {
		shape = new Square(SIDE);
		assertNotNull(shape);
		assertEquals(shape.computeArea(), 100);
	}

}
