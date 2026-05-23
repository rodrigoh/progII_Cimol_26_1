package aula11.exercios.exeDois;

public class Pessoa {
  //Atributos que representam as características do objeto
  String nome;
  String mail;
  String telefone;
  String endereco;


  //Ações do objeto
  String obterInformacoes(){
    String mensagem = "Nome: "+nome;
    mensagem+="\nE-mail: "+mail;
    mensagem+="\nTelefone: "+telefone;
    mensagem+="\nEndereço: "+endereco;
    return mensagem;
  }

  boolean igual(String nome){
    return this.nome.equalsIgnoreCase(nome);
  }
}
