package aula05.exemplosRepete;

public class ExemploDoWhile02 {
  static void main() {
    char resp;
    do{
      resp = IO.readln("Deseja continuar (s - sim / n - não): ").toLowerCase().charAt(0);
    }
    while (resp=='s');
  }
}
