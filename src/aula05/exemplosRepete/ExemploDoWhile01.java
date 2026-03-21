package aula05.exemplosRepete;

public class ExemploDoWhile01 {
  static void main() {
    int i = 10;
    while (i<10){
      IO.print(i+" ");
      i++;
    }
    i = 10;
    do{
      IO.print(i+" ");
      i++;
    }
    while (i<10);
  }
}
