import java.util.ArrayList;

class Aluno {

  private String    nome;
  private ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>(); 

  //construtor
  public Aluno(String n) {
      nome = n;
  }
  
  public String getNome() {
    return nome;
  }

  public void adicionaAvaliacao(Avaliacao nova) {
        this.avaliacoes.add(nova);
  }

  public ArrayList<Avaliacao> getAvaliacoes() {
    return this.avaliacoes;
  }

  public int quantidadeAvaliacoes() {
    return this.avaliacoes.size();
  }


}
