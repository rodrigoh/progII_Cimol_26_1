package aula09.exercicios.matrizes;

import java.util.Random;

public class Ex04 {
  static void main() {
    Random aleatorio = new Random();
    int[][] matriz = new int[4][4];
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(1,30);
        IO.print("%02d ".formatted(matriz[l][c]));
      }
      IO.println();
    }
    int mult = Integer.parseInt(IO.readln("qual número usar para multiplicar: "));
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        if(l==c){
          matriz[l][c]*=mult;
          //matriz[l][c] = matriz[l][c]*mult;
        }
        IO.print("%02d ".formatted(matriz[l][c]));
      }
      IO.println();
    }
  }
}
