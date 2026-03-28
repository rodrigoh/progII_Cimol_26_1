package aula06.exemplosVetores;

public class Exemplo04 {
  static void main() {
    //Preciso armazenar uma quantidade desconhecida de números:
    int[] vetor = new int[1000];
    int i=0;
    int resp;
    do{
      IO.print("Informe o "+(i+1)+"° número: ");
      vetor[i] = Integer.parseInt(IO.readln());
      resp = Integer.parseInt(IO.readln("1 - continuar, 0 - sair: "));
      i++;
    }
    while (resp==1);

    //Valores armazenados
    for (int j = 0; j < i; j++) {
      IO.print(vetor[j]+" ");
    }

  }
}
