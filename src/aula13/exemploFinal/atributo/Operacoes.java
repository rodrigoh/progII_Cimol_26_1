package aula13.exemploFinal.atributo;

public class Operacoes {
  /*
  Quando um atributo é definido com final, ele não pode ser alterado
  portando, criar um setter para ele não funciona
  A inicialização desta variável deve ser realizada na declaração ou
  no construtor da classe
   */
  private final int numero;

  /*
  public -> ter acesso global
  static -> existe independente da criação de instâncias
  final -> para não ser alterada
   */
  public static final double PI = 3.141592653589793;


  public Operacoes(){
    numero = 10;
  }

//  public void  setNumero(int numero){
//    this.numero = numero;
//  }


  public int getNumero() {
    return numero;
  }
}
