package aula08.exemplosMatrizes;

public class Exemplo02 {
  static void main() {
    int[][] matriz = {{1,2,3,10},{4,5,6,11},{7,8,9,12},{10,11,12,14}};
    int[] vetor = {1,2,3,4,5,6};
    int tamanho = vetor.length;
    System.out.println("O tamanho do vetor é "+tamanho);
    int linhas = matriz.length;
    System.out.println("A quantidade de linhas da matriz é "+linhas);
    int colunas = matriz[0].length;
    System.out.println("A quantidade de colunas da matriz é "+colunas);

    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        System.out.printf("%02d ",matriz[l][c]);
      }
      System.out.println();
    }
  }
}
