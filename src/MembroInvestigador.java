/**
 * Superclasse para investigadores, investigadores colaboradores e visitantes.
 * * @author Liedson Correia
 * @author Deisylene Rocha
 * @version 1.0
 */

public class MembroInvestigador {
    //Variáveis de instância
    private int id;
    private String nome;

    // Construtor da classe MembroInvestigador

    /**
     * Construtor da classe MembroInvestigador
     * @param id ID do membro investigador
     * @param nome Nome do membro investigador
     */
    public MembroInvestigador(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    // Getters
    /**
     * Retorna o ID do membro investigador
     * @return ID do membro investigador
     */
    public int getId() {
        return id;
    }

    /**
     * Retorna o nome do membro investigador
     * @return Nome do membro investigador
     */
    public String getNome() {
        return nome;
    }

    // Setters
    /**
     * Define o ID do membro investigador
     * @param id ID do membro investigador
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Define o nome do membro investigador
     * @param nome Nome do membro investigador
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Associa um projeto ao membro investigador.
     * Metodo deve ser sobrescrito nas subclasses
     * @param p Projeto a ser associados
     * @return
     */
    public boolean associarProjeto(Projeto p) {
        // Metodo deve ser sobrescrito nas subclasses
        return false;
    }

    /**
     * Metodo para imprimir os detalhes do membro investigador.
     */
    public void print() {
        System.out.println("ID: " + id + ", Nome: " + nome);
    }
}

