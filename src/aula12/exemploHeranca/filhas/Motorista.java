package aula12.exemploHeranca.filhas;

import aula12.exemploHeranca.Colaborador;

public class Motorista extends Colaborador {
  private String cnh;

  public Motorista(String nome, String matricula, String cnh){
    super(nome,matricula);
    this.cnh = cnh;
  }

  public String getCnh() {
    return cnh;
  }

  public void setCnh(String cnh) {
    this.cnh = cnh;
  }

  public void aumentarSalario(int percentual){
    salario = salario*(1+percentual/100f);
  }
}
