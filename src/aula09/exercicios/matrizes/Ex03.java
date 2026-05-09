package aula09.exercicios.matrizes;

import java.util.Random;

/*
Ler uma matriz G 3x3 e criar 2 vetores, SL e SC, de 3 elementos cada, contendo respectivamente as somas das linhas e das colunas de G.
Escrever os vetores criados.
 */
public class Ex03 {
  static void main() {
    Random aleatorio = new Random();
    int[][] matriz = new int[3][3];
    int[] sl = new int[3];
    int[] sc = new int[3];
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(1,20);
        IO.print("%02d ".formatted(matriz[l][c]));
      }
      IO.println();
    }
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        sl[i]+=matriz[i][j];
        sc[i]+=matriz[j][i];
      }
    }
    IO.println("somas dos elementos das linhas");
    for (int i = 0; i < sl.length; i++) {
      IO.print(sl[i]+" ");
    }
    IO.println("\nsomas dos elementos das colunas");
    for (int i = 0; i < sc.length; i++) {
      IO.print(sc[i]+" ");
    }
  }
}
