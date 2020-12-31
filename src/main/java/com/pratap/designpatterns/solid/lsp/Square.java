package com.pratap.designpatterns.solid.lsp;
/**
 * Square - all sides remains same
 * @author Pratap Narayan
 *
 */
public class Square implements Shape {

	private int side;
	
	public Square(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int computeArea() {
		return side * side;
	}

}
