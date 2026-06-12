package aula12.exemploAcesso.model;

public class Pessoa {
  public String nome;
  protected String sobrenome;
  int idade;
  private String cpf;

  public String getCpf(){
    return cpf;
  }

  public void setCpf(String cpf){
    //Implementar a validação
    this.cpf = cpf;
  }
}
