package javabasico;

import java.io.IOException;
import java.util.Scanner;

/**
 * Salário com Bônus
 * 
 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total
 * de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor
 * ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber
 * no final do mês, com duas casas decimais.
 * 
 * Entrada O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2
 * valores de dupla precisão (double) com duas casas decimais, representando o
 * salário fixo do vendedor e montante total das vendas efetuadas por este
 * vendedor, respectivamente.
 * 
 * Saída Imprima o total que o funcionário deverá receber, conforme exemplo
 * fornecido.
 * 
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Exercicio1009 {

	public static void main(String[] args) throws IOException {

		double salario, totalVendas, totalFinal;

		Scanner leitor = new Scanner(System.in);

		String nome = leitor.nextLine();
		salario = leitor.nextDouble();
		totalVendas = leitor.nextDouble();

		totalFinal = salario + (totalVendas * 0.15);

		System.out.printf("TOTAL = R$ %.2f\n", totalFinal);

	}

}