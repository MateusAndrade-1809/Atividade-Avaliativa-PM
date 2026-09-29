import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Veterinario: ");
        String nomeVet = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Especialidade: ");
        String esp = sc.nextLine();
        System.out.print("Telefone: ");
        String tel = sc.nextLine();

        Veterinario vet = new Veterinario(nomeVet, cpf, esp, tel);

        System.out.print("Procedimento: ");
        String nomeProc = sc.nextLine();
        System.out.print("Duracao: ");
        int duracao = Integer.parseInt(sc.nextLine());
        System.out.print("Valor: ");
        double valor = Double.parseDouble(sc.nextLine().replace(",", "."));
        System.out.print("Complexidade: ");
        String complexidade = sc.nextLine();

        Procedimento proc = new Procedimento(nomeProc, duracao, valor, complexidade);

        System.out.print("Numero da sala: ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.print("Bloco: ");
        String bloco = sc.nextLine();
        System.out.print("Capacidade: ");
        int capacidade = Integer.parseInt(sc.nextLine());
        System.out.print("Tipo: ");
        String tipo = sc.nextLine();

        Sala sala = new Sala(numero, bloco, capacidade, tipo, vet);

        String op;
        do {
            System.out.print("Codigo: ");
            int codigo = Integer.parseInt(sc.nextLine());
            System.out.print("Animal: ");
            String animal = sc.nextLine();
            System.out.print("Especie: ");
            String especie = sc.nextLine();
            System.out.print("Tutor: ");
            String tutor = sc.nextLine();
            System.out.print("Data: ");
            String data = sc.nextLine();
            System.out.print("Horario: ");
            String horario = sc.nextLine();
            System.out.print("Status: ");
            String status = sc.nextLine();
            System.out.print("Observacoes: ");
            String obs = sc.nextLine();

            sala.adicionar(new Atendimento(
                    codigo, animal, especie, tutor, data, horario, status, obs, proc
            ));

            System.out.print("Outro atendimento? (s/n): ");
            op = sc.nextLine();
        } while (op.equalsIgnoreCase("s"));

        sala.listar();
        sc.close();
    }
}