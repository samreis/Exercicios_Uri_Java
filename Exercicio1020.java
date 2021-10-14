package javabasico;

import java.util.Scanner;

/**
 * Idade em Dias
 * 
 * Leia um valor inteiro correspondente à idade de uma pessoa em dias e
 * informe-a em anos, meses e dias
 * 
 * Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo
 * mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12
 * meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com
 * objetivo de testar raciocínio matemático simples.
 */

public class Exercicio1020 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int idadeEmDias = leitor.nextInt();

		int anos = idadeEmDias / 365;

		int meses = (idadeEmDias % 365) / 30;

		int dias = (idadeEmDias % 365) % 30;
		
		
		System.out.printf("%d ano(s)%n", anos);
		System.out.printf("%d mes(es)%n", meses);
		System.out.printf("%d dia(s)%n", dias);

		leitor.close();

	}

}
