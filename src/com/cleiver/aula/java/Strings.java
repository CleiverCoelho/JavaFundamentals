package com.cleiver.aula.java;

public class Strings {
	public static void main(String[] args) {		
		String newStr = new String("Meu nome é cleiver");
		System.out.println(newStr);
		System.out.println(newStr.length());
		System.out.println(newStr.charAt(0));
		
		String anotherStr = new String(newStr);
		// copiar uma string para outra
		System.out.println(anotherStr);
		// compara referencia de memoria => false
		System.out.println(anotherStr == newStr);

		// compara os valores da string => true
		System.out.println(anotherStr.equals(newStr));
		
	}
}
