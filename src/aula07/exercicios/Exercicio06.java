package aula07.exercicios;

import java.util.Scanner;

/**
 * Ler um vetor C de 10 nomes de pessoas, após pedir que o usuário digite
 * um nome qualquer de pessoa. Escrever a mensagem ACHEI, se o nome
 * estiver armazenado no vetor C ou NÃO ACHEI caso contrário.
 */
public class Exercicio06 {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    String[] nomes = new String[5];
    for (int i = 0; i < nomes.length; i++) {
      System.out.print("Digite o nome da "+(i+1)+"° pessoa: ");
      nomes[i] = ler.next();
    }
    System.out.print("Qual pessoa devo pesquisar na lista: ");
    String pesquisa = ler.next();
    boolean achei = false;
    for (int i = 0; i < nomes.length; i++) {
      if(pesquisa.equalsIgnoreCase(nomes[i])) {
        achei = true;
      }
    }
    if(achei){
      System.out.println("A pessoa "+pesquisa+" está na lista");
    }
    else{
      System.out.println("A pessoa "+pesquisa+" não está na lista");
    }
  }
}
