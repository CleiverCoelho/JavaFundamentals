package com.cleiver.aula.java;

public class Strings {
	public static void main(String[] args) {		
		String newStr = new String("Meu nome é cleiver");
		System.out.println(newStr);
		System.out.println(newStr.length());
		System.out.println(newStr.charAt(0));
		
		String anotherStr = new String(newStr);

		// compara referencia de memoria => false
		System.out.println(anotherStr == newStr);

		// compara os valores da string => true
		System.out.println(anotherStr.equals(newStr));

		System.out.println(anotherStr.startsWith("M"));
		System.out.println(anotherStr.endsWith("M"));

		System.out.println(anotherStr.endsWith("cleiver"));

		// index do primeiro que aparece
		System.out.println(anotherStr.indexOf("e"));
		// index do segundo que aparece
		int searchStartsFrom = anotherStr.indexOf("e") + 1;
		System.out.println(anotherStr.indexOf("e", searchStartsFrom));
		// metodo replace
		System.out.println(anotherStr.replace('e', 'X'));

		// faixa de string
		System.out.println(anotherStr.substring(0, 10));
		// mas ele nao devolve um array bonitinhoi par aver igual o js
		String[] spitedArr = newStr.split(" ");
		System.out.println(spitedArr);

		System.out.println("Sequencia de palavras separadas por espaço:\n");
		for(String s : spitedArr) {
			System.out.println(s);

		}

		
		
	}
}
