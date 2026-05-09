package aula09.exercicios.matrizes;

import java.util.Random;

public class Ex08 {

  /**
   * Método que pesquisa um elemento na matriz
   * @param matriz matriz onde será a busca
   * @param pesquisa elemento a ser buscado
   * @return um vetor contendo as posições de linha e coluna ou -1 se não encontrar
   */
  static int[] buscaMatriz(int[][] matriz, int pesquisa){
    //Usamos -1 porque é uma posição inválida para qualquer vetor, portanto recebendo sei q não fui efetivo na busca
    int[] retorno = {-1,-1};
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        if(matriz[l][c]==pesquisa){
          retorno[0] = l;
          retorno[1] = c;
        }
      }
    }
    return retorno;
  }

  static void imprimeMatriz(int[][] matriz){
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        IO.print("%02d ".formatted(matriz[l][c]));
      }
      IO.println();
    }
  }

  static int[][] leMatriz(int ql, int qc){
    Random aleatorio = new Random();
    int[][] matriz = new int[ql][qc];
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(1, ql*qc*2);
      }
    }
    return matriz;
  }

  static void main() {
    int[][] matriz = leMatriz(5,5);
    imprimeMatriz(matriz);
    int pesquisa = Integer.parseInt(IO.readln("Qual número devo pesquisar na matriz: "));
    int[] resp = buscaMatriz(matriz,pesquisa);
    if(resp[0]!=-1){
      IO.println("O número "+pesquisa+" existe na matriz nas posições");
      IO.println("Linha = "+resp[0]);
      IO.println("Coluna = "+resp[1]);
    }
    else{
      IO.println("O número "+pesquisa+" não existe na matriz");
    }
  }
}
