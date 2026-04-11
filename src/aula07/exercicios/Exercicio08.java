package aula07.exercicios;

import java.util.Random;

/**
 * Ler um vetor X de 10 elementos. A seguir copiar todos os
 * valores negativos do vetor X para um vetor R, sem deixar
 * elementos vazios entre os valores copiados.
 * Escrever o vetor X e o vetor R.
 */
public class Exercicio08 {
  public static void main(String[] args){
    Random aleatorio = new Random();
    int[] vetorX = new int[10];
    int[] vetorR = new int[10];
    int in = 0;
    System.out.println("Dados no vetor:");
    for (int i = 0; i < vetorX.length; i++) {
      vetorX[i] = aleatorio.nextInt(-20,20);
      System.out.print(vetorX[i]+" ");
      if(vetorX[i] < 0){
        vetorR[in] = vetorX[i];
        in++;
      }
    }
    System.out.println("\nDos números acima são negativos:");
    for (int i = 0; i < in; i++) {
      System.out.print(vetorR[i]+" ");
    }
  }
}
