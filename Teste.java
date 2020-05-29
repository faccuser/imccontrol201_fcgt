class Teste {

  public void executar() {

    Aluno a = new Aluno("Dolores");
		Aluno b = new Aluno("Belmiro Silva");
		

    Avaliacao a1 = new Avaliacao(50,2);

    //double indice =  IMC.calcular(90,2);
    //String classificacao = IMC.situacao(indice);

    double indice =  a1.indice();
    String classificacao = a1.classificacao();
    
    


    //Relatorio saida
    System.out.println("Listagem de alunos:");
    System.out.println(a.getNome());
    System.out.println(indice);
    System.out.println(classificacao);
    

    System.out.println(b.getNome());




    //

  }

}
