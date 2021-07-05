package Modelo;

public class Distancia extends Oferta {
    private String url;

    public Distancia(int ano, int semestre, int turma, Disciplina disciplina, String url) {
        super(ano, semestre, turma, disciplina);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
