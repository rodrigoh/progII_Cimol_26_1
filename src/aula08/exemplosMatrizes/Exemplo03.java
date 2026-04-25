package aula08.exemplosMatrizes;

import java.util.Random;

public class Exemplo03 {
  static void main() {
    Random aleatorio = new Random();
    //Declarar a matriz
    int[][] matriz = new int[5][6];
    //Iterar e gerar números
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(1,100);
        System.out.printf("%02d ",matriz[l][c]);
      }
      System.out.println();
    }
    System.out.println("\nUsando o para cada\n");
    for(int[] linha:matriz){
      for(int coluna: linha){
        System.out.printf("%02d ",coluna);
      }
      System.out.println();

    }
  }
}
