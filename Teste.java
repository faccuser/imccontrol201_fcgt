class Teste {

  public void executar() {

    Aluno alunoa = new Aluno("Dolores");
    Aluno alunob = new Aluno("Belmiro Silva");

    Avaliacao a1 = new Avaliacao(50, 2);
    Avaliacao b1 = new Avaliacao(90, 1);
    Avaliacao b2 = new Avaliacao(60, 1);
    Avaliacao b3 = new Avaliacao(20, 1);


    alunoa.adicionaAvaliacao(a1);
    alunob.adicionaAvaliacao(b1);
    alunob.adicionaAvaliacao(b2);
    alunob.adicionaAvaliacao(b3);



    // Relatorio saida
    System.out.println("\nRelatorio ***");
    System.out.println("Listagem de alunos:");
    this.mostrarAluno(alunoa);
    this.mostrarAluno(alunob);


  }

  public void mostrarAluno(Aluno x) {

    System.out.println("Nome: " + x.getNome());
    System.out.println("Total de avaliações: " + x.quantidadeAvaliacoes());

    for (int i=0; i<x.quantidadeAvaliacoes();i++) {
        Avaliacao atemp = x.getAvaliacoes().get(i);
        System.out.println(i+1 + ") " + atemp.indice() + " [" + atemp.classificacao() +"]");
    }
    
    System.out.println("\n");




  }

}
