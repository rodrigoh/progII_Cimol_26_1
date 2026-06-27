package aula15.exemploArrayList;

import java.util.ArrayList;

public class Exemplo01 {
  static void main() {
    //Integer -> int
    //Double -> double
    //String
    //Float -> float
    //Character -> char

    ArrayList<String> lista = new ArrayList<>(3);
    //Adicionar um elemento no final da lista
    lista.add("A");
    lista.add("C");
    lista.add("D");
    lista.add("E");
    IO.println(lista);
    //Adicionar um elemento em qualquer posição da lista
    lista.add(1,"B");
    IO.println(lista);
    //Verificando o tamanho da lista
    IO.println("A lista tem "+lista.size()+"elementos");
    //Verificando se a lista tem elementos
    IO.println("A lista está vazia: "+lista.isEmpty());
    //Obtendo um elemento da lista
    IO.println(lista.get(2));
    //Obtendo as posições de elementos na lista
    lista.add("D");
    IO.println("Qual a posição do elemento 'J' na lista: "+lista.indexOf("J"));
    IO.println("Qual a posição do elemento 'D' na lista: "+lista.indexOf("D"));
    IO.println("Qual a última posição do elemento 'D' na lista "+lista.lastIndexOf("D"));
    //Remover um elemento da lista
    //Pela posição
    IO.println(lista.remove(3));
    //Pelo elemento
    IO.println(lista.remove("C"));
    //Verificar se um elemento existe na lista
    IO.println("O elemento 'A' existe na lista? "+lista.contains("A"));
    //Apagar todos os elementos da lista
    lista.clear();
    IO.println(lista);




  }
}
