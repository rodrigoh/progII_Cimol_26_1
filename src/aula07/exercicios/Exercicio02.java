package aula07.exercicios;

import java.util.Scanner;

/**
 *  Declarar um vetor de até 100 números inteiros positivos,
 *  pedir para o usuário digitar elementos para o vetor, até
 *  que ele digite um 0 ou que o vetor esteja cheio, que encerra
 *  a leitura. Mostrar o vetor lido.
 */
public class Exercicio02 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetor = new int[100];
    int cont = 0;
    int numero;
    do{
      System.out.print("Digite um valor para o "+(cont+1)+"° número: ");
      numero = ler.nextInt();
      if(numero>0){
        vetor[cont] = numero;
        cont++;
      }
    }
    while(numero!=0 && cont<100);
    //Mostrando o vetor na tela
    for(int i=0;i<cont;i++){
      System.out.print(vetor[i]+" ");
    }
  }
}
