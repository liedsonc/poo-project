import java.util.ArrayList;

/**
 * Classe Investigador que representa um investigador
 * @author Liedson Correia
 * @author Deisylene Rocha
 * @version 1.0
 */

public class Investigador extends MembroInvestigador{

    // Variáveis de instância
    private ArrayList<Projeto> projetos;
    private double saldo;

    /**
     * Construtor da classe Investigador
     * @param id ID do investigador
     * @param nome Nome do investigador
     */
    public Investigador(int id, String nome) {
        super(id, nome);
        this.projetos = new ArrayList<>();
        this.saldo = 0.0;
    }

    // Getters
    /**
     * Retorna a lista de projetos associados ao investigador
     * @return ArrayList de Projetos
     */
    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    /**
     * Retorna o saldo do investigador
     * @return Saldo do investigador
     */
    public double getSaldo() {
        return saldo;
    }

    // Setters
    /**
     * Define o saldo do investigador
     * @param saldo Saldo a ser definido
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Associa um projeto ao investigador
     * @param p Projeto a ser associado
     * @return true se o projeto foi associado com sucesso, false caso contrário
     */
    @Override
    public boolean associarProjeto(Projeto p) {
        if (!projetos.contains(p)) {
            projetos.add(p);
            p.associarInvestigador(this);
            return true;
        }
        return false;
    }

    /**
     * Adiciona um valor ao saldo do investigador
     * @param val Valor a ser adicionado
     * @return true se o valor foi adicionado com sucesso, false se o valor for negativo
     */
    public boolean adicionarInvSaldo(double val) {
        if (val > 0) {
            this.saldo += val;
            return true;
        }
        return false;
    }

    /**
     * Mostra os detalhes do investigador
     */
    @Override
    public void print() {
        // metodo para imprimir os detalhes do investigador
        System.out.println("Investigador: ");
        System.out.println("ID: " + getId() + ", Nome: " + getNome() + ", Saldo: " + saldo);
        System.out.println("Projetos associados:");
        for (Projeto projeto : projetos) {
            System.out.println(" - Projeto ID: " + projeto.getId() + ", Título: " + projeto.getTitulo());
        }
    }
}
