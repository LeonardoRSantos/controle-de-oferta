package Servico;

import javax.swing.*;
import java.awt.*;

public class Disciplina extends JFrame{
    String [] colunas = {"ID", "Nome"};
    Object [][] dados = {
            {1, "Portugues"},
            {2, "Matematica"},
            {3, "Programação"},
            {1, "Portugues"},
            {2, "Matematica"},
            {3, "Programação"},
            {1, "Portugues"},
            {2, "Matematica"},
            {3, "Programação"},
            {1, "Portugues"},
            {2, "Matematica"},
            {3, "Programação"},
            {1, "Portugues"},
            {2, "Matematica"},
            {3, "Programação"},

    };

    public Disciplina(){
        // TITULO DA JANELA
        super("Disciplinas ");

        // CONFIGURAÇÕES DA JANELA PRINCIPAL
        this.dispose();
        this.setSize(530,260);
        this.setLayout(new FlowLayout());
        this.setVisible(false);
        criaFormulario(this);

    }

    private void criaFormulario(JFrame window){
        setLayout(new BorderLayout());

        JPanel panelCadastro = new JPanel();
        panelCadastro.setLayout(new FlowLayout());
        JLabel nomeLabel = new JLabel("Nome ");
        JTextField nomeField = new JTextField(30);

        panelCadastro.add(nomeLabel);
        panelCadastro.add(nomeField);

        // TABELA
        JPanel panelTabela = new JPanel(new GridLayout());
        panelTabela.setLayout(new FlowLayout());
        JTable tabela = new JTable(dados, colunas);
        tabela.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        JScrollPane barraRolagem = new JScrollPane(tabela, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        barraRolagem.setEnabled(true);
        panelTabela.add(barraRolagem);

        JPanel panelBotoes = new JPanel();
        panelBotoes.setLayout(new FlowLayout());

        JButton botaoSalvar = new JButton("Novo");
        JButton botaoFechar = new JButton("Fechar");

        panelBotoes.add(botaoSalvar);
        panelBotoes.add(botaoFechar);

        window.getContentPane().add(panelCadastro, BorderLayout.NORTH);
        window.getContentPane().add(panelTabela);
        window.getContentPane().add(panelBotoes, BorderLayout.SOUTH);

    }

}
