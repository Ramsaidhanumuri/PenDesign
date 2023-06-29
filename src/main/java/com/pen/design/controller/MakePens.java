package com.pen.design.controller;

import com.pen.design.entity.BallPen;

public class MakePens {
	
	public static void main(String[] args) {
		BallPen ballPen = new BallPen("Celio", "Pin Point", "Blue", 10.26, .05);
		System.out.println(ballPen.toString());
		ballPen.write("Hello I'm BallPen");
		ballPen.takeCapOff();
		ballPen.write("Hello I'm BallPen");
		ballPen.putCapOn();
		ballPen.isRefill();
		ballPen.toRefillThePen();
	}
}
