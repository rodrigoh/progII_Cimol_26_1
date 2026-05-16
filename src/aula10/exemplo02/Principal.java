package aula10.exemplo02;

public class Principal {
  static void main() {
    Caneta c1 = new Caneta();
    c1.fabricante = "BIC";
    c1.cor = "azul";
    c1.quantidadeTinta = 10;
    c1.obterInformacoes();
    for (int i = 0; i < 20; i++) {
      c1.escrever("Escrevendo a linha "+i+" do texto");
    }
    c1.obterInformacoes();
  }
}
