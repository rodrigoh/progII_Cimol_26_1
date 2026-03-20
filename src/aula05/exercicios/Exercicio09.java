package aula05.exercicios;

/**
 * Receba três valores fornecidos pelo usuário que representarão os
 * lados de um triângulo.
 * Classifique esse triângulo como:
 * a) Equilátero: três lados iguais.
 * b) Isósceles: dois lados iguais.
 * c) Escaleno: três lados diferentes. Lembre-se de que, para formar
 * um triângulo, nenhum dos lados pode ser igual a zero,
 * um lado não pode ser maior do que a soma dos outros dois.
 */
public class Exercicio09 {
  static void main() {
    double a = Double.parseDouble(IO.readln("Informe a medida do primeiro lado: "));
    double b = Double.parseDouble(IO.readln("Informe a medida do segundo lado: "));
    double c = Double.parseDouble(IO.readln("Informe a medida do terceiro lado: "));
    //Teste para formar triângulo
//    if(a>0 && b>0 && c>0 && a<b+c && b<a+c && c<a+b){
//
//    }
    //Teste para não formar triângulo
    if(a<0 || b<0 || c<0 || a>b+c || b>a+c || c>a+b)
      //iop
      IO.println("As medidas %.2f, %.2f e %.2f não formam triângulo".formatted(a,b,c));
    else if(a==b && b==c)
      IO.println("As medidas %.2f, %.2f e %.2f formam um triângulo equilátero".formatted(a,b,c));
    else if(a==b || a==c || b==c)
      IO.println("As medidas %.2f, %.2f e %.2f formam um triângulo isósceles".formatted(a,b,c));
    else
      IO.println("As medidas %.2f, %.2f e %.2f formam um triângulo escaleno".formatted(a,b,c));
  }
}
