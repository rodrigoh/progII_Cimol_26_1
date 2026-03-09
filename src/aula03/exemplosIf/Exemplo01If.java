package aula03.exemplosIf;

import java.util.Scanner;

public class Exemplo01If {
  static void main() {
    //Operadores relacionais
    // > -> maior que
    // < -> menor que
    // >= -> maior ou igual
    // <= -> menor ou igual
    // != -> diferente
    // == -> igual a
    // .equals -> verifica igualdade entre objetos
    //Operadores lógicos
    // || -> Ou lógico (basta que um termo seja verdade para para o resultado seja
    // verdadeiro)
    // && -> E lógico (os dois termos precisam ser verdadeiros para que o resultado
    // seja verdadeiro
    // ! -> Não lógico, o que é verdade vira falso e o que é falso vira verdade
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int numero = ler.nextInt();
    //As chaves são opcionais sempre que usar apenas uma comando dentro do IF
    if(numero==0) {
      System.out.println("O valor é zero");
      System.out.println("Outro print");
    }
    else if(numero>0)
      System.out.println("O número "+numero+" é positivo");
    else
      System.out.println("O número "+numero+" é negativo");
  }
}
