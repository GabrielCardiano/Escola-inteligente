package com.trybe.java.escolainteligente;

import java.util.Locale;
import java.util.Scanner;

public class Portaria {

  /**
   * Método emitirRelatorio.
   */
  public static void emitirRelatorio(int qtdFundamental1, int qtdFundamental2, int qtdMedio) {
    int totalAlunos = qtdFundamental1 + qtdFundamental2 + qtdMedio;
    Locale.setDefault(Locale.US);

    //    Número percentual de alunos
    double porcFundamental1 = 0d;
    double porcFundamental2 = 0d;
    double porcMedio = 0d;

    if (totalAlunos > 0) {
      porcFundamental1 = ((double) qtdFundamental1 / totalAlunos) * 100;
      porcFundamental2 = ((double) qtdFundamental2 / totalAlunos) * 100;
      porcMedio = ((double) qtdMedio / totalAlunos) * 100;
    }

    System.out.println("----- Quantidade -----");
    System.out.println("Ensino Fundamental I: " + qtdFundamental1);
    System.out.println("Ensino Fundamental II: " + qtdFundamental2);
    System.out.println("Ensino Médio: " + qtdMedio + "\n");

    System.out.println("----- Percentual -----");
    System.out.println("Ensino Fundamental I: " + String.format("%.1f", porcFundamental1) + "%");
    System.out.println("Ensino Fundamental II: " + String.format("%.1f", porcFundamental2) + "%");
    System.out.println("Ensino Médio: " + String.format("%.1f", porcMedio) + "%" + "\n");

    System.out.println("TOTAL: " + totalAlunos);
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);

    int qtdFundamental1 = 0;
    int qtdFundamental2 = 0;
    int qtdMedio = 0;
    boolean loop = true;

    //    Autoriza estudante e coleta info de faixa etária;
    while (loop) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Registrar o acesso de pessoa estudante");
      System.out.println("2 - Finalizar o acesso e emitir o relatório");

      int option = scanner.nextInt();

      if (option == 1) {
        System.out.println("Entre com a idade da pessoa estudante:");
        int idade = scanner.nextInt();

        if (idade <= 10) {
          System.out.println("Pessoa estudante do Ensino Fundamental I, catraca liberada!");
          qtdFundamental1++;
        } else if (idade >= 11 && idade <= 14) {
          System.out.println("Pessoa estudante do Ensino Fundamental II, catraca liberada!");
          qtdFundamental2++;
        } else {
          System.out.println("Pessoa estudante do Ensino Médio, catraca liberada!");
          qtdMedio++;
        }
      } else if (option == 2) {
        loop = false;
      } else {
        System.out.println("Entre com uma opção válida!");
      }
    }

    // Todo: emitir relatório
    emitirRelatorio(qtdFundamental1, qtdFundamental2, qtdMedio);

    scanner.close();
  }
}

