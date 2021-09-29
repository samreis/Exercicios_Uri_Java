package javabasico;

import java.io.IOException;
import java.util.Scanner;

/**
 * Diferença
 * 
 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
 * diferença do produto de A e B pelo produto de C e D segundo a fórmula:
 * DIFERENCA = (A * B - C * D).
 * 
 * Entrada O arquivo de entrada contém 4 valores inteiros.
 * 
 * Saída Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme
 * exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Exercicio1007 {

	public static void main(String[] args) throws IOException {

		int A = 0, B = 0, C= 0, D = 0, diferenca; 
		
		Scanner leitor = new Scanner(System.in);
		
		A = leitor.nextInt();
		B = leitor.nextInt();
		C = leitor.nextInt();
		D = leitor.nextInt();
		
		diferenca = (A * B - C *D);
		
		System.out.printf("DIFERENCA = %d\n", diferenca);
		

	}

}