package Servico;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    public MainFrame(){
        // TITULO DA JANELA PRINCIPAL
        super("Controle de oferta");

        // CONFIGURAÇÕES DA JANELA PRINCIPAL
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(530,260);
        this.setLayout(new FlowLayout());

        // MENU NA JANELA PRINCIPAL
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu optionsMenu = new JMenu("Opções");
        menuBar.add(optionsMenu);
        this.subItem(optionsMenu, "Disciplina", new Disciplina());

        // MENSAGEM
        JPanel panelTitulo = new JPanel();
        JLabel titulo = new JLabel("Bem vindo");
        titulo.setFont(new Font("Verdana", Font.BOLD, 16));
        panelTitulo.add(titulo);

        // ADICIONA OS COMPONENTES AO JFRAME
        this.getContentPane().add(panelTitulo);
    }

    private void subItem(JMenu menu, String title, JFrame window){
        JMenuItem menuItemDisciplinas = new JMenuItem(new AbstractAction(title) {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                window.setVisible(true);
            }
        });

        menu.add(menuItemDisciplinas);
    }

}
