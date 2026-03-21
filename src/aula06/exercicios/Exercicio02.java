package aula06.exercicios;

/**
 * Escreva um algoritmo que leia 10 valores e conte quantos deles
 * estão no intervalo entre 10 e 20. Depois escreva essa informação
 */
public class Exercicio02 {
  static void main() {
    int cont=0;
    for (int i = 0; i < 10; i++) {
      int num = Integer.parseInt(IO.readln("Digite o %d° número: ".formatted(i+1)));
      if(num>=10 && num<=20)
        cont++;
    }
    IO.println("Dos números digitados estão entre 10 e 20 "+cont);
  }
}
