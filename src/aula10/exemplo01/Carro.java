package aula10.exemplo01;

public class Carro {
  //Atributos objeto Carro
  String modelo;
  String marca;
  String cor;
  int km;
  int anoFabricacao;

  //Ações do carro
  void andar(int velocidade){
    IO.println(modelo+" está andando a "+velocidade+" km/h");
  }

  void abastecer(int quantidade){
    IO.println(modelo+" está abastecendo "+quantidade+" litros");
  }

  void parar(){
    IO.println(modelo+" está parado");
  }

  int verificarKm(){
    return km;
  }

}
