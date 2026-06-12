package aula13.exemploHeranca;

import java.util.Random;

public class Aluno extends Pessoa{
  private String matricula;
  private double[] notas;
  private int contNotas;

  public Aluno(String nome, String sobrenome){
    super(nome,sobrenome);
    notas = new double[4];
    contNotas = 0;
    geraMatricula();
  }

  public String getMatricula() {
    return matricula;
  }

  public boolean adicionaNota(double nota){
    if(contNotas<notas.length){
      notas[contNotas++] = nota;
      return true;
    }
    return false;
  }

  public double calculaMedia(){
    double soma = 0;
    for(double n : notas){
      soma+=n;
    }
    return soma/contNotas;
  }

  private void geraMatricula(){
    Random aleatorio = new Random();
    matricula = "";
    matricula += (char) aleatorio.nextInt(65,90);
    matricula+=aleatorio.nextInt(1000,9999);
  }
}
