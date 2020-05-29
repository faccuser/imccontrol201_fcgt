class Avaliacao {
   

   private double peso;
   private double altura;
   private double indice;
   private String classificacao;
   
   
  public Avaliacao(double p, double a) {
    this.peso = p;
    this.altura =a;

    this.indice = this.peso / (this.altura * this.altura);

    if (this.indice < 18) 
        this.classificacao = "MAGRO";
    else if (this.indice > 30)
        this.classificacao = "OBESO";
    else 
        this.classificacao = "EQUILIBRADO";
  }

  public double getPeso() {
    return this.peso;
  }

  public double getAltura() {
    return this.altura;
  }

  public double indice() {
      return this.indice; 
  }

  public String classificacao() {
      return this.classificacao; 
  }

}