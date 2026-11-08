import java.util.*;


public class SistemaDeFrequenciaDenumeros {

    public static void main(String[] args) {

        Map<Integer, Integer> mapaFrequencia = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            int userDados = sc.nextInt();


            mapaFrequencia.put(userDados, mapaFrequencia.getOrDefault(userDados, 0) + 1);


            if (mapaFrequencia.get(userDados) > 1) {
                System.out.println(" O número: " + userDados + " foi digitado " + mapaFrequencia.get(userDados) + " vezes ");

            }

        }
            for (Map.Entry<Integer, Integer> entry : mapaFrequencia.entrySet()){

                Integer valor1 = entry.getKey();
                Integer valor2 = entry.getValue();
                System.out.println(" Numero " + valor1 + " Apareceu " + valor2 + " x ");

            }



            System.out.println(mapaFrequencia);


    }
}








