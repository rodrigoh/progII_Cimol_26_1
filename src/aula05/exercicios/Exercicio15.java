package aula05.exercicios;

public class Exercicio15 {
  static void main() {
    int a = Integer.parseInt(IO.readln("Digite um número: "));
    int b = Integer.parseInt(IO.readln("Digite outro número: "));
    int c = Integer.parseInt(IO.readln("E mais um: "));
    //a, b, c
    //a, c, b
    //b, a, c
    //b, c, a
    //c, a, b
    //c, b, a
    if(a<b && b<c)
      IO.println("A ordem dos números é %d, %d e %d".formatted(a,b,c));
    else if(a<c && c<b)
      IO.println("A ordem dos números é %d, %d e %d".formatted(a,c,b));
    else if(b<a && a<c)
      IO.println("A ordem dos números é %d, %d e %d".formatted(b,a,c));
    else if(b<c && c<a)
      IO.println("A ordem dos números é %d, %d e %d".formatted(b,c,a));
    else if(c<a && a<b)
      IO.println("A ordem dos números é %d, %d e %d".formatted(c,a,b));
    else if(c<b && b<a)
      IO.println("A ordem dos números é %d, %d e %d".formatted(c,b,a));
    else
      IO.println("Alguns dos números podem ser iguais");
  }
}
