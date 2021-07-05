package Modelo;

public class Intensiva extends Presencial {
    private String dataInic;
    private String dataFim;

    public Intensiva(int ano, int semestre, int turma, Disciplina disciplina, String diaSemana, int hora, int duracao, Sala sala, String dataInic, String dataFim) {
        super(ano, semestre, turma, disciplina, diaSemana, hora, duracao, sala);
        this.dataInic = dataInic;
        this.dataFim = dataFim;
    }

    public String getDataInic() {
        return dataInic;
    }

    public void setDataInic(String dataInic) {
        this.dataInic = dataInic;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
}
