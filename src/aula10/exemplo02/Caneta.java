package aula10.exemplo02;

public class Caneta {
  String fabricante;
  String cor;
  int quantidadeTinta;

  void escrever(String texto){
    if(quantidadeTinta>0) {
      IO.println(texto);
      quantidadeTinta--;
    }
  }

  void obterInformacoes(){
    IO.println("A caneta "+fabricante+" tem "+quantidadeTinta+" tinta restante");
  }
}
