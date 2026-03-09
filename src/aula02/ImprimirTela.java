package aula02;

public class ImprimirTela {
  static void main() {
    System.out.println("Mensagem a ser impressa na tela");
    System.out.printf("Mensagem a ser impressa na tela\n");
    int idade = 20;
    String nome = "Jonas";
    float altura = (float) 10.5;
    System.out.println("Nome "+nome+" idade "+idade+" altura "+altura);
    System.out.printf("Nome %s idade %d altura %.2f\n",nome, idade, altura);
  }
}
