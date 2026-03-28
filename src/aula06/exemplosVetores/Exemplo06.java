package aula06.exemplosVetores;

import java.util.Random;

public class Exemplo06 {
  static void main() {
    Random aleatorio = new Random();
    int[] vetor = new int[10];
    int[] copia = new int[10];
    IO.println("Vetor com 10 números aleatórios");
    for (int i = 0; i < vetor.length; i++) {
     vetor[i] = aleatorio.nextInt(20);
      IO.print(vetor[i]+" ");
    }
    //Copiando vetores
    //copia = vetor;(desta forma cópia aponta para o mesmo endereço de memória de vetor,
    //desta forma eles são a mesma lista
    //Cópia manual de vetores
    for (int i = 0; i < vetor.length; i++) {
      copia[i] = vetor[i];
    }
    //Usando System.arraycopy(origem, posicaoInicial, destino, pInicialDest, quantElementos
    System.arraycopy(vetor,0,copia,0,10);

    IO.println("\nDados em vetor:");
    for (int i:vetor)
      IO.print(i+" ");
    IO.println("\nDados em cópia");
    for (int i:copia)
      IO.print(i+" ");

    copia[5] = 1000;
    IO.println("\nDados em vetor:");
    for (int i:vetor)
      IO.print(i+" ");
    IO.println("\nDados em cópia");
    for (int i:copia)
      IO.print(i+" ");
  }
}
