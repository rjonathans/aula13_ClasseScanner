package br.com.digitalhouse;

//import java.awt.Color;
//import java.awt.Container;
//import java.awt.Dimension;
//import java.awt.FlowLayout;
//import java.awt.event.*;
//import javax.swing.*;
//
//public class Listas extends JFrame /*implements ActionListener*/ {
//
//    public Listas() {
//    }
//
//    public void janelaSimples() {
//
//
//        Container cont = getContentPane();
//        /* Cria o botão */
//        final JButton botaoLimpa = new JButton("Limpa");
//        /* Cria o campo de texto */
//        final JTextField campoTexto = new JTextField(10);
//        /* Cria uma janela */
//        final JFrame janela = new JFrame("Janela Simples");
//        janela.pack();
//        setLocationRelativeTo(null);
//        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        /* Adiciona os componentes na janela */
//        //JPanel painel = new JPanel();;
//        janela.add(botaoLimpa);
//        janela.add(campoTexto);
//        cont.add(janela);
//        //janela.getContentPane().add(painel);
//        /* Quando o usuário clicar no botao, limpa o campo de texto */
//        botaoLimpa.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                campoTexto.setText("bla,bla teste");
//            }
//        });
//        /* Exibe a janela */
//        janela.setVisible(true);
//
//    }
//}