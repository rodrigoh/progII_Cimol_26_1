package aula15.classesAbstratas;

public class Principal {
  static void main() {
    Circulo c1 = new Circulo();
    c1.setRaio(5);
    IO.println(c1.calculaArea());
    IO.println(c1.calculaPerimetro());
  }
}
