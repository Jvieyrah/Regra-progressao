package com.trybe.java.regraprogressao;

/**
 * Metodo ATIVIDADE.
 */
public class Atividade {
  private final String nome;
  private final int peso;
  private final int nota;

  /**
   * Metodo CONST.
   */
  public Atividade(String nome, int peso, int nota) {
    this.nome = nome;
    this.peso = peso;
    this.nota = nota;
  }

  public String getNome() {
    return this.nome;
  }

  public int getPeso() {
    return this.peso;
  }

  public int getNota() {
    return this.nota;
  }

  public int getNotaPonderada() {
    return this.nota * this.peso;
  }
}
