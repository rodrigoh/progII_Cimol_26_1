package aula11.exercios.exeDois;

public class Cadastro {

  static Pessoa leDados(){
    Pessoa p1 = new Pessoa();
    p1.nome = IO.readln("Qual seu nome: ");
    p1.mail = IO.readln(p1.nome+" qual seu e-mail: ");
    p1.endereco = IO.readln(p1.nome+" qual seu endereço: ");
    p1.telefone = IO.readln(p1.nome+" qual seu telefone: ");
    return p1;
  }


  static void main() {
    Pessoa[] lista = new Pessoa[10];
    int cont = 0;
    char opc;
    do{
      IO.println("Selecione uma opção");
      IO.println("c - cadastrar uma pessoa");
      IO.println("l - listar pessoas");
      IO.println("p - pesquisar uma pessoa");
      IO.println("s - sair");
      opc = IO.readln().toLowerCase().charAt(0);
      switch (opc){
        case 'c'->{
          if(cont<lista.length) {
            IO.println("cadastrando a pessoa "+(cont+1));

            lista[cont] = new Pessoa();
            lista[cont].nome = IO.readln("Qual seu nome: ");
            lista[cont].mail = IO.readln(lista[cont].nome+" qual seu e-mail: ");
            lista[cont].endereco = IO.readln(lista[cont].nome+" qual seu endereço: ");
            lista[cont].telefone = IO.readln(lista[cont].nome+" qual seu telefone: ");

            //lista[cont] = leDados();
            cont++;
          }
          else{
            IO.println("Lista completa");
          }
        }
        case 'l'->{
          for (int i = 0; i < cont; i++) {
            IO.println("-------------------");
            IO.println(lista[i].obterInformacoes());
            IO.println("-------------------");
          }
        }
        case 'p'->{
          String pesquisa = IO.readln("Qual o nome da pessoa: ");
          int posicao = -1;
          for (int i = 0; i < cont; i++) {
            if(lista[i].igual(pesquisa)){
              posicao = i;
            }
          }
          if(posicao!=-1){
            IO.println("-------------------");
            IO.println(lista[posicao].obterInformacoes());
            IO.println("-------------------");
          }
          else{
            IO.println(pesquisa+" não encontrado");
          }
        }
      }
    }
    while (opc!='s');
  }
}
