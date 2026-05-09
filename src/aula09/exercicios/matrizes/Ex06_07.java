package aula09.exercicios.matrizes;

import java.util.Random;

public class Ex06_07 {
  static void main() {
    Random aleatorio = new Random();
    int[][] matriz = new int[5][5];
    int somaD = 0;
    int somaAcima = 0;
    int somaAbaixo = 0;
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(1,30);
        IO.print("%02d ".formatted(matriz[l][c]));
        if(l<c){
          somaAcima+=matriz[l][c];
        }
        else if(l>c){
          somaAbaixo+=matriz[l][c];
        }
        else{
          somaD+=matriz[l][c];
        }
      }
      IO.println();
    }
    IO.println("A soma dos elementos acima da diagonal vale "+somaAcima);
    IO.println("A soma dos elementos abaixo da diagonal vale "+somaAbaixo);
    IO.println("A soma dos elementos na diagonal vale "+somaD);
  }
}
