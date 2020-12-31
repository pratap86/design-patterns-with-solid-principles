package com.pratap.designpatterns.solid.lsp;

/**
 * Liskov Substitution Principle LSP
 * Rectangle - one side is longer than other either height or width
 * @author Pratap Narayan
 *
 */
public class Rectangle implements Shape {

	private int height;
	private int width;

	public Rectangle(int hieght, int width) {
		this.height = hieght;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int hieght) {
		this.height = hieght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int computeArea() {
		return height * width;
	}
}
