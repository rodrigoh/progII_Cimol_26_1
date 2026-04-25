package aula08.exemplosMatrizes;

import java.util.Random;
import java.util.Scanner;

/*
Gerar uma matriz de 2x3 números aleatórios (1-15) (não mostrar)
Pedir para o usuário tentar adivinhar um número da matriz e dizer
se ele acertou ou não
Caso ele acerte, mostrar a posição

 */
public class Exemplo05 {
  static void main() {
    Random aleatorio = new Random();
    Scanner ler = new Scanner(System.in);
    //Matriz
    int[][] matriz = new int[2][3];
    for (int l = 0; l < 2; l++) {
      for (int c = 0; c < 3; c++) {
        matriz[l][c] = aleatorio.nextInt(1,15);
      }
    }
    //Pesquisa
    System.out.print("Qual número tu acha que tem na matriz? ");
    int numero = ler.nextInt();
    boolean achei = false;
    int linha = 0;
    int coluna = 0;
    for (int l = 0; l < 2; l++) {
      for (int c = 0; c < 3; c++) {
        if(matriz[l][c]==numero){
          achei=true;
          linha = l;
          coluna = c;
        }
      }
    }
    if(achei) {
      System.out.println("Tu acertou");
      System.out.println("O número "+numero+" está na linha "+linha+" e coluna "+coluna);
    }
    else
      System.out.println("Tu errou");
  }
}
