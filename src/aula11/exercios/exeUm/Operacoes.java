package aula11.exercios.exeUm;

public class Operacoes {
  //Crie uma classe java chamada Operações (Operacoes), nela implemente
  // métodos para realizar soma, subtração, multiplicação, divisão e exponenciação
  // (apenas ao quadrado). Implemente outra classe chamada calculadora que utilize
  // esses métodos.

  double soma(double valorUm, double valorDois){
    return valorUm+valorDois;
  }

  double subtrai(double valorUm, double valorDois){
    return valorUm-valorDois;
  }

  double multiplicacao(double valorUm, double valorDois){
    return valorUm*valorDois;
  }

  double divisao(double valorUm, double valorDois){
    return valorUm/valorDois;
  }

  double power(double base, double expoente){
    double mult = 1;
    for (int i = 0; i < expoente; i++) {
      mult *= base;
    }
    return mult;
  }

  double areaQuadrado(double lado){
    return lado*lado;
  }

  double areaCirculo(double raio){
    return Math.PI * power(raio,2);
  }
}
