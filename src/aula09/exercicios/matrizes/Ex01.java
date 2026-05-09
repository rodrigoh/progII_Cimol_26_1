package aula09.exercicios.matrizes;

public class Ex01 {

  static boolean buscaMatriz(int[][] matriz, int pesquisa){
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        if(matriz[l][c]==pesquisa){
          return true;
        }
      }
    }
    return false;
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
    int[][] matriz = new int[ql][qc];
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = Integer.parseInt(IO.readln("matriz[%d][%d]: ".formatted(l,c)));
      }
    }
    return matriz;
  }

  static void main() {
    int[][] matriz = leMatriz(2,3);
    imprimeMatriz(matriz);
    int pesquisa = Integer.parseInt(IO.readln("Qual número devo pesquisar na matriz: "));
    if(buscaMatriz(matriz, pesquisa)){
      IO.println("O número "+pesquisa+" existe na matriz");
    }
    else{
      IO.println("O número "+pesquisa+" não existe na matriz");
    }
  }
}
