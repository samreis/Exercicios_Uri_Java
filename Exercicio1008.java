package javabasico;

import java.io.IOException;
import java.util.Scanner;

/**
 * Salário
 * 
 * Escreva um programa que leia o número de um funcionário, seu número de horas
 * trabalhadas, o valor que recebe por hora e calcula o salário desse
 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
 * casas decimais.
 * 
 * Entrada O arquivo de entrada contém 2 números inteiros e 1 número com duas
 * casas decimais, representando o número, quantidade de horas trabalhadas e o
 * valor que o funcionário recebe por hora trabalhada, respectivamente.
 * 
 * Saída Imprima o número e o salário do funcionário, conforme exemplo
 * fornecido, com um espaço em branco antes e depois da igualdade. No caso do
 * salário, também deve haver um espaço em branco após o $. IMPORTANT: O nome da
 * classe deve ser "Main" para que a sua solução execute Class name must be
 * "Main" for your solution to execute El nombre de la clase debe ser "Main"
 * para que su solución ejecutar
 */
public class Exercicio1008 {

	public static void main(String[] args) throws IOException {

		int numeroFuncionario, horasTrabalhadas;
		double valorPorHora, salario;

		Scanner leitor = new Scanner(System.in);

		numeroFuncionario = leitor.nextInt();
		horasTrabalhadas = leitor.nextInt();
		valorPorHora = leitor.nextDouble();

		salario = horasTrabalhadas * valorPorHora;

		System.out.printf("NUMBER = %d\n", numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f\n", salario);

	}

}