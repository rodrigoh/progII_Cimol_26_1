package aula01;

public class Exemplo01 {
  public static void main(String[] args){

    System.out.print("Imprime um texto sem quebra de linha");

    System.out.println(" Imprime o texto e quebra linha no final");

    System.out.printf("Imprime o texto na tela com formatação específica");

    int numero = 10;

    double valor = 5.67;

    String nome = "Jonas";

    System.out.printf("Nome: %s, valor: %.2f e número: %d\n",nome, valor, numero);

    System.out.println("Nome: "+nome+", valor: "+valor+" e número: "+numero);
  }
}
