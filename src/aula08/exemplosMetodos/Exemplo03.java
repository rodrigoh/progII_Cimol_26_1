package aula08.exemplosMetodos;

import java.util.Random;

public class Exemplo03 {

  static int[] geraVetor(int tamanho){
    Random aleatorio = new Random();
    int[] vetor = new int[tamanho];
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = aleatorio.nextInt(tamanho*2);
    }
    return vetor;
  }

  static void mostraVetor(int[] vetor){
    System.out.println("\nDados no vetor");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i]+" ");
    }
  }

  static void main(){
    int[] vetor = geraVetor(10);
    mostraVetor(vetor);
  }


}
