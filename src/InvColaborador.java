import java.util.ArrayList;

/**
 * Classe InvColaborador que representa um investigador colaborador
 * @author Liedson Correia
 * @author Deisylene Rocha
 * @version 1.0
 */
public class InvColaborador extends MembroInvestigador{
    private ArrayList<Projeto> projetos;

    // Construtor da classe InvColaborador

    /**
     *
     * @param i ID do investigador colaborador
     * @param n Nome do investigador colaborador
     */
    public InvColaborador(int i, String n) {
        super(i, n);
        this.projetos = new ArrayList<>();
    }

    // Getters
    /**
     * Retorna a lista de projetos associados ao investigador colaborador
     * @return ArrayList de Projetos
     */
    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    /**
     * Mostra os detalhes do investigador colaborador
     */
    @Override
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

