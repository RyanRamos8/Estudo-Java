import java.util.*;

public class ListaDeCompras {

    static void main() {

        Set<String> produtos = new HashSet<>();

        produtos.add("Macarrão");
        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Café");
        produtos.add("Leite");

        System.out.println(produtos);


        System.out.println("Buscando produto " + produtos.contains("Macarrão"));


        produtos.remove("Feijão");

        System.out.println(produtos);

        if (produtos.add("Macarrão")) {

            System.out.println("Produto cadastrado");



        } else {

            System.out.println("Negado Produto já existe");

        }


    }
}

