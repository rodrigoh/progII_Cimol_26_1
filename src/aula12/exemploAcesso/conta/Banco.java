package aula12.exemploAcesso.conta;

public class Banco {
  static void main() {
    Conta c1 = new Conta("Jonas","123456");
    c1.depositar(150);
    IO.println(c1.verificaSaldo());
    IO.println(c1.verificaSaldo());

  }
}
