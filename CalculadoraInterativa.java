
import java.util.*;

class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        while (true){
            System.out.println("Escolha a operação que voce quer fazer!");

            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Resto De Divisão");
            System.out.println("6 - Sair ");
            int opcao = sc.nextInt();

            if (opcao == 6) {
                System.out.println("Saindo...");
                break;
            }

            if (opcao < 1 || opcao > 6){

                System.out.println("Opção inválida");
                continue;
            }

            System.out.println("Digite um numero:");
            int num1 = sc.nextInt();
            System.out.println("Digite um numero:");
            int num2 = sc.nextInt();


            if (opcao == 1) {

                int somando = num1 + num2;

                System.out.println("Resultado da conta " + num1 + " + " + num2 + " = " + somando);

            } else if (opcao == 2) {
                int subtraindo = num1 - num2;
                System.out.println("Resultado da conta " + num1 + " - " + num2 + " = " + subtraindo);

            } else if (opcao == 3) {

                int multiplicando = num1 * num2;

                System.out.println("Resultado da conta " + num1 + " * " + num2 + " = " + multiplicando);

            } else if (opcao == 4) {
                if (num2!= 0) {
                    int dividindo = num1 / num2;
                    System.out.println("Resultado da conta " + num1 + " / " + num2 + " = " + dividindo);
                } else {
                    System.out.println("Não é possível fazer divisão por 0!");
                }
            } else if (opcao == 5) {
                if (num2 != 0) {
                int resto = num1 % num2;
                    System.out.println("Resultado da conta " + num1 + " % " + num2 + " = " + resto);
                } else {
                    System.out.println("Não é possível fazer divisão por 0!");
                }

                }  else  {
                System.out.println("Erro");
            }
        } sc.close();
    }
}
