package aula10.exemplo03;

public class Cadastro {
  static void main() {
    String nome = IO.readln("Qual o nome do aluno: ");
    float n1 = Float.parseFloat(IO.readln("Qual a primeira nota: "));
    float n2 = Float.parseFloat(IO.readln("Qual a segunda nota: "));
    float n3 = Float.parseFloat(IO.readln("Qual a terceira nota: "));

    Aluno aluno = new Aluno(nome);
    //aluno.nome = nome;
    aluno.n1 = n1;
    aluno.n2 = n2;
    aluno.n3 = n3;

    float media = aluno.calculaMedia();
    IO.println("O aluno %s tem média %.2f".formatted(aluno.nome, media));
    IO.println("Com esta média o aluno está "+aluno.verificaStatus());

    Aluno alunoDois = new Aluno("Pedro",8,9,10);

    Aluno alunoTres = new Aluno();

  }
}
