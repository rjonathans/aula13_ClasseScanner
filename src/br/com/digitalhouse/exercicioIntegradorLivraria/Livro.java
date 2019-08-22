package br.com.digitalhouse.exercicioIntegradorLivraria;

import java.awt.peer.LabelPeer;
import java.util.Objects;

public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private int anoLançamento;
    private int codigoISBN;
    private int quantidadeEstoque;
    private double preco;

    public Livro() {
    }

    public Livro(int codigo, String titulo, String autor, int anoLançamento, int codigoISBN, int quantidadeEstoque, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoLançamento = anoLançamento;
        this.codigoISBN = codigoISBN;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLançamento() {
        return anoLançamento;
    }

    public void setAnoLançamento(int anoLançamento) {
        this.anoLançamento = anoLançamento;
    }

    public int getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(int codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "\tCódigo: " + this.codigo +
                " \n\tTítulo: " +this.titulo+
                " \n\tAutor: " +this.autor +
                " \n\tAno de lançamento: " +this.anoLançamento +
                " \n\tCódigo ISBN: " +this.codigoISBN +
                " \n\tQuantidade Estoque: " +this.quantidadeEstoque +
                " \n\tPreço: R$" +this.preco;
    }
}
