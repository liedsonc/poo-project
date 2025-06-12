import java.util.ArrayList;
/**
 * Classe principal UNIAG que representa a unidade de investigação
 * @author Liedson Correia
 * @author Deisylene Rocha
 * @version 1.0
 */
public class UNIAG {
    // Variaveis de instância
    // ArrayLists para armazenar os diferentes tipos de entidades
    // Escolheu-se ArrayList pelas suas propriedades de indexação e flexibilidade
    private ArrayList<Projeto> projetos;
    private ArrayList<Investigador> investigadores;
    private ArrayList<InvColaborador> invColaboradores;

    /**
     * Construtor da classe UNIAG
     * Inicializa as listas de projetos, investigadores e investigadores colaboradores
     */
    public UNIAG() {
        this.projetos = new ArrayList<>();
        this.investigadores = new ArrayList<>();
        this.invColaboradores = new ArrayList<>();
    }

    // Getters
    /**
     * Retorna a lista de projetos
     * @return ArrayList de Projetos
     */
    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    /**
     * Retorna a lista de investigadores
     * @return ArrayList de Investigadores
     */
    public ArrayList<Investigador> getInvestigadores() {
        return investigadores;
    }

    /**
     * Retorna a lista de investigadores colaboradores
     * @return ArrayList de InvColaboradores
     */
    public ArrayList<InvColaborador> getInvColaboradores() {
        return invColaboradores;
    }

    /**
     * Adiciona um projeto à lista de projetos
     * @param id ID do projeto
     * @param fin Valor do financiamento do projeto
     * @param titulo Título do projeto
     * @return
     */
    public boolean addProjeto(int id, double fin, String titulo) {
        Projeto projeto = new Projeto(id, fin, titulo);
        return this.projetos.add(projeto);
    }

    /**
     * Adiciona um investigador à lista de investigadores
     * @param id ID do investigador
     * @param nome Nome do investigador
     * @return true se o investigador foi adicionado com sucesso, false caso contrário
     */
    public boolean addInvestigador(int id, String nome) {
        Investigador investigador = new Investigador(id, nome);
        return this.investigadores.add(investigador);
    }

    /**
     * Adiciona um investigador colaborador à lista de investigadores colaboradores
     * @param id ID do investigador colaborador
     * @param nome Nome do investigador colaborador
     * @return true se o investigador colaborador foi adicionado com sucesso, false caso contrário
     */
    public boolean addInvColaborador(int id, String nome) {
        InvColaborador invColaborador = new InvColaborador(id, nome);
        return this.invColaboradores.add(invColaborador);
    }

    /**
     * Adiciona um visitante à lista de visitantes
     * Nota: A classe Visitante não está implementada, mas segue o Diagrama UML
     * @param id ID do visitante
     * @param nome Nome do visitante
     */
    public void addVisitante(int id, String nome) {
        new Visitante(id, nome);
    }

    /**
     * Associa um membro (investigador ou investigador colaborador) a um projeto
     * @param idMembro ID do membro a ser associado
     * @param idProjeto ID do projeto ao qual o membro será associado
     * @return true se a associação foi bem-sucedida, false caso contrário
     */
    public boolean associarMembroProjeto(int idMembro, int idProjeto) {
        for(Investigador investigador : this.investigadores) {
            if (investigador.getId() == idMembro) {
                for(Projeto projeto : this.projetos) {
                    if (projeto.getId() == idProjeto) {
                        return investigador.associarProjeto(projeto);
                    }
                }
            }
        }

        for(InvColaborador invColaborador : this.invColaboradores) {
            if (invColaborador.getId() == idMembro) {
                for(Projeto projeto : this.projetos) {
                    if (projeto.getId() == idProjeto) {
                        return invColaborador.associarProjeto(projeto);
                    }
                }
            }
        }

        return false;
    }

    /**
     * Distribui a verba de um projeto entre os investigadores associados
     * @param idProj ID do projeto
     * @return true se a distribuição foi bem-sucedida, false caso contrário
     */
    public boolean distribuirVerbaPorInvestigador(int idProj) {
        Projeto projeto = findProjeto(idProj);
        if (projeto != null) {
            projeto.distribuirVerbaPorInvestigador();
            return true;
        }
        return false;
    }

    /**
     * Mostra os membros (investigadores e investigadores colaboradores) da UNIAG
     */
    public void mostrarMembros() {
        System.out.println("Investigadores:");

        for(Investigador investigador : this.investigadores) {
            investigador.print();
        }

        System.out.println("Investigadores Colaboradores:");

        for(InvColaborador invColaborador : this.invColaboradores) {
            invColaborador.print();
        }

    }

    /**
     * Mostra os projetos da UNIAG
     */
    public Projeto findProjeto(int id) {
        for(Projeto projeto : this.projetos) {
            if (projeto.getId() == id) {
                return projeto;
            }
        }

        return null;
    }

    /**
     * Encontra um investigador pelo ID
     * @param id ID do investigador
     * @return Investigador correspondente ao ID, ou null se não encontrado
     */
    public Investigador findInvestigador(int id) {
        for(Investigador investigador : this.investigadores) {
            if (investigador.getId() == id) {
                return investigador;
            }
        }

        return null;
    }

    /**
     * Encontra um visitante pelo ID
     * Warning: Este metodo não está implementado corretamente, pois a classe UNIAG não tem uma lista de visitantes
     * Segue o Diagrama UML
     * @param id ID do visitante
     * @return Visitante correspondente ao ID, ou null se não encontrado
     */
    public Visitante findVisitante(int id) {
        return null;
    }

    /**
     * Encontra um investigador colaborador pelo ID
     * @param id ID do investigador colaborador
     * @return Investigador colaborador correspondente ao ID, ou null se não encontrado
     */
    public InvColaborador findInvColaborador(int id) {
        for(InvColaborador invColaborador : this.invColaboradores) {
            if (invColaborador.getId() == id) {
                return invColaborador;
            }
        }

        return null;
    }
}