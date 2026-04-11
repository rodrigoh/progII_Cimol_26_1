package aula07.exercicios;

import java.util.Scanner;

public class VetorSemRepeticao {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] numeros = new int[10];
    int numero;
    for (int i = 0; i < numeros.length;) {
      System.out.print("Digite o "+(i+1)+"° número: ");
      numero = ler.nextInt();
      boolean achei = false;
      for (int j = 0; j < i; j++) {
        if(numero==numeros[j])
          achei = true;
      }
      //
      if(achei==false){
        numeros[i] = numero;
        i++;
      }
    }
    System.out.println("Dados no vetor: ");
    for (int i : numeros)
      System.out.print(i+" ");

  }
}
