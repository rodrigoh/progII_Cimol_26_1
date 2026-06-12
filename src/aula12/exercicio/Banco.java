package aula12.exercicio;

public class Banco {
  static void main() {
    String titular = IO.readln("Qual seu nome: ");
    Conta c1 = new Conta(titular);
    IO.println("Bem vindo "+c1.titular);
    IO.println("Acessando a conta "+c1.identificador);
    char opc;
    do{
      IO.println("O que vamos fazer hoje");
      IO.println("d - depositar");
      IO.println("s - sacar");
      IO.println("m - mostrar saldo");
      IO.println("e - sair");
      opc = IO.readln().toLowerCase().charAt(0);
      switch (opc){
        case 'd'->{
          double valor = Double.parseDouble(IO.readln("Qual o valor: "));
          c1.depositar(valor);
          IO.println("Deposito realizado");
        }
        case 's'->{
          double valor = Double.parseDouble(IO.readln("Qual o valor: "));
          if(c1.sacar(valor)){
            IO.println("Saque no valor de R$%.2f realizado".formatted(valor));
          }
          else{
            IO.println("Saldo insuficiente");
          }
        }
        case 'm'->{
          IO.println(c1.verificaSaldo());
        }
      }
    }
    while(opc!='e');
  }
}
