package aula15.tratamentoExcecoes;

public class Exemplo01 {
  static void main() {
    boolean erro;
    do {
      try {
        int n1 = Integer.parseInt(IO.readln("Digite um valor: "));
        int n2 = Integer.parseInt(IO.readln("Digite outro valor: "));
        int resultado = n1 / n2;
        IO.println(resultado);
        erro = false;
      }
      catch (NumberFormatException e) {
        IO.println("Os valores de n1 e n2 precisam ser números");
        erro = true;
      }
      catch (ArithmeticException e) {
        IO.println("Não é possível dividir por zero");
        erro = true;
      }
    }
    while (erro);

    IO.println("O código continua rodando");
  }
}
