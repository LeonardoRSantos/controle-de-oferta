package Servico;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame{
    public App(){
        // TITULO DA JANELA PRINCIPAL
        super("Controle de oferta");

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

    private void criarMenu(){
        JMenu menu = new JMenu("Opções");
        this.subItem(menu, "Disciplina", new Disciplina());
//        this.subItem(menu, "Sala");

        JMenuBar barra = new JMenuBar();
        setJMenuBar(barra);
        barra.add(menu);

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
