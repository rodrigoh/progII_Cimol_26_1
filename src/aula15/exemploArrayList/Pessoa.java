package aula15.exemploArrayList;

import java.util.Objects;

public class Pessoa {
  private String nome;
  private String sobrenome;
  private int idade;
  private static int contPessoa;

  public Pessoa(String nome, String sobrenome, int idade){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.idade = idade;
    contPessoa++;
  }

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

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public static int getContPessoa(){
    return contPessoa;
  }

  @Override
  public boolean equals(Object o){
    Pessoa p = (Pessoa) o;
    return this.nome.equals(p.getNome()) && this.sobrenome.equals(p.getSobrenome()) && this.idade == p.getIdade();
  }

  @Override
  public String toString(){
    return "Nome: "+nome+" "+sobrenome+" tem: "+idade+" anos";
  }


}
