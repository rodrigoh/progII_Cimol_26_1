package aula03.exemplosSwitch;

import java.util.Scanner;

public class Exemplo02Case {
  static void main() {
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite um número de 1 a 7: ");
    int dia = ler.nextInt();
    //Switch case disponível desde o Java 17
    switch (dia){
      case 1-> System.out.println("O dia é domingo");
      case 2-> System.out.println("O dia é segunda-feira");
      case 3-> System.out.println("O dia é terça-feira");
      case 4-> System.out.println("O dia é quarta-feira");
      case 5-> System.out.println("O dia é quinta-feira");
      case 6-> System.out.println("O dia é sexta-feira");
      case 7-> {
        System.out.println("O dia é sábado");
        System.out.println("Aqui inicia o fim de semana");
      }
      default-> System.out.println("O número "+dia+" não corresponde a nenhum dia da semana");
    }
  }
}
