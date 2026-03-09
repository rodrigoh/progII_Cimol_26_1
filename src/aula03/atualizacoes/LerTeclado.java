package aula03.atualizacoes;

public class LerTeclado {
  static void main() {
    //Lendo uma String do teclado
    String nome = IO.readln("Qual seu nome: ");
    //Lendo um inteiro
    int numero = Integer.parseInt(IO.readln("Digite um número inteiro: "));
    //Lendo um número float
    float valor = Float.parseFloat(IO.readln("Digite um número real"));
    //Imprimindo String formatada com o println usando o String.format
    IO.println("O valor digitado é " +String.format("%.2f",valor));
  }
}
