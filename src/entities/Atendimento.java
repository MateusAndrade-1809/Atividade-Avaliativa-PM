package entities;
public class Atendimento {
    private int codigo;
    private String animal, especie, tutor, data, horario, status, observacoes;
    private Procedimento procedimento;

    public Atendimento(int codigo, String animal, String especie, String tutor, String data,
                       String horario, String status, String observacoes, Procedimento procedimento) {
        this.codigo = codigo;
        this.animal = animal;
        this.especie = especie;
        this.tutor = tutor;
        this.data = data;
        this.horario = horario;
        this.status = status;
        this.observacoes = observacoes;
        this.procedimento = procedimento;
    }
     public Procedimento getProcedimento() {
        return procedimento;
    }

    public String toString() {
        return codigo + " - " + animal + " - " + status;
    }
}
