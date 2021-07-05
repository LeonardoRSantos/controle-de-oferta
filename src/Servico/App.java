package Servico;


import Modelo.Disciplina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame{
    public App(){
        // TITULO DA JANELA PRINCIPAL
        super("Disciplinas Ofertadas: ");

        // CRIA MENU NA JANELA PRINCIPAL
        this.criarMenu();

        // CONFIGURAÇÕES DA JANELA PRINCIPAL
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(530,260);
        this.setLayout(new FlowLayout());

        JPanel panelTitulo = new JPanel();
        JLabel titulo = new JLabel("Bem vindo");
        titulo.setFont(new Font("Verdana", Font.BOLD, 16));
        panelTitulo.add(titulo);
        this.getContentPane().add(panelTitulo, CENTER_ALIGNMENT);

        this.setVisible(true);
    }

    public void criarMenu(){
        JMenu menu = new JMenu("Opções");
        this.subItem(menu, "Disciplina");
        this.subItem(menu, "Sala");

        JMenuBar barra = new JMenuBar();
        setJMenuBar(barra);
        barra.add(menu);

    }
    public void subItem(JMenu menu, String title){
        JFrame f2 = new JFrame(title);
        f2.dispose();
        f2.setSize(530,260);
        f2.setLayout(new BorderLayout());
        criarFormulario(f2);
        JMenuItem menuItemDisciplinas = new JMenuItem(new AbstractAction(title) {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f2.setVisible(true);
            }
        });

        menu.add(menuItemDisciplinas);
    }


    private void criarFormulario(JFrame window){
        setLayout(new BorderLayout());

        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout(new FlowLayout());

        JLabel titulo = new JLabel("Cadastro De Disciplinas");
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
