package aula12.exemploStatic.atributo.exemplo02;

public class Pessoa {
  String nome;
  String mail;
  static int cont;

  Pessoa(String nome, String mail){
    this.nome = nome;
    this.mail = mail;
    cont++;
  }

  String mostraInfo(){
    return "Nome: "+nome+"\nE-mail: "+mail;
  }

  static int pessoasCadastradas(){
    return cont;
  }
}
