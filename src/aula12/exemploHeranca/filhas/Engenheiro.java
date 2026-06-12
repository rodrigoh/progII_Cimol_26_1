package aula12.exemploHeranca.filhas;

import aula12.exemploHeranca.Colaborador;

public class Engenheiro extends Colaborador {
  private String crea;

  public Engenheiro(String nome, String matricula) {
    super(nome, matricula);
  }

  public String getCrea() {
    return crea;
  }

  public void setCrea(String crea) {
    this.crea = crea;
  }
}
