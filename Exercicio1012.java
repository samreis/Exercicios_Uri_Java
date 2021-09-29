package javabasico;

import java.io.IOException;
import java.util.Scanner;

/**
 * Área
 * 
 * Escreva um programa que leia três valores com ponto flutuante de dupla
 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
 * e B. Entrada O arquivo de entrada contém três valores com um dígito após o
 * ponto decimal.
 * 
 * Saída O arquivo de saída deverá conter 5 linhas de dados. Cada linha
 * corresponde a uma das áreas descritas acima, sempre com mensagem
 * correspondente e um espaço entre os dois pontos e o valor. O valor calculado
 * deve ser apresentado com 3 dígitos após o ponto decimal.
 * 
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Exercicio1012 {

	public static void main(String[] args) throws IOException {

		double A = 0, B = 0, C = 0;
		double triangulo, circulo, trapezio, quadrado, retangulo, raio;

		Scanner leitor = new Scanner(System.in);

		A = leitor.nextDouble();
		B = leitor.nextDouble();
		C = leitor.nextDouble();

		triangulo = (A * C) / 2;
		circulo = raio = 3.14159 * (C * C);
		trapezio = (A + B) / 2 * C;
		quadrado = (B * B);
		retangulo = (A * B);

		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", raio);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);
	}

}