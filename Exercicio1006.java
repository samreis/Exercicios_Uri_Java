package javabasico;

import java.io.IOException;
import java.util.Scanner;

/**
 * Média 2
 * 
 * Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um
 * aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a
 * nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0
 * até 10.0, sempre com uma casa decimal.
 * 
 * Entrada O arquivo de entrada contém 3 valores com uma casa decimal, de dupla
 * precisão (double).
 * 
 * Saída Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo,
 * com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da
 * igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de
 * linha após o resultado, caso contrário, você receberá "Presentation Error".
 * 
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Exercicio1006 {

	public static void main(String[] args) throws IOException {

		
		double A = 0, B = 0, C = 0, media;
		
		Scanner leitor = new Scanner(System.in);
		
		A = leitor.nextDouble();
		B = leitor.nextDouble();
		C = leitor.nextDouble();
		
		media = ((A * 2) + (B * 3) + (C * 5)) / 10;
		
		System.out.printf("MEDIA = %.1f\n", media);


	}

}