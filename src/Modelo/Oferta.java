package Modelo;

public class Oferta {
    private int ano;
    private int semestre;
    private int turma;
    private Disciplina disciplina;

    public Oferta(int ano, int semestre, int turma, Disciplina disciplina) {
        this.ano = ano;
        this.semestre = semestre;
        this.turma = turma;
        this.disciplina = disciplina;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
