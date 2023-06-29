package com.pen.design.entity;

public abstract class Pen {

	private String brand;
	private String name;
	private String color;
	private double price;
	private double nibRadius;

	public Pen(String brand, String name, String color, double price, double nibRadius) {
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.price = price;
		this.nibRadius = nibRadius;
	}

	public abstract void write(String text);

	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", name=" + name + ", color=" + color + ", price=" + price + ", nibRadius="
				+ nibRadius + "]";
	}

}
