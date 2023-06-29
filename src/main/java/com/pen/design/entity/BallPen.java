package com.pen.design.entity;

public class BallPen extends Pen implements Refill, Cap {

	private boolean isOpen;

	public BallPen(String brand, String name, String color, double price, double nibRadius) {
		super(brand, name, color, price, nibRadius);
		this.isOpen = false;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void putCapOn() {
		// TODO Auto-generated method stub
		if (this.isOpen) {
			isOpen = false;
			System.out.println("Putting cap on the BallPen");
		} else {
			System.out.println("Cap already on the BallPen");
		}

	}

	@Override
	public void takeCapOff() {
		// TODO Auto-generated method stub
		if (this.isOpen) {
			System.out.println("BallPen already opened");
		} else {
			System.out.println("Taking cap off the BallPen");
			isOpen = true;
		}

	}

	@Override
	public void isRefill() {
		// TODO Auto-generated method stub
		System.out.println("BallPen has Refill");

	}

	@Override
	public void toRefillThePen() {
		// TODO Auto-generated method stub
		System.out.println("Refilling the BallPen");

	}

	@Override
	public void write(String text) {
		// TODO Auto-generated method stub
		if (isOpen) {
			System.out.println("BallPen writing " + text);
		} else {
			System.out.println("BallPen closed, Please open");
		}

	}

}
