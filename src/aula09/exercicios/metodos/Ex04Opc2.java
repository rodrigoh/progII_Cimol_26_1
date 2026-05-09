package aula09.exercicios.metodos;

import java.util.Random;

public class Ex04Opc2 {

  static int dado(){
    Random aleatorio = new Random();
    return aleatorio.nextInt(6);
  }

  static void main() {
    int[] sorteios = new int[6];
    int lancamentos = 1_000_000;
    for (int i = 0; i < lancamentos; i++) {
      int valor = dado();
      sorteios[valor]++;
    }

    for(int i=0;i<6;i++) {
      float percentual = sorteios[i] / (float) lancamentos * 100;
      IO.println("A face %d do dado foi sorteada %d o que vale %.2f%%".formatted(i + 1, sorteios[i], percentual));
    }
  }
}
