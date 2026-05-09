package aula09.exercicios.metodos;

public class Ex01 {

  static double calculaDelta(double a, double b, double c){
    return b*b-4*a*c;
  }

  static double calculaX(double a, double b, double d, char opc){
    if(opc=='+'){
      return (-b+Math.sqrt(d))/(2*a);
    }
    else{
      return (-b-Math.sqrt(d))/(2*a);
    }
  }

  static void main() {
    IO.println("Dada a equação ax² + bx + c = 0");
    double a = Double.parseDouble(IO.readln("a: "));
    double b = Double.parseDouble(IO.readln("b: "));
    double c = Double.parseDouble(IO.readln("c: "));
    double d = calculaDelta(a,b,c);
    if(d>=0){
      double x1 = calculaX(a,b,d,'+');
      double x2 = calculaX(a,b,d,'-');
      IO.println("As raízes da equação são ");
      IO.println("x1 = %.2f".formatted(x1));
      IO.println("x2 = %.2f".formatted(x2));

    }
    else{
      IO.println("A equação não possui raízes no conjunto dos reais");
    }
  }
}
