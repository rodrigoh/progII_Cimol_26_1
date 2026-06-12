package aula12.exemploStatic.metodos;

public class Operacoes {
  static Double leDouble(String mensagem){
    return Double.parseDouble(IO.readln(mensagem+": "));
  }

  static double somaVetor(double[] vetor){
    double soma = 0;
    for (double valor: vetor){
      soma+=valor;
    }
    return soma;
  }

  static double power(double base, double expoente){
    double mult = 1;
    for (int i = 0; i < expoente; i++) {
      mult*=base;
    }
    return mult;
  }
}
