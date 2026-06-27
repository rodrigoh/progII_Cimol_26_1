package aula15.tratamentoExcecoes;

public class Lista {
  String[] elementos;
  int tamanho;

  public Lista(int capacidade){
    elementos = new String[capacidade];
    tamanho = 0;
  }

  public void adiciona(String elemento){
    elementos[tamanho] = elemento;
    tamanho++;
  }

  public String obterElemento(int posicao){
    if(posicao<0 || posicao>=tamanho)
      throw new IllegalArgumentException("A posição "+posicao+" não é válida");
    return elementos[posicao];
  }
}
