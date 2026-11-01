// 1 Projeto que fiz para Praticar Generics


public class Tenis { // Criação Classes
    private String tipo; // Variável
    private int numero; // Variável


    public Tenis(String tipo, int numero){ // Construtor

        this.tipo = tipo; // Guardando valores
        this.numero = numero; // Guardando valores


    }

 // Getters -> Devolve os valores salvos
    public String getNome() {
        return tipo;
    }

    public int getNumero() {
        return numero;
    }
}

class Chinelo {

    //Guardando valores

    private String marca;
    private int tamanho;

    public Chinelo(String marca, int tamanho){

        //Guardando valores

        this.marca = marca;
        this.tamanho = tamanho;
    }
 // Getters -> Devolve os valores salvos
    public int getTamanho() {
        return tamanho;
    }

    public String getMarca() {
        return marca;
    }
} class CaixaCalcados <T> {

    private T calcado;

    void guardar(T calcado) {

        this.calcado = calcado;

    }

    public T pegar() {

        return calcado;
    }


          void main (String [] args){

            // Criando generics
            CaixaCalcados<Tenis> tenis = new CaixaCalcados<>();

          tenis.guardar(new Tenis("Esportivo", 10));

           CaixaCalcados<Chinelo> chinelo = new CaixaCalcados<>();
           chinelo.guardar((new Chinelo("Havaianas", 10)));

           Tenis tenis1 = tenis.pegar();
           Chinelo chinelo1 = chinelo.pegar();


            System.out.println("Tipo do Tenis: " +tenis1.getNome());
            System.out.println("Marca do Chinelo: " +chinelo1.getMarca());

            System.out.println("Tamanho do Tênis: " +tenis1.getNumero());
            System.out.println("Tamanho do Chinelo: " +chinelo1.getTamanho());
        }


     }






