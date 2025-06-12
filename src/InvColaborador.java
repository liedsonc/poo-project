import java.util.ArrayList;

public class InvColaborador extends MembroInvestigador{
    private ArrayList<Projeto> projetos;

    // Construtor da classe InvColaborador
    public InvColaborador(int i, String n) {
        super(i, n);
        this.projetos = new ArrayList<>();
    }

    // Getters
    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public void print() {
        // metodo para imprimir os detalhes do investigador colaborador
        System.out.println("Investigador Colaborador: ");
        System.out.println("ID: " + getId() + ", Nome: " + getNome());
        System.out.println("Projetos associados:");
        for (Projeto projeto : projetos) {
            System.out.println(" - Projeto ID: " + projeto.getId() + ", Título: " + projeto.getTitulo());
        }
    }
}

