package aula09.exercicios.metodos;

public class Ex06 {
  static boolean ePrimo(int numero){
    int contDiv = 0;
    for (int i = 1; i <=numero ; i++) {
      if(numero%i==0){
        contDiv++;
      }
      if(contDiv>2)
        return false;
    }
    return contDiv==2;
  }

  static void main() {
    IO.println("são primos entre 1 e 1000");
    long ti = System.currentTimeMillis();
    for (int i = 1; i < 100_000; i++) {
      if(ePrimo(i)){
        IO.print(i+" ");
      }
    }
    long tf = System.currentTimeMillis();
    long tempo = tf-ti;
    IO.println("\nO código levou "+tempo+"ms para executar");
  }
}
