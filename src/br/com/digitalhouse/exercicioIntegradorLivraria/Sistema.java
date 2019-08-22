package br.com.digitalhouse.exercicioIntegradorLivraria;

import java.io.IOException;

public interface Sistema {

    public void cadastrarLivro(Livro livro);
    public void consultarLivro(int codigo) throws InterruptedException, IOException;
    public void efetuarVenda(int codigo);

}
