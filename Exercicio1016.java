package javabasico;

import java.io.IOException;
import java.util.Scanner;

/**
 * Distância
 * 
 * Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade
 * constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.
 * 
 * Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do
 * carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.
 * 
 * Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o
 * carro Y tomar essa distância do outro carro.
 * 
 * Entrada O arquivo de entrada contém um número inteiro.
 * 
 * Saída Imprima o tempo necessário seguido da mensagem "minutos".
 * 
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Exercicio1016 {  

	public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);

		int km = leitor.nextInt();

		int minutos = (60 * km) / 30;

		System.out.printf("%d minutos\n", minutos);

	}

}