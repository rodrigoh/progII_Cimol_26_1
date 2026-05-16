package aula10.exemplo03;

public class Aluno {
  String nome;
  float n1;
  float n2;
  float n3;

  Aluno(){

  }

  Aluno(String nome){
    this.nome = nome;
    n1 = 0;
    n2 = 0;
    n3 = 0;
  }

  Aluno(String nome, float nota1, float nota2, float nota3){
    this.nome = nome;
    n1 = nota1;
    n2 = nota2;
    n3 = nota3;
  }

  float calculaMedia(){
    return (n1+n2+n3)/3;
  }

  String verificaStatus(){
    float media = calculaMedia();
    if(media>=8){
      return "aprovado";
    }
    else if(media>=3){
      return "em recuperação";
    }
    else{
      return "reprovado";
    }
  }
}
