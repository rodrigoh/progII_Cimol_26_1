package aula09.exercicios.matrizes;

import java.util.Random;

public class Ex09Opc2 {

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
    int[] vetor = new int[25];
    int cont=0;
    for (int l = 0; l < cartela.length; l++) {
      for (int c = 0; c < cartela[l].length;) {
        int num = aleatorio.nextInt(1,100);
        boolean achei = false;
        for(int i=0;i<vetor.length;i++){
          if(num==vetor[i]){
            achei = true;
          }
        }

        //Se não encontrar o número ele vai para matriz
        if(!achei){
          cartela[l][c] = num;
          vetor[cont] = num;
          cont++;
          c++;
        }
      }
    }
    imprimeMatriz(cartela);
  }
}
