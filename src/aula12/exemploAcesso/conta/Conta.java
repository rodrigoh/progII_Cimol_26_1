package aula12.exemploAcesso.conta;

import java.util.Random;

public class Conta {
  private String titular;
  private String identificador;
  private double saldo;
  private String senha;

  public Conta(String titular, String senha){
    this.titular = titular;
    this.senha = senha;
    geraIdentificador();
  }

  public void setTitular(String titular){
    if(titular.length()>=2)
      this.titular = titular;
  }

  public String getTitular(){
    return titular;
  }

  public void setSenha(String senha){
    if(senha.length()>=8)
      this.senha = senha;
  }

  public String getIdentificador(){
    return identificador;
  }

  public boolean sacar(double valor){
    if(saldo>=valor){
      saldo-=valor;
      return true;
    }
    return false;
  }

  public void depositar(double valor){
    saldo+=valor;
  }

  public boolean validaAcesso(String identificador, String senha){
    return this.identificador.equalsIgnoreCase(identificador) && this.senha.equals(senha);
  }

  private void geraIdentificador(){
    Random aleatorio = new Random();
    String identificador = "";
    for (int i = 0; i < 4; i++) {
      identificador+=(char)aleatorio.nextInt(65,90);
    }
    identificador+=aleatorio.nextInt(1000,9999);
    this.identificador = identificador;
  }

  public String verificaSaldo(){
    String retorno = "O saldo atual da conta "+identificador;
    retorno+="\nR$%.2f".formatted(saldo);
    return retorno;
  }
}
