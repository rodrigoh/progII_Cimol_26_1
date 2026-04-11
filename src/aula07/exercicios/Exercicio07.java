package aula07.exercicios;

import java.util.Scanner;

/**
 * Ler um vetor que contenha as notas de uma turma de 10 alunos.
 * Calcular a média da turma e contar quantos alunos obtiveram nota
 * acima desta média calculada. Escrever a média da turma e o resultado
 * da contagem.
 */
public class Exercicio07 {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    double[] notas = new double[10];
    double soma = 0;
    for (int i = 0; i < notas.length;) {
      System.out.print("Digite média do "+(i+1)+"° aluno: ");
      double media = ler.nextDouble();
      if(media>=0 && media<=10){
        notas[i] = media;
        soma+=media;
        i++;
      }
      else{
        System.out.println("A média precisa estar entre 0 e 10");
      }
    }
    //Calculando a média da turma, baseada na soma de todas as médias
    //Deixando o cálculo dinâmico baseado no tamanho do vetor!
    double mediaTurma = soma/notas.length;
    //Verificando quantos alunos estão acima da média da turma
    int cont = 0;
    System.out.println("A média da turma é %.2f e estão acima dela: ".formatted(mediaTurma));
    for (int i = 0; i < notas.length; i++) {
      if(notas[i]>mediaTurma){
        cont++;
        System.out.println("O %d° aluno com média %.2f".formatted((i+1), notas[i]));
      }
    }
    System.out.println("O total de alunos acima da média da turma é "+cont);
  }
}
