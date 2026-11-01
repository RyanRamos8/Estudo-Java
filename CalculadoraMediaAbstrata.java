// Calculadora de média de Notas

abstract class Calculadora {

    abstract double calcular_total();

 abstract     double media();

}

class notaFinal extends Calculadora {

    private double nota1 = 10;
    private double nota2 = 8;
    private double nota3 = 6;
    private double nota4 = 7;

    public notaFinal(double nota1, double nota2, double nota3, double nota4) {


        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;


    }

    @Override
    double calcular_total() {

        return nota1 + nota2 + nota3 + nota4;
    }

    @Override
    double media() {

        double total = calcular_total();
        return total / 4;


    }

}
    class testandoCalculadora {
        static void main(String[] args) {

            Calculadora aluno1 = new notaFinal(10.0, 8.0, 7.0, 6.0);


            System.out.println("Nota total: " + aluno1.calcular_total());

            System.out.println("Nota final: " + aluno1.media());


            if (aluno1.media() > 6) {

                System.out.println("O aluno 1 está Aprovado");

            } else {

                System.out.println(" O aluno 1 está Reprovado");


            }

            Calculadora aluno2 = new notaFinal(8.0, 6.0, 4.0, 7.0);


            System.out.println("Nota total: " + aluno2.calcular_total());

            System.out.println("Nota final: " + aluno2.media());


            if (aluno2.media() > 6) {

                System.out.println("O aluno 2 está Aprovado");

            } else {

                System.out.println("O aluno 2 está Reprovado");
            }

        }
    }
