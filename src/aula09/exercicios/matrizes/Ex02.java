package aula09.exercicios.matrizes;

import java.util.Random;

/**
 * 2 - Carregar uma matriz SOMA 4x4, calcular e escrever as seguintes somas:
 * a) da linha de índice 3
 * b) da coluna de índice 2
 * c) de todos os elementos da matriz
 */
public class Ex02 {
  static void main() {
    Random aleatorio = new Random();
    int[][] matriz = new int[4][4];
    int somaLinha = 0;
    int somaColuna = 0;
    int somaTotal = 0;
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(1,30);
        IO.print("%02d ".formatted(matriz[l][c]));
        if(l==3){
          somaLinha+=matriz[l][c];
        }
        if(c==2){
          somaColuna+=matriz[l][c];
        }
        somaTotal+=matriz[l][c];
      }
      IO.println();
    }
    IO.println("A soma dos elementos na linha 3 vale "+somaLinha);
    IO.println("A soma dos elementos na coluna 2 vale "+somaColuna);
    IO.println("A soma de todos os elementos na matriz vale "+somaTotal);
  }
}
