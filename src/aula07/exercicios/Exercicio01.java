package aula07.exercicios;

/**
 * Ler dois vetores, A e B com um número variável de conteúdo (números)
 * (no máximo 10). O programa deve solicitar antes da leitura dos vetores
 * a quantidade de dados a serem lidos (1 a 10), os dois vetores terão o
 * mesmo número de elementos. Gerar um terceiro vetor chamado Soma (de no
 * máximo 10 elementos) que seja a soma dos dados do vetor A com os do
 * vetor B.
 */
public class Exercicio01 {
  static void main() {
    int tamanho = Integer.parseInt(IO.readln("Informe um número entre 1 e 10: "));
    //Validando o número
    while(tamanho<1 || tamanho>10)
      tamanho = Integer.parseInt(IO.readln("Eu disse entre 1 e 10: "));
    //Declarando os vetores
    int[] va = new int[tamanho];
    int[] vb = new int[tamanho];
    int[] soma = new int[tamanho];
    //Lendo dados para os vetores
    for (int i = 0; i < va.length; i++) {
      va[i] = Integer.parseInt(IO.readln("vetorA["+i+"]: "));
    }
    for (int i = 0; i < vb.length; i++) {
      vb[i] = Integer.parseInt(IO.readln("vetorB["+i+"]: "));
    }
    for (int i = 0; i < soma.length; i++) {
     soma[i] = va[i] + vb[i];
      IO.println(va[i]+" + "+vb[i]+" = "+soma[i]);
    }
  }
}
