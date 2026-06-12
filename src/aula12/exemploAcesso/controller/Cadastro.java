package aula12.exemploAcesso.controller;

import aula12.exemploAcesso.model.Pessoa;

public class Cadastro {
  static void main() {
    Pessoa p1 = new Pessoa();
    p1.nome = "Jonas";
    //Sobrenome não pode ser acessado por ser protegido
    //p1.sobrenome = "Silva";
    //Idade está sem modificador (acesso de pacote)
    //p1.idade = 20;
    //Cpf não pode ser acessado por ser privado
    //p1.cpf = "000.000.000-00";
    p1.setCpf("000.000.000-00");
    IO.println("O cpf do "+p1.nome+" é "+p1.getCpf());
  }
}
