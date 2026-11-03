
import java.util.*;

public class DesafioGerenciadorDeNotas {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();

        notas.add(10.0);
        notas.add(8.5);
        notas.add(6.3);
        notas.add(5.5);
        notas.add(7.6);

        System.out.println(notas);

        double total = 0;
        for (double num : notas) {
            total += num;
        }

        double media = total / notas.size();

        double maisAlto = Collections.max(notas);
        double maisBaixo = Collections.min(notas);

        System.out.println("Notas " + notas);
        System.out.println("Nota mais alta " + maisAlto);
        System.out.println("Nota mais baixa " + maisBaixo);
        System.out.println("Media " + media);

        if (media < 7) {

            System.out.println("Aluno reprovado");

        } else {

            System.out.println("Aluno Aprovado");
         }
    }
}
