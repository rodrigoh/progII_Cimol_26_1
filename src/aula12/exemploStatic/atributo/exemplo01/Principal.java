package aula12.exemploStatic.atributo.exemplo01;

public class Principal {
  static void main() {
    Conta c1 = new Conta("Jonas");
    c1.nomeBanco = "Novo banco";
    IO.println(c1.verificaSaldo());

    Conta c2 = new Conta("Ana");
    IO.println(c2.verificaSaldo());

    Conta.nomeBanco = "Banco real";
    IO.println(c1.verificaSaldo());
    IO.println(c2.verificaSaldo());
  }
}
