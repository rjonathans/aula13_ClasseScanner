package br.com.digitalhouse.exercicioIntegradorLivraria;


import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.util.Scanner;

class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Livraria livraria = new Livraria();

        Livro l1 = new Livro(11, "LivroTeste", "Jose", 1984, 92, 5, 15.0f);
        Livro l2 = new Livro(12, "LivroTeste2", "Maros", 1983, 93, 5, 30.0f);
        Livro l3 = new Livro(13, "LivroTeste3", "Clarius", 1945, 94, 5, 90.0f);

        livraria.cadastrarLivro(l1);
        livraria.cadastrarLivro(l2);
        livraria.cadastrarLivro(l3);

        System.out.println("SEJA BEM VINDO A LIVRARIA.....\nESCOLHA UMA DAS OPÇÕES ABAIXO:" +
                    "\n1)CONSULTAR LIVRO:" +
                    "\n2)EFETUAR VENDA:");

        Scanner scanner = new Scanner(System.in);
        int codigo = scanner.nextInt();

        if (codigo == 1) {
            System.out.println("Informe co código do livro que deseja Consultar:\n ");
            int codigo1 = scanner.nextInt();
            livraria.consultarLivro(codigo1);
        }
        if (codigo == 2) {
            System.out.println("Informe co código do livro que deseja Comprar\nR:");
            int codigo2 = scanner.nextInt();
            livraria.efetuarVenda(codigo2);
        }

    }
//
    }

