package entities;
public class Veterinario {
    private String nome, cpf, especialidade, telefone;

    public Veterinario(String nome, String cpf, String especialidade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
}
