package com.cleiver.aula.java;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int diaDaSemana = scan.nextInt();
		scan.close();

		switch(diaDaSemana) {
		case 1:
			System.out.println("Hoje é Domingo");
			break;
		case 2:
			System.out.println("Hoje é Segunda");
			break;
		case 3:
			System.out.println("Hoje é Terca");
			break;
		case 4:
			System.out.println("Hoje é Quarta");
			break;
		case 5:
			System.out.println("Hoje é Quinta");
			break;
		case 6:
			System.out.println("Hoje é Sexta");
			break;
		case 7:
			System.out.println("Hoje é Sabado");
			break;
		default: 
			System.out.println("nao é um dia valido");

		}
	}

}
