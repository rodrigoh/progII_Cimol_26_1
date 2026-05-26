package aula11.exercios.exeUm;

public class CalculadoraSwCase {

  static double leDouble(String mensagem){
    return Double.parseDouble(IO.readln(mensagem+": "));
  }

  static void main() {
    Operacoes op = new Operacoes();
    char opc;
    do {
      IO.println("Selecione uma das opções");
      IO.println("+ para somar");
      IO.println("- para subtrair");
      IO.println("* para multiplicar");
      IO.println("/ para dividir");
      IO.println("^ para exponenciação");
      IO.println("c para área do círculo");
      IO.println("q para área do quadrado");
      IO.println("s sair");
      opc = IO.readln().toLowerCase().charAt(0);
      switch (opc) {
        case '+' -> {
          double v1 = leDouble("Primeiro valor");
          double v2 = leDouble("Segundo valor");
          //Estamos chamando o método soma
          double resultado = op.soma(v1, v2);
          IO.println("%.2f + %.2f = %.2f".formatted(v1, v2, resultado));
        }
        case '-' -> {
          double v1 = leDouble("Primeiro valor");
          double v2 = leDouble("Segundo valor");
          //Estamos chamando o método subtração
          double resultado = op.subtrai(v1, v2);
          IO.println("%.2f - %.2f = %.2f".formatted(v1, v2, resultado));
        }
        case '*' -> {
          double v1 = leDouble("Primeiro valor");
          double v2 = leDouble("Segundo valor");
          //Estamos chamando o método multiplica
          double resultado = op.multiplicacao(v1, v2);
          IO.println("%.2f x %.2f = %.2f".formatted(v1, v2, resultado));
        }
        case '/' -> {
          double v1 = leDouble("Primeiro valor");
          double v2 = leDouble("Segundo valor");
          if (v2 != 0) {
            double resultado = op.divisao(v1, v2);
            IO.println("%.2f / %.2f = %.2f".formatted(v1, v2, resultado));
          } else {
            IO.println("Não é possível dividir por zero");
          }
        }
        case '^' -> {
          double v1 = leDouble("Base");
          double v2 = leDouble("Expoente");
          double resultado = op.power(v1, v2);
          //System.out.printf("%.2f ^ %.2f = %.2f",v1,v2,resultado);
          IO.println("%.2f ^ %.2f = %.2f".formatted(v1, v2, resultado));
        }
        case 'c' -> {
          double raio = leDouble("Qual o valor do raio");
          double area = op.areaCirculo(raio);
          IO.println("A área do círculo de raio %.2f vale %.2f cm²".formatted(raio, area));
        }
        case 'q' -> {
          double lado = leDouble("Qual o valor do lado");
          double area = op.areaQuadrado(lado);
          IO.println("A área do quadrado de lado %.2f vale %.2f cm²".formatted(lado, area));
        }
      }
    }
    while(opc!='s');
  }
}