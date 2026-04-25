package aula08.exemplosMetodos;

import java.util.Scanner;

public class Exemplo01 {
  //tipo_acesso tipo_retorno nome(tipo_paramento1 nome_parametro1)
  static int soma(int n1, int n2){
    return n1+n2;
  }

  static int leNumero(String mensagem){
    Scanner ler = new Scanner(System.in);
    System.out.print(mensagem+": ");
    return ler.nextInt();
  }

  static void main() {
//    Scanner ler = new Scanner(System.in);
//    System.out.print("N1: ");
//    int num1 = ler.nextInt();
//    System.out.print("N2: ");
//    int num2 = ler.nextInt();
    int num1 = leNumero("N1");
    int num2 = leNumero("N2");

    int resultado = soma(num1, num2);
    System.out.println(num1+"+"+num2+"="+resultado);
  }
}
