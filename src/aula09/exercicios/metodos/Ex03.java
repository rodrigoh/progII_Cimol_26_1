package aula09.exercicios.metodos;

import java.util.Random;

public class Ex03 {

  static int dado(){
    Random aleatorio = new Random();
    return aleatorio.nextInt(1,7);
  }

  static void main() {
    for (int i = 0; i < 20; i++) {
      IO.println(dado()+" ");
    }
  }
}
