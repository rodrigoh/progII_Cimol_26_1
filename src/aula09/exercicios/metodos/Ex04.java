package aula09.exercicios.metodos;

import java.util.Random;

public class Ex04 {

  static int dado(){
    Random aleatorio = new Random();
    return aleatorio.nextInt(1,7);
  }

  static void main() {
    int f1 = 0;
    int f2 = 0;
    int f3 = 0;
    int f4 = 0;
    int f5 = 0;
    int f6 = 0;
    int lancamentos = 1_000_000;
    for (int i = 0; i < lancamentos; i++) {
      int sorteio = dado();
      switch (sorteio){
        case 1->f1++;
        case 2->f2++;
        case 3->f3++;
        case 4->f4++;
        case 5->f5++;
        case 6->f6++;
      }
    }
    float pf1 = f1/(float)lancamentos*100;
    IO.println("A face 1 do dado foi sorteada %d vezes o que representa %.2f%%".formatted(f1,pf1));
    float pf2 = f2/(float)lancamentos*100;
    IO.println("A face 1 do dado foi sorteada %d vezes o que representa %.2f%%".formatted(f2,pf2));
    float pf3 = f3/(float)lancamentos*100;
    IO.println("A face 1 do dado foi sorteada %d vezes o que representa %.2f%%".formatted(f3,pf3));
    float pf4 = f4/(float)lancamentos*100;
    IO.println("A face 1 do dado foi sorteada %d vezes o que representa %.2f%%".formatted(f4,pf4));
    float pf5 = f5/(float)lancamentos*100;
    IO.println("A face 1 do dado foi sorteada %d vezes o que representa %.2f%%".formatted(f5,pf5));
    float pf6 = f6/(float)lancamentos*100;
    IO.println("A face 1 do dado foi sorteada %d vezes o que representa %.2f%%".formatted(f6,pf6));
  }
}
