
import java.util.ArrayList;

public class Sala {
     private int numero, capacidade;
    private String bloco, tipo;
    private Veterinario veterinario;
    private ArrayList<Atendimento> atendimentos = new ArrayList<>();

    public Sala(int numero, String bloco, int capacidade, String tipo, Veterinario veterinario) {
        this.numero = numero;
        this.bloco = bloco;
        this.capacidade = capacidade;
        this.tipo = tipo;
        this.veterinario = veterinario;
    }

    public void adicionar(Atendimento a) {
        boolean mesmoProcedimento = atendimentos.isEmpty() ||
                atendimentos.get(0).getProcedimento().getNome()
                        .equalsIgnoreCase(a.getProcedimento().getNome());

        if (atendimentos.size() < capacidade && mesmoProcedimento) {
            atendimentos.add(a);
            System.out.println("Atendimento cadastrado.");
        } else {
            System.out.println("Sala cheia ou procedimento diferente.");
        }
    }

    public void listar() {
        System.out.println("\nSala " + numero + " - Veterinario: " + veterinario.getNome());
        for (Atendimento a : atendimentos) {
            System.out.println(a);
        }
    }
}
