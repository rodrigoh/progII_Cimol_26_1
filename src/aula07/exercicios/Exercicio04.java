package aula07.exercicios;

import java.util.Scanner;

/**
 * Ler um vetor A de 10 elementos inteiros e um valor X também inteiro.
 * Armazenar em um vetor M o resultado de cada elemento de A multiplicado
 * pelo valor X. Logo após, imprimir o vetor M.
 */
public class Exercicio04 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetorA = new int[10];
    int valorX;
    int[] vetorM = new int[10];
    for (int i = 0; i < vetorA.length; i++) {
      System.out.print("vetorA["+i+"]: ");
      vetorA[i] = ler.nextInt();
    }
    System.out.print("Por qual valor devo multiplicar os elementos do vetor: ");
    valorX = ler.nextInt();
    for (int i = 0; i < vetorM.length; i++) {
      vetorM[i] = vetorA[i]*valorX;
      //System.out.print(vetorM[i]+" ");
      System.out.println(vetorA[i]+" x "+valorX+" = "+vetorM[i]);
    }
  }
}
