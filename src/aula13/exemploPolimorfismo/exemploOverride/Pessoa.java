package aula13.exemploPolimorfismo.exemploOverride;

public class Pessoa {
  private String nome;
  private String sobrenome;
  private static int contPessoa;
  private int idPessoa;

  public Pessoa(String nome, String sobrenome){
    setNome(nome);
    setSobrenome(sobrenome);
    contPessoa++;
    idPessoa = 1000+contPessoa;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    if(nome.length()>=2)
      this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    if(sobrenome.length()>2)
      this.sobrenome = sobrenome;
  }

  public int getIdPessoa() {
    return idPessoa;
  }

  public void setIdPessoa(int idPessoa) {
    this.idPessoa = idPessoa;
  }

  public static int getContPessoa(){
    return contPessoa;
  }

  public String obterDados(){
    String dados = "Dados da pessoa";
    dados +="\nID: "+idPessoa;
    dados+="\nNome: "+nome+" "+sobrenome;
    return dados;
  }

  @Override
  public String toString(){
    return obterDados();
  }
}
