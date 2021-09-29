package javabasico;

import java.io.IOException;
import java.util.Scanner;

/**
 * Produto Simples
 * 
 * Leia dois valores inteiros. A seguir, calcule o produto entre estes dois
 * valores e atribua esta operação à variável PROD. A seguir mostre a variável
 * PROD com mensagem correspondente.
 * 
 * Entrada O arquivo de entrada contém 2 valores inteiros.
 * 
 * Saída Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo,
 * com um espaço em branco antes e depois da igualdade. Não esqueça de imprimir
 * o fim de linha após o produto, caso contrário seu programa apresentará a
 * mensagem: “Presentation Error”.
 * 
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Exercicio1004 {

	public static void main(String[] args) throws IOException {

		int valor1 = 0, valor2 = 0, PROD;

		Scanner leitor = new Scanner(System.in);

		valor1 = leitor.nextInt();
		valor2 = leitor.nextInt();

		PROD = valor1 * valor2;

		System.out.printf("PROD = %d\n", PROD);

	}

}