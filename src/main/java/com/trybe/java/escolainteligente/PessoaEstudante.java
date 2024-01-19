package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class PessoaEstudante {

  /**
   * Método calcularIdadeEmDias.
   */
  public static int calcularIdadeEmDias(int anos, int meses, int dias) {
    int idadeEmDias = (anos * 365) + (meses * 60) + dias;
    System.out.println("Sua idade e, dias é: " + idadeEmDias);
    return idadeEmDias;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    System.out.println("Qual o nome da Pessoa Estudante?");
    Scanner scanData = new Scanner(System.in);
    String nome = scanData.next();

    System.out.println("Qual a sua idade em anos, meses e dias?");
    System.out.println("anos:");
    int anos = scanData.nextInt();

    System.out.println("meses:");
    int meses = scanData.nextInt();

    System.out.println("dias:");
    int dias = scanData.nextInt();

    int idade = calcularIdadeEmDias(anos, meses, dias);
    System.out.println("A idade de " + nome + " em dias é " + idade);
  }
}