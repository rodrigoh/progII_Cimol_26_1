package aula06.exemplosVetores;

import java.util.Random;

public class ExemploRandom {
  static void main() {
    Random aleatorio = new Random();
    //Gerando um inteiro aleatorio
    int numero = aleatorio.nextInt();
    IO.println("O número inteiro gerado foi "+numero);
    //Posso usar com um limite superior
    //numero = rand()%100
    numero = aleatorio.nextInt(100);
    IO.println("O número inteiro entre 0 e 100 gerado foi "+numero);
    //Posso usar com um limite inferior e superior
    numero = aleatorio.nextInt(-10, 10);
    IO.println("O número inteiro entre -10 e 10 gerado foi "+numero);
    //Boolean aleatório
    boolean sorteio = aleatorio.nextBoolean();
    IO.println("O valor booleano aleatório foi "+sorteio);
    //teste?valor_verdadeiro:valor_falso
    IO.println("Cara ou coroa "+(sorteio?"Cara":"Coroa"));
  }
}
