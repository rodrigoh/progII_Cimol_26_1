package aula08.exemplosMetodos;

import java.util.Random;

public class Exemplo02 {

  static void geraVetor(int[] vetor){
    Random aleatorio = new Random();
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = aleatorio.nextInt(vetor.length*2);
    }
  }

  static void mostraVetor(int[] vetor){
    System.out.println("\nDados no vetor");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i]+" ");
    }
  }

  static void main(){
    int[] vetor = new int[10];
    mostraVetor(vetor);
    geraVetor(vetor);
    mostraVetor(vetor);
  }
}
