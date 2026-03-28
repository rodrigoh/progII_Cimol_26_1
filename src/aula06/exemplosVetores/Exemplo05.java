package aula06.exemplosVetores;

import java.util.Random;

public class Exemplo05 {
  static void main() {
    Random aleatorio = new Random();
    int[] vetor = new int[10];
    IO.println("Vetor com 10 números aleatórios");
    for (int i = 0; i < vetor.length; i++) {
     vetor[i] = aleatorio.nextInt(20);
      IO.print(vetor[i]+" ");
    }
    IO.println("\nVetor ao contrário");
    for (int i = 9; i >=0; i--) {
      //System.out.print(vetor[i]+" ");
      IO.print(vetor[i]+" ");
    }
  }
}
