package com.java.example3;

public class  EvenOddMain {

	public static void main(String[] args) {
		EvenThread et = new EvenThread();
		OddThread ot = new OddThread();
		et.start();
		ot.start();
	}

}