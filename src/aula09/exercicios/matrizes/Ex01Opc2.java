package aula09.exercicios.matrizes;

public class Ex01Opc2 {

  static void main() {
    int[][] matriz = new int[3][4];
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = Integer.parseInt(IO.readln("matriz[%d][%d]: ".formatted(l,c)));
      }
    }
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        IO.print(matriz[l][c]+" ");
      }
      IO.println();
    }
    int pesquisa = Integer.parseInt(IO.readln("Qual número devo pesquisar na matriz: "));
    boolean achei = false;
    int linha = 0;
    int coluna = 0;
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        if(matriz[l][c]==pesquisa){
          achei = true;
          linha = l;
          coluna = c;
        }
      }
    }
    if(achei){
      IO.println("O número "+pesquisa+" existe na matriz nas posições linha = "+linha+" e coluna = "+coluna);
    }
    else{
      IO.println("O número "+pesquisa+" não existe na matriz");
    }
  }
}
