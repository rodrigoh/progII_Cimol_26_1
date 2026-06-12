package aula12.exemploStatic.metodos;

public class Principal {
  static void main() {
    double n1 = Operacoes.leDouble("N1");
    double n2 = Operacoes.leDouble("N2");
    double resultado = Operacoes.power(n1,n2);
    IO.println(n1+"^"+n2+"="+resultado);
  }
}
