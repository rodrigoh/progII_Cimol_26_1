package aula15.exemploArrayList;

import java.util.ArrayList;

public class Exemplo02 {
  static void main() {
    Pessoa p1 = new Pessoa("Jonas","Souza",25);
    IO.println(p1);
    ArrayList<Pessoa> lista = new ArrayList<>(10);
    lista.add(p1);
    lista.add(new Pessoa("Ana","Silva",20));
    IO.println(lista);
    IO.println("A Lista contém a Ana "+lista.contains(new Pessoa("Ana","Silva",20)));
  }
}
