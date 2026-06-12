package aula12.exemploStatic.atributo.exemplo01;

import java.util.Random;

public class Conta {
  String titular;
  String identificador;
  double saldo;
  //Atributos estáticos são únicos para todas as instâncias
  //Eles existem independente da criação de uma instância
  static String nomeBanco;

  Conta(String titular){
    this.titular = titular;
    geraIdentificador();
  }

  boolean sacar(double valor){
    if(saldo>=valor){
      saldo-=valor;
      return true;
    }
    return false;
  }

  void depositar(double valor){
    saldo+=valor;
  }

  boolean igual(String identificador){
    return this.identificador.equalsIgnoreCase(identificador);
  }

  void geraIdentificador(){
    Random aleatorio = new Random();
    String identificador = "";
    for (int i = 0; i < 4; i++) {
      identificador+=(char)aleatorio.nextInt(65,90);
    }
    identificador+=aleatorio.nextInt(1000,9999);
    this.identificador = identificador;
  }

  String verificaSaldo(){

    String retorno = "Bem vindo ao "+nomeBanco;
    retorno +="\nO saldo atual da conta "+identificador;
    retorno+="\nR$%.2f".formatted(saldo);
    return retorno;
  }
}
