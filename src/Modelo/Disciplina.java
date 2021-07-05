package Modelo;

import java.util.ArrayList;

public class Disciplina {
    private int codigo;
    private int nome;
    private ArrayList<Oferta> oferta;

    public Disciplina(int codigo, int nome, ArrayList<Oferta> oferta) {
        this.codigo = codigo;
        this.nome = nome;
        this.oferta = oferta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public ArrayList<Oferta> getOferta() {
        return oferta;
    }

    public void setOferta(ArrayList<Oferta> oferta) {
        this.oferta = oferta;
    }
}
