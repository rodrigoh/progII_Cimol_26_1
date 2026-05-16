package aula10.exemplo01;

public class Principal {
  static void main() {
    Carro carroUm = new Carro();
    carroUm.modelo = "Fusca";
    carroUm.marca = "vw";
    carroUm.anoFabricacao = 1980;
    carroUm.km = 85650;
    carroUm.cor = "azul";

    carroUm.abastecer(20);
    carroUm.andar(80);
    carroUm.parar();
    IO.println("A km atual do "+carroUm.modelo+" é de "+ carroUm.verificarKm()+"km");
    //Segundo carro
    Carro carroDois = new Carro();

    carroDois.modelo = IO.readln("Qual o modelo: ");
    carroDois.marca = IO.readln("Qual a marca do "+carroDois.modelo+": ");
    carroDois.anoFabricacao = Integer.parseInt(IO.readln("Qual o ano de fabricação: "));
    carroDois.km = Integer.parseInt(IO.readln("Qual a km do veículo: "));
    carroDois.cor = IO.readln("Qual a cor: ");
    int quanLitros = Integer.parseInt(IO.readln("Quantos litros devo abastecer: "));
    carroDois.abastecer(quanLitros);
    int velocidade = Integer.parseInt(IO.readln("A qual velocidade devo andar: "));
    carroDois.andar(velocidade);
    carroDois.parar();

  }
}
