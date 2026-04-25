package aula08.exemplosMatrizes;

import java.util.Random;

public class Exemplo04 {
  static void main() {
    Random aleatorio = new Random();
    int[][] matriz = new int[5][5];
    for (int l = 0; l < 5; l++) {
      for (int c = 0; c < 5; c++) {
        matriz[l][c]=aleatorio.nextInt(50);
        System.out.printf("%02d ",matriz[l][c]);
      }
      System.out.println();
    }
    System.out.println("\nDiagonal principal da matriz");
    for (int l = 0; l < 5; l++) {
      for (int c = 0; c < 5; c++) {
        if(l==c){
          System.out.print(matriz[l][c]+" ");
        }
      }
    }
    System.out.println("\nDiagonal principal da matriz opc com um for");
    for (int i = 0; i < 5; i++) {
      System.out.print(matriz[i][i]+" ");
    }
    System.out.println("\nDiagonal secundária da matriz");
    for (int l = 0; l < 5; l++) {
      for (int c = 0; c < 5; c++) {
        //A diagonal secundária está onde a soma dos indices é igual ao tamanho da matriz -1
        if(l+c==matriz.length-1){
          System.out.print(matriz[l][c]+" ");
        }
      }
    }
  }
}
