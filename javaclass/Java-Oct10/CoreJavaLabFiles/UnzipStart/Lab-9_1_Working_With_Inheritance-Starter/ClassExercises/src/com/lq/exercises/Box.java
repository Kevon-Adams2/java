package com.lq.exercises;

public class Box {

	public Box(double side) {
		this(side, side, side);
	}

	public Box(double length, double width, double height) {
		setLength(length > 0 ? length : 1);
		setWidth(width > 0 ? width : 1 );
		setHeight(height > 0 ? width : 1);
	}

	public double getVolume() {
		return getHeight() * getWidth() * getLength();
	}
	
	public double getSurfaceArea() {
		return 2 * ((getHeight() * getWidth()) + (getWidth() * getLength()) + (getHeight() * getLength()));
	}
	

	public void printBox() {
		if (getHeight() <= 0 || getLength() <= 0 || getWidth() <= 0) {
			System.out.printf("Box(%f, %f, %f) contains invalid properties.%n", getLength(), getWidth(), getHeight());
		}
		else {
			System.out.println("Length = " + getLength());
			System.out.println("Width = " + getWidth());
			System.out.println("Height = " + getHeight());
			System.out.println("Volume = " + getVolume());
			System.out.println("Surface Area = " + getSurfaceArea());
		}
	}

	private double height, width, length;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height <= 0) {
			System.out.printf("Height (%f) must be a positive number.%n", height);
			return;
		}
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width <= 0) {
			System.out.printf("Width (%f) must be a positive number.%n", width);
			return;
		}
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if (length <= 0) {
			System.out.printf("Length (%f) must be a positive number.%n", length);
			return;
		}
		this.length = length;
	}
	
}
