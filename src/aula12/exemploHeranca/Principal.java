package aula12.exemploHeranca;

import aula12.exemploHeranca.filhas.Engenheiro;
import aula12.exemploHeranca.filhas.Motorista;

public class Principal {
  static void main() {
    Motorista m1 = new Motorista("Jonas","a123","5646866468");
    //m1.setNome("Jonas");
    m1.setMail("jonas@empresa.com");
    m1.setDataNascimento("25/10/1980");
    //m1.setMatricula("a123");
    m1.setSalario(3000);
    m1.setCnh("3336866468");
    Engenheiro e1 = new Engenheiro("Ana","a124");
    e1.setNome("Ana");
    e1.setMail("ana@empresa.com");
    e1.setMatricula("a124");
    e1.setDataNascimento("10/05/1952");
    e1.setCrea("564654");
  }
}
