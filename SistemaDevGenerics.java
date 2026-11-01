 interface Dev { 


      void Baackend(double Salario, String Cargo); 
      void FrontEnd(int Salario, String Cargo);    

}

class Programador_ implements Dev{


    @Override

    public void FrontEnd(int Salario, String funcao) {
        System.out.println("O Dev Front End é responsável pela parte visual do programa");
    }

    @Override
    public void Baackend(double Salario, String Cargo) {
        System.out.println("O Dev Back End é responsável pela engrenagem por trás do programa");
    }
}



class programadores<T>{

    private T funcionario;
    private int NumeroFuncionarios;
   private String nome;

   // Metodos
    void guardar(T funcionario) {
  this.funcionario = funcionario;
    }

    void numero (int numeroFuncionarios, String nome){

          this.NumeroFuncionarios = numeroFuncionarios;
          this.nome = nome;
      }


    public T getFuncionario() {
        return funcionario;
    }

    public int getNumeroFuncionarios() {
        return NumeroFuncionarios;
    }

    public String getNome(String nome) {
        return nome;
    }
}


class testando_{

    static void main(String[] args) {

        Dev programadorDev = new Programador_();

        programadorDev.Baackend(3000.00, "Dev Junior");
        programadorDev.FrontEnd(2500, "Dev Junior");


        programadores<Dev> equipeDevs = new programadores<>();


        equipeDevs.guardar(new Programador_());

        equipeDevs.numero( 10, "Devs");



        System.out.println("Numero de Devs: " +equipeDevs.getNumeroFuncionarios());
        System.out.println("Cargos na empresa: " +equipeDevs.getNome("Devs"));


    }
}
