package aula15.tratamentoExcecoes;

public class Exemplo02 {
  static void main() {
    Lista l1 = new Lista(10);
    l1.adiciona("A");
    l1.adiciona("B");
    l1.adiciona("C");
    l1.adiciona("D");
    try {
      IO.println(l1.obterElemento(2));
      IO.println(l1.obterElemento(5));
    }
    catch (IllegalArgumentException e){
      IO.println(e);
    }
  }
}
