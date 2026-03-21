package aula05.exemplosRepete;

public class ExemploFor02 {
  static void main() {
    for(char resp='s';resp=='s';)
      resp = IO.readln("Digite s para continuar e n para sair: ").toLowerCase().charAt(0);
  }
}
