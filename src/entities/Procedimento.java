package entities;
public class Procedimento {
    private String nome, complexidade;
    private int duracao;
    private double valor;

    public Procedimento(String nome, int duracao, double valor, String complexidade) {
        this.nome = nome;
        this.duracao = duracao;
        this.valor = valor;
        this.complexidade = complexidade;
    }

    public String getNome() {
        return nome;
    }
}
