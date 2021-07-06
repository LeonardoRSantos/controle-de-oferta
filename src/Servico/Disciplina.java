package Servico;

import javax.swing.*;
import java.awt.*;

public class Disciplina extends JFrame{

    public Disciplina(){
        // TITULO DA JANELA
        super("Disciplinas ");

        // CONFIGURAÇÕES DA JANELA PRINCIPAL
        this.dispose();
        this.setSize(530,260);
        this.setLayout(new FlowLayout());
        this.setVisible(false);
        criarFormulario(this);
    }

    private void criarFormulario(JFrame window){
        setLayout(new BorderLayout());

        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout(new FlowLayout());

        JLabel titulo = new JLabel("Disciplinas");
        titulo.setFont(new Font("Verdana", Font.PLAIN, 16));

        panelTitulo.add(titulo);

        JPanel panelCadastro = new JPanel();
        panelCadastro.setLayout(new FlowLayout());
        JLabel nomeLabel = new JLabel("Nome ");
        JTextField nomeField = new JTextField(40);

        panelCadastro.add(nomeLabel);
        panelCadastro.add(nomeField);

        JPanel panelBotoes = new JPanel();
        panelBotoes.setLayout(new FlowLayout());

        JButton botaoSalvar = new JButton("Novo");
        JButton botaoFechar = new JButton("Fechar");

        panelBotoes.add(botaoSalvar);
        panelBotoes.add(botaoFechar);

        window.getContentPane().add(panelTitulo, BorderLayout.NORTH);
        window.getContentPane().add(panelCadastro, BorderLayout.CENTER);
        window.getContentPane().add(panelBotoes, BorderLayout.SOUTH);

    }

}
