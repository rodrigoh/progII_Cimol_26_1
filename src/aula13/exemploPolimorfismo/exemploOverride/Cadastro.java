package aula13.exemploPolimorfismo.exemploOverride;

public class Cadastro {
  static void main() {
    Pessoa p1 = new Pessoa("Jonas","Silva");
    //IO.println(p1.obterDados());
    IO.println("----------------------");
    IO.println(p1);

    IO.println("----------------------");
    Aluno a1 = new Aluno("Ana","Silva");
    //IO.println(a1.obterDados());
    IO.println("----------------------");
    IO.println(a1);

    IO.println("A quantidade pessoas cadastradas é "+ Pessoa.getContPessoa());
  }
}
