package aula03.exemplosIf;

import java.util.Scanner;

public class Exemplo02If {
  static void main() {
    Scanner ler = new Scanner(System.in);
    //Validar um usuário e senha
    System.out.print("Qual seu usuário: ");
    String usuario = ler.next();
    System.out.print("Qual sua senha: ");
    String senha = ler.next();
    String usuarioPadrao = "admin";

    if(usuario.equals(usuarioPadrao) && senha.equals("123456"))
      System.out.println("Bem vindo, "+usuario);
    else
      System.out.println("Usuário ou senha incorretos");
  }
}
