package aula05.exemplosRepete;

public class ExemploWhile02 {
  static void main() {
     char resp='s';
     while(resp=='s'){
       //toLowerCase() -> Converte a String para minúsculo
       //toUpperCase() -> Converte a String para maiúsculo
       //charAt(posição) -> Pega a letra presente na posição da String
       resp = IO.readln("Deseja continuar (s - sim / n - não): ").toLowerCase().charAt(0);
     }
  }
}
