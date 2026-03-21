package aula05.exemplosRepete;

public class ExemploWhile01 {
  static void main() {
    IO.println("Números de 0 a 9");
    int i = 0;
    while(i<10){
      IO.print(i+" ");
      i++;
    }
    IO.println("\nNúmeros 1 a 10");
    i = 0;
    while(i<10){
      i++;
      IO.print(i+" ");
    }
    IO.println("\nNúmeros 1 a 10");
    i = 1;
    while(i<=10){
      IO.print(i+" ");
      i++;
    }

  }
}
