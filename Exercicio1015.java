package javabasico;

import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.sqrt;

/**
 * Distância Entre Dois Pontos
 * 
 * Leia os quatro valores correspondentes aos eixos x e y de dois pontos
 * quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles,
 * mostrando 4 casas decimais após a vírgula, segundo a fórmula:
 * 
 * Distancia = raiz quadrada:(x2 = x1)²+(y2-y1)²
 * 
 * Entrada O arquivo de entrada contém duas linhas de dados. A primeira linha
 * contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois
 * valores de ponto flutuante x2 y2.
 * 
 * Saída Calcule e imprima o valor da distância segundo a fórmula fornecida, com
 * 4 casas após o ponto decimal.
 * 
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Exercicio1015 {

	public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);

		double x1 = leitor.nextDouble();
		double y1 = leitor.nextDouble();
		double x2 = leitor.nextDouble();
		double y2 = leitor.nextDouble();
		double content = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
		double distance = sqrt(content);
		System.out.printf("%.4f\n", distance);

	}

}