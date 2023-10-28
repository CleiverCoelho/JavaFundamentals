package com.cleiver.aula.java;
import java.util.Scanner;

public class ReadingJava {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double number = 3;
		System.out.println("Digite seu nome completo");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		System.out.println("Digite sua idade");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		System.out.println("numbero com 3.0: // " + number);

		scan.close();
		
	}
}
