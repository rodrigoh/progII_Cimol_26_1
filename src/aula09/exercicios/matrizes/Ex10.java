package aula09.exercicios.matrizes;

import java.util.Random;

public class Ex10 {
  static void main() {
    Random aleatorio = new Random();
    int[][] matriz = new int[5][5];
    int soma = 0;
    int il = 0;
    int maior=0;
    for (int l = 0; l < matriz.length; l++) {
      soma = 0;
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(1,100);
        IO.print("%02d ".formatted(matriz[l][c]));
        soma+=matriz[l][c];
      }
      IO.println(" = "+soma);
      if(l==0 || soma>maior){
        maior = soma;
        il = l;
      }
    }
    IO.println("A linha com maior soma é a "+il+" que tem soma total de "+maior);
  }
}
