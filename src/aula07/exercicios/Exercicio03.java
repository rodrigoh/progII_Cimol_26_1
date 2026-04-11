package aula07.exercicios;

import java.util.Scanner;

/**
 * Ler um vetor de números, de 10 elementos. Declarar outro vetor inverso,
 * copiar todos os elementos de números de trás para frente para o vetor
 * inverso.
 */
public class Exercicio03 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetor = new int[10];
    int[] inverso = new int[10];
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("vetor["+i+"]: ");
      vetor[i] = ler.nextInt();
    }
    System.out.println("Vetor invertido:");
    for (int i = 0, j = 9; i < vetor.length; i++, j--) {
     inverso[i] = vetor[j];
      System.out.print(inverso[i]+" ");
    }
  }
}
