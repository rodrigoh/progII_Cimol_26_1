package aula13.exemploPolimorfismo;


import java.util.Random;

public class Principal {
  static void main() {
    Operacoes op = new Operacoes();
    IO.println(op.soma(5,6));
    IO.println(op.soma(5,6,9));
    IO.println(op.soma("Jonas","Silva"));
  }
}
