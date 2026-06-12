package aula13.exemploHeranca;

public class Cadastro {
  static void main() {
    Pessoa p1 = new Aluno("Jonas","Silva");
    IO.println(p1.obterDados());
    Aluno a1 = new Aluno("Ana","Silva");
    IO.println(a1.obterDados());
    IO.println(a1.getMatricula());
    IO.println("A quantidade pessoas cadastradas é "+Pessoa.getContPessoa());
  }
}
