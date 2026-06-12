package aula13.exemploFinal.classes;
/*
Como a classe Pessoa é final, ela não pode ter subclasses
 */
public final class Pessoa {
  private String nome;
  private String sobrenome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }
}
