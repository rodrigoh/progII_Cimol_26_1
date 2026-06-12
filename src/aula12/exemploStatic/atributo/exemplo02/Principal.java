package aula12.exemploStatic.atributo.exemplo02;

public class Principal {
  static void main() {
    Pessoa p1 = new Pessoa("Jonas","jonas@email.com");
    Pessoa p2 = new Pessoa("Ana","ana@email.com");
    Pessoa p3 = new Pessoa("Juliana","juliana@email.com");
    Pessoa p4 = new Pessoa("Betina","betina@email.com");
    Pessoa p5 = new Pessoa("Pedro","pedro@email.com");
    IO.println(p1.mostraInfo());
    p2.mostraInfo();
    IO.println("Até o momento temos "+p2.pessoasCadastradas()+" pessoas cadastradas");
    IO.println("Até o momento temos "+Pessoa.cont+" pessoas cadastradas");
    IO.println("Até o momento temos "+Pessoa.pessoasCadastradas()+" pessoas cadastradas");

  }
}
