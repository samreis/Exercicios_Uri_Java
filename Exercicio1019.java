package javabasico;

import java.io.IOException;
import java.util.Scanner;

/**
 * Conversão de Tempo
 * 
 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado
 * evento em uma fábrica, e informe-o expresso no formato
 * horas:minutos:segundos.
 * 
 * Entrada O arquivo de entrada contém um valor inteiro N.
 * 
 * Saída Imprima o tempo lido no arquivo de entrada (segundos), convertido para
 * horas:minutos:segundos, conforme exemplo fornecido.
 * 
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Exercicio1019 {

	public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);

		int tempoSegundos = leitor.nextInt();

		int horas = tempoSegundos / 3600;
		tempoSegundos -= horas * 3600;
		int minutos = tempoSegundos / 60;
		tempoSegundos = tempoSegundos - minutos * 60;
		int segundos = tempoSegundos;

		System.out.println(horas + ":" + minutos + ":" + segundos);

	}

}