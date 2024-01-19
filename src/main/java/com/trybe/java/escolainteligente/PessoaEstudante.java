package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class PessoaEstudante {

  /**
   * Método calcularIdadeEmDias.
   */
  public static int calcularIdadeEmDias(int anos, int meses, int dias) {
    return (anos * 365) + (meses * 30) + dias;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    System.out.println("Qual o nome da Pessoa Estudante?");
    Scanner scanData = new Scanner(System.in);
    String nome = scanData.nextLine();

    System.out.println("Qual a sua idade em anos, meses e dias?");
    System.out.print("anos: ");
    int anos = scanData.nextInt();

    System.out.print("meses: ");
    int meses = scanData.nextInt();

    System.out.print("dias: ");
    int dias = scanData.nextInt();

    int idade = calcularIdadeEmDias(anos, meses, dias);
    System.out.println("A idade de " + nome + " em dias é " + idade + ".");

    scanData.close();
  }
}