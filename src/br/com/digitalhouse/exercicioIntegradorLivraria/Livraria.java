package br.com.digitalhouse.exercicioIntegradorLivraria;

import javax.swing.plaf.PanelUI;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livraria implements Sistema {

    private List<Livro> livros = new ArrayList<>();
    private Livro esseLivro = new Livro();
    private int resposta = 0;
    private Livro livroEncontrado = null;
    private Livro livroBuscado = null;
    Scanner digitado = new Scanner(System.in);


    @Override
    public void cadastrarLivro(Livro livro) {
        this.livros.add(livro);
        System.out.println("CADASTRANDO LIVRO..... \n*****************************************\nDetalhes do Livro : " +
                livro + "\n" + livro.getTitulo() + " cadastrado com sucesso!\n*****************************************\n");

    }


    @Override
    public void consultarLivro(int codigo) throws InterruptedException, IOException {
        Livro livroProcurado = null;
        for (Livro esseLivro : livros) {
            if (esseLivro.getCodigo() == codigo) {
                livroProcurado = esseLivro;
            }
        }
        if (livroProcurado != null) {
            System.out.println("CONSULTANDO LIVRO.....\n************************************\nLivro encontrado :" +
                    livroProcurado + "\n************************************");

        } else {
            System.out.println("Procurando... ");
            String anim = "|/-\\";
            for (int x = 0; x <= 100; x++) {
                String data = "\r" + anim.charAt(x % anim.length()) + " " + x;
                System.out.write(data.getBytes());
                Thread.sleep(codigo);
            }
            System.out.println("\nTitulo de codigo: " + codigo +
                    " não foi encontrado!\n**************************************\n");
        }
    }

    public void vendendo() {
        livroEncontrado.setQuantidadeEstoque(livroEncontrado.getQuantidadeEstoque() - 1);
        System.out.println("Parabens! Voce adquiriu " + livroEncontrado +
                " Uma excelente aquisição!" + "\n O Estoque atualizado é de :" +
                livroEncontrado.getQuantidadeEstoque() + "\n*******************************\nTITULO COMPRADO COM SUCESSO.\n*******************************");
    }

    @Override
    public void efetuarVenda(int codigo) {


        for (Livro livrobuscado : livros) {

            if (codigo == livrobuscado.getCodigo()) {
                livroEncontrado = livrobuscado;
            }
            if (livroEncontrado == livrobuscado) {
                if (livroEncontrado.getQuantidadeEstoque() <= 0) {
                    System.out.println("Não temos esse Volume em estoque! ");
                } else {

                    System.out.println("TITULO ENCONTRADO DESEJA COMPRAR?\n1)SIM\n2)NÃO\nR:");
                    Scanner digitado = new Scanner(System.in);
                    resposta = digitado.nextInt();
                    if (resposta == 1) {
                        vendendo();
                    } else {
                        System.out.println("*******************************\nCOMPRA CANCELADA.\n*******************************");
                    }


                }

            } else {
                System.out.println("Livro não encontrado");
            }


        }
    }
}