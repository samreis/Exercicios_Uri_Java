package javabasico;

import java.io.IOException;
import java.util.Scanner;

/**
 * Cálculo Simples
 * 
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o
 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
 * o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
 * 
 * Entrada O arquivo de entrada contém duas linhas de dados. Em cada linha
 * haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas
 * decimais.
 * 
 * Saída A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
 * lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O
 * valor deverá ser apresentado com 2 casas após o ponto.
 * 
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Exercicio1010 {

	public static void main(String[] args) throws IOException {

		int codigoPec01, numeroPec01, codigoPec02, numeroPec02;
		double valorPec01, valorPec02, total;

		Scanner leitor = new Scanner(System.in);

		codigoPec01 = leitor.nextInt();
		numeroPec01 = leitor.nextInt();
		valorPec01 = leitor.nextDouble();
		codigoPec02 = leitor.nextInt();
		numeroPec02 = leitor.nextInt();
		valorPec02 = leitor.nextDouble();

		total = ((numeroPec01 * valorPec01) + (numeroPec02 * valorPec02));

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

	}

}