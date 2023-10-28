package com.cleiver.aula.java;

public class Loops {

	public static void main(String[] args) {
		int i = 0;
		int max = 10;
		int secondMax = 20;
		
		while(i < max) {
			System.out.println(i);
			i++;
		}
		
		do {
			System.out.println(i);
			i++;
		
		} while(i < secondMax);
			
		for(int j = 0; j < max; j++) {
			System.out.println("Neasure seu mané: " + j);
		}
	}

}
