package aula09.exercicios.matrizes;

import java.util.Random;

public class Ex09 {

  static boolean buscaNumero(int[][] matriz, int pesquisa){
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        if(matriz[l][c]==pesquisa){
          return true;
        }
      }
    }
    return false;
  }

  static void imprimeMatriz(int[][] matriz){
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        IO.print("%02d ".formatted(matriz[l][c]));
      }
      IO.println();
    }
  }

  static void main() {
    Random aleatorio = new Random();
    int[][] cartela = new int[5][5];
    for (int l = 0; l < cartela.length; l++) {
      for (int c = 0; c < cartela[l].length;) {
        int num = aleatorio.nextInt(1,100);

        //Se não encontrar o número ele vai para matriz
        if(!buscaNumero(cartela,num)){
          cartela[l][c] = num;
          c++;
        }
      }
    }
    imprimeMatriz(cartela);
  }
}
