 class Lego {
    private String nome;
    private double preco;

    public Lego(String nome, double preco){

        this.nome = nome;
        this.preco = preco;

    }

     public String getNome() {
         return nome;
     }

     public double getPreco() {
         return preco;
     }
 }


 class Carrinho {

    private String tipo;
    private double preco;

   public Carrinho(String tipo, double preco){

       this.tipo = tipo;
       this.preco = preco;

   }

     public double getPreco() {
         return preco;
     }

     public String getTipo() {
         return tipo;
     }
 }

  class Prateleira <T>{

    private T objeto;

    void guardar(T objeto) {

        this.objeto = objeto;

    }
       public T pegar(){

        return objeto;

       }
}

class testando {
    public static void main (String[] args){

        Prateleira<Lego> legoPrateleiraego = new Prateleira<>();

          legoPrateleiraego.guardar(new Lego("Cidade Lego", 29.90));

        Prateleira<Carrinho> carrinhoPrateleira = new Prateleira<>();

        carrinhoPrateleira.guardar((new Carrinho("Hotwhelss", 2.99)));

        Lego lego = legoPrateleiraego.pegar();
        Carrinho carrinho = carrinhoPrateleira.pegar();

        System.out.println("Nome do lego" +lego.getNome());
        System.out.println("Tipo de Carrinho de brinquedo" +carrinho.getTipo());


        System.out.println("Preço do Carrinho: " +carrinho.getPreco());
        System.out.println("Preco do lego: " +lego.getPreco());

    }


}





