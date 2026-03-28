package aula06.exemplosVetores;

public class Exemplo02 {
  static void main() {
    //Criar um vetor e inicializar com algum conteúdo
    int[] vetor = {1,2,3,4,5,6,7,8,9};

    //Para cada ou for simplificado
    //Para cada elemento de vetor, copia para i até que a lista termine
    for(int i : vetor)
      IO.print(i+" ");
  }
}
