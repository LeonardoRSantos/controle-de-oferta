package Servico;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame{
    public App(){
        super("Disciplinas Ofertadas: ");
        criarMenu();
        subItem();

    }

    public void criarMenu(){

        JMenu disciplinas = new JMenu("Cadastro");





        /*JMenuItem menuItemDisciplinas = new JMenuItem("Disciplinas");
        disciplinas.add(menuItemDisciplinas);*/

        //JMenuItem menuItemSalvar = new JMenuItem("Salvar");
        //disciplinas.add(menuItemSalvar);

        //JMenuItem menuItemFechar = new JMenuItem("Fechar");
        //disciplinas.add(menuItemFechar);

       /* menuItemDisciplinas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });*/

        JMenuBar barra = new JMenuBar();
        setJMenuBar(barra);
        barra.add(disciplinas);

    }
    public void subItem(){
        JFrame f2 = new JFrame("Disciplinas");
        /*f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setSize(530,260);
        f2.setLayout(new BorderLayout());
        setVisible(true);*/

    }


    private void criarFormulario(){
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

        add(panelTitulo, BorderLayout.NORTH);
        add(panelCadastro, BorderLayout.CENTER);
        add(panelBotoes, BorderLayout.SOUTH);


    }

}
