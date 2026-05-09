package aula09.exercicios.metodos;

public class Ex02 {
  static int achaMenor(int a, int b, int c){
    if(a<b && a<c)
      return a;
    else if(b<a && b<c)
      return b;
    else
      return c;
  }

  static void main() {
    int a = Integer.parseInt(IO.readln("Digite um valor para a: "));
    int b = Integer.parseInt(IO.readln("Digite um valor para b: "));
    int c = Integer.parseInt(IO.readln("Digite um valor para c: "));
    int menor = achaMenor(a,b,c);
    IO.println("O menor valor é "+menor);
  }
}
