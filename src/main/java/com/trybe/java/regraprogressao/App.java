package com.trybe.java.regraprogressao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * App.
 */
public class App {
  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int quantidade = 0;
    List<Atividade> atividades = new ArrayList<Atividade>();

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    quantidade = Integer.parseInt(scanner.nextLine());

    for (int i = 1; i <= quantidade; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String nome = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");
      int peso = Integer.parseInt(scanner.nextLine());
      System.out.println("Digite a nota obtida para "  + nome + ":");
      int nota = Integer.parseInt(scanner.nextLine());
      Atividade atividade = new Atividade(nome, peso, nota);
      atividades.add(atividade);
    }
    scanner.close();

    int somaPesos = 0;

    for (Atividade atividade : atividades) {
      somaPesos += atividade.getPeso();
    }

    if (somaPesos != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
      return;
    }

    avaliar(atividades);
  }

  private static void avaliar(List<Atividade> atividades) {
    int notaPonderada = 0;
    for (Atividade atividade : atividades) {
      notaPonderada += atividade.getNotaPonderada();
    }
    notaPonderada /= 100;

    if (notaPonderada < 85) {
      System.out.println("Lamentamos informar que, com base na sua pontuação alcançada "
          + "neste período, " + notaPonderada + ".0%, você não atingiu a pontuação mínima "
          + "necessária para sua aprovação.\n");
    } else {
      System.out.println("Parabéns! Você alcançou " + notaPonderada + ".0%! E temos "
          + "o prazer de informar que você obteve aprovação! ");
    }
  }
}