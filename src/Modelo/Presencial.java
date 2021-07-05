package Modelo;

public abstract class Presencial extends Oferta{
    private String diaSemana;
    private int hora;
    private int duracao;
    private Sala sala;

    public Presencial(int ano, int semestre, int turma, Disciplina disciplina, String diaSemana, int hora, int duracao,Sala sala) {
        super(ano, semestre, turma, disciplina);
        this.diaSemana = diaSemana;
        this.hora = hora;
        this.duracao = duracao;
        this.sala = sala;

    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
