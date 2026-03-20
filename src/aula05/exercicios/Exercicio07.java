package aula05.exercicios;
/*
Crie um algoritmo que pergunte ao usuário se ele deseja converter uma
temperatura de graus Celsius em graus Fahrenheit ou Fahrenheit em Celsius.
 Em seguida mostre na tela o valor final correspondente à opção escolhida
 pelo usuário. F = 1.8 * C + 32 | C = (F – 32) / 1.8;

 */
public class Exercicio07 {
  static void main() {
    IO.println("Selecione uma opção");
    IO.println("1 - para converter uma temperatura de °C para °F");
    IO.println("2 - para converter uma temperatura de °F para °C");
    int opc = Integer.parseInt(IO.readln(": "));
    switch (opc){
      case 1->{
        IO.println("Convertendo de °C para °F");
        float tempC = Float.parseFloat(IO.readln("Informe uma termperatura em °C: "));
        float tempF = 1.8f * tempC + 32;
        IO.println("%.2f °C equivale(m) a %.2f°F".formatted(tempC,tempF));
      }
      case 2->{
        IO.println("Convertendo de °F para °C");
        float tempF = Float.parseFloat(IO.readln("Informe uma termperatura em °F: "));
        float tempC = (tempF - 32) / 1.8f;
        IO.println("%.2f °F equivale(m) a %.2f°C".formatted(tempF,tempC));
      }
    }
  }
}
