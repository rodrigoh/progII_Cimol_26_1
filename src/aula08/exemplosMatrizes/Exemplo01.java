package aula08.exemplosMatrizes;

import java.util.Scanner;

public class Exemplo01 {
  static void main() {
    Scanner ler = new Scanner(System.in);
    //tipo[][] nome = new tipo[quantLinhas][quantColunas]
    int[][] matriz = new int[3][4];//3 -> 0 a 2 linhas e 4 -> 0 a 3 colunas
    //matriz[0][0] = 10;
    for (int l = 0; l < 3; l++) {
      for (int c = 0; c < 4; c++) {
        //matriz[l][c] = Integer.parseInt(IO.readln("matriz["+l+"]["+c+"]: "));
        System.out.print("matriz["+l+"]["+c+"]: ");
        matriz[l][c] = ler.nextInt();
      }
    }
    for (int l = 0; l < 3; l++) {
      for (int c = 0; c < 4; c++) {
        System.out.printf("%02d ",matriz[l][c]);
      }
      System.out.println();
    }

  }
}
