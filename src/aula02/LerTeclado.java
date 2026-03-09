package aula02;

import java.util.Scanner;

public class LerTeclado {
  public static void main(String[] args) {
    //Criando uma instância da classe Scanner
    Scanner ler = new Scanner(System.in);

    //Lendo um número inteiro do teclado
    System.out.print("Digite um número inteiro: ");
    //scanf("%d",&numero)
    int numero = ler.nextInt();

    //Lendo um número float
    System.out.print("Digite um número real: ");
    //scanf("%f",&numeroReal)
    float numeroReal = ler.nextFloat();

    //Lendo uma palavra do teclado
    System.out.print("Digite uma palavra: ");
    //scanf("%s",palavra)
    String palavra = ler.next();

    //Reiniciando nossa instância da classe Scanner
    //Necessário para limpar o buffer do teclado antes de usar o nextLine
    ler = new Scanner(System.in);

    //Lendo uma frase
    System.out.print("Digite uma frase: ");
    String frase = ler.nextLine();
  }
}
