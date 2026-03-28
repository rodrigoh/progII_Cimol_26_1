package aula06.exemplosVetores;

import java.util.Random;

public class Exemplo03 {
  static void main() {
    Random aleatorio = new Random();

    int[] vetor = new int[20];
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = aleatorio.nextInt(100);
      IO.print(vetor[i]+" ");
    }
  }
}
