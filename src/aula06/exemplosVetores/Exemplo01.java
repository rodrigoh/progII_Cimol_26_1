package aula06.exemplosVetores;

public class Exemplo01 {
  static void main() {
    //Em C int vetor[10]
    //Declaramos um vetor com 10 espaços com índices de 0 a 9
    int[] vetor = new int[10];
    //int tamanho = sizeof(vetor)/sizeof(int)
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = Integer.parseInt(IO.readln("vetor["+i+"]: "));
    }
    for (int i = 0; i < vetor.length; i++) {
      IO.print(vetor[i]+" ");
    }
    //Descobrindo o tamanho do vetor
    IO.println("\nO tamanho do vetor é "+vetor.length);
  }
}
