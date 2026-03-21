package aula05.exemplosRepete;

public class ExemploFor01 {
  static void main() {
    //int i=0
    //  i<10
    //    ...comandos
    //    i++
    //for(inicialização; teste; passo)
    for(int i=0;i<10;i++)
      IO.print(i+" ");

    IO.println("For sem inicialização");
    int i =2;
    for(;i<=20;i+=2)
      IO.print(i+" ");
    IO.println("\nO valor de i após o for "+i);

    IO.println("\nFor com mais de um contador:");
    for(int j=0, t=9;j<10 && t>=0;j++,t--){
      IO.println("j = %d, t = %d".formatted(j,t));
    }
  }
}
