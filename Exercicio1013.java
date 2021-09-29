package javabasico;

import java.io.IOException;
import java.util.Scanner;
import static java.lang.StrictMath.abs;

/**
 * O Maior
 * 
 * Faça um programa que leia três valores e apresente o maior dos três valores
 * lidos seguido da mensagem “eh o maior”. Utilize a fórmula: MaiorAB
 * =(a+b+abs(a-b)/2
 * 
 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um
 * segundo passo, portanto é necessário para chegar no resultado esperado.
 * 
 * Entrada O arquivo de entrada contém três valores inteiros.
 * 
 * Saída Imprima o maior dos três valores seguido por um espaço e a mensagem "eh
 * o maior".
 * 
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Exercicio1013 {

	public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);

		int A = leitor.nextInt();
		int B = leitor.nextInt();
		int C = leitor.nextInt();

		int maiorAB = (A + B + abs(A - B)) / 2;
		int maiorBC = (maiorAB + C + abs(maiorAB - C)) / 2;

		System.out.printf(maiorBC + " eh o maior\n");

	}

}