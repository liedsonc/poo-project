import java.util.ArrayList;
/**
 * Classe Projeto que representa um projeto de investigação
 * @author Liedson Correia
 * @author Deisylene Rocha
 * @version 1.0
 */
public class Projeto {
    // Variáveis de instância
    private int id;
    private String titulo;
    private double financiamento;
    private ArrayList<Investigador> investigadores;
    private ArrayList<InvColaborador> invColaboradores;

    /**
     * Construtor da classe Projeto
     * @param id ID do projeto
     * @param financiamento Valor do financiamento do projeto
     * @param titulo Título do projeto
     */
    public Projeto(int id, double financiamento, String titulo) {
        this.id = id;
        this.financiamento = financiamento;
        this.investigadores = new ArrayList<>();
        this.invColaboradores = new ArrayList<>();
        // Depois de consultar o Professor, foi decido que o título do projeto é válido
        this.titulo = titulo;
    }
    // Getters
    /**
     * Retorna o ID do projeto
     * @return ID do projeto
     */
    public int getId() {
        return id;
    }

    /**
     * Retorna o título do projeto
     * @return Título do projeto
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Retorna o valor do financiamento do projeto
     * @return Valor do financiamento
     */
    public double getFinanciamento() {
        return financiamento;
    }

    /**
     * Retorna a lista de investigadores associados ao projeto
     * @return ArrayList de Investigadores
     */
    public ArrayList<Investigador> getInvestigadores() {
        return investigadores;
    }

    /**
     * Retorna a lista de investigadores colaboradores associados ao projeto
     * @return ArrayList de InvColaboradores
     */
    public ArrayList<InvColaborador> getInvColaboradores() {
        return invColaboradores;
    }

    /**
     * Associa um investigador ao projeto
     * @param investigador Investigador a ser associado
     * @return true se o investigador foi associado com sucesso, false caso contrário
     */
    public boolean associarInvestigador(Investigador investigador) {
        if (!investigadores.contains(investigador)) {
            investigadores.add(investigador);
            investigador.associarProjeto(this);
            return true;
        }
        return false;
    }

    /**
     * Distribui a verba do projeto por todos os investigadores associados
     */
    public void distribuirVerbaPorInvestigador() {
        // Lógica para distribuir verba por investigador
        // Divide a verba por investigadores, caso estes existam
        if (!investigadores.isEmpty()) {
            double verbaPorInvestigador = financiamento / investigadores.size();
            for (Investigador investigador : investigadores) {
                investigador.adicionarInvSaldo(verbaPorInvestigador);
            }
        }

    }

    /**
     * Associa um investigador colaborador ao projeto
     * @param invColaborador Investigador Colaborador a ser associado
     * @return true se o investigador colaborador foi associado com sucesso, false caso contrário
     */
    public boolean associarInvColaborador(InvColaborador invColaborador) {
        // metodo para associar um Investigador Colaborador ao projeto
        // Verifica se o Investigador Colaborador já está associado ao projeto
        if (!invColaboradores.contains(invColaborador)) {
            invColaboradores.add(invColaborador);
            invColaborador.associarProjeto(this);
            return true;
        }
        return false;
    }

    /**
     * Metodo para imprimir os detalhes do projeto
     */
    public void printProjeto() {
        // metodo para imprimir os detalhes do projeto
        System.out.println("ID do Projeto: " + id + " Titulo: " + titulo + " Financiamento: " + financiamento);

        if (!investigadores.isEmpty()) {
            System.out.println("Investigadores associados:");
            for (Investigador investigador : investigadores) {
                System.out.println(" - ID: " + investigador.getId() + ", Nome: " + investigador.getNome());
            }
        }

        if(!invColaboradores.isEmpty()) {
            System.out.println("Investigadores Colaboradores associados:");
            for (InvColaborador invColaborador : invColaboradores) {
                System.out.println(" - ID: " + invColaborador.getId() + ", Nome: " + invColaborador.getNome());
            }
        }
    }

    /**
     * Metodo para imprimir os detalhes do projeto
     * Este metodo foi adicionado para atender ao pedido de impressão dos detalhes do projeto
     */
    public void printProjectos() {
        // metodo para imprimir os detalhes do projeto
        // Teria mais sentido este metodo estar na classe UNIAG, mas foi pedido que fosse na classe Projeto
        System.out.println("ID do Projeto: " + id + " Titulo: " + titulo + " Financiamento: " + financiamento);

        if (!investigadores.isEmpty()) {
            System.out.println("Investigadores associados:");
            for (Investigador investigador : investigadores) {
                System.out.println(" - ID: " + investigador.getId() + ", Nome: " + investigador.getNome());
            }
        }

        if(!invColaboradores.isEmpty()) {
            System.out.println("Investigadores Colaboradores associados:");
            for (InvColaborador invColaborador : invColaboradores) {
                System.out.println(" - ID: " + invColaborador.getId() + ", Nome: " + invColaborador.getNome());
            }
        }
    }
}
