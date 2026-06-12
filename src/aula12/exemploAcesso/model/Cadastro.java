package aula12.exemploAcesso.model;

public class Cadastro {
  static void main() {
    Pessoa p1 = new Pessoa();
    p1.nome = "Jonas";
    p1.sobrenome = "Silva";
    p1.idade = 20;
    //Cpf não pode ser acessado por ser privado
    //p1.cpf = "000.000.000-00";

    String nome = "Teste";
    IO.println("O tamanho do nome é "+nome.length());


  }
}
