import java.util.ArrayList;

public class UNIAG {
    // Variaveis de instância
    // ArrayLists para armazenar os diferentes tipos de entidades
    // Escolheu-se ArrayList pelas suas propriedades de indexação e flexibilidade
    private ArrayList<Projeto> projetos;
    private ArrayList<Investigador> investigadores;
    private ArrayList<InvColaborador> invColaboradores;

    // Construtor da classe UNIAG
    public UNIAG() {
        this.projetos = new ArrayList<>();
        this.investigadores = new ArrayList<>();
        this.invColaboradores = new ArrayList<>();
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }
    public ArrayList<Investigador> getInvestigadores() {
        return investigadores;
    }
    public ArrayList<InvColaborador> getInvColaboradores() {
        return invColaboradores;
    }

    public boolean addProjeto(int id, double fin, String titulo) {
        Projeto projeto = new Projeto(id, fin, titulo);
        return this.projetos.add(projeto);
    }

    public boolean addInvestigador(int id, String nome) {
        Investigador investigador = new Investigador(id, nome);
        return this.investigadores.add(investigador);
    }

    public boolean addInvColaborador(int id, String nome) {
        InvColaborador invColaborador = new InvColaborador(id, nome);
        return this.invColaboradores.add(invColaborador);
    }

    public void addVisitante(int id, String nome) {
        new Visitante(id, nome);
    }

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

    public boolean distribuirVerbaPorInvestigador(int idProj) {
        Projeto projeto = findProjeto(idProj);
        if (projeto != null) {
            projeto.distribuirVerbaPorInvestigador();
            return true;
        }
        return false;
    }

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

    public Projeto findProjeto(int id) {
        for(Projeto projeto : this.projetos) {
            if (projeto.getId() == id) {
                return projeto;
            }
        }

        return null;
    }

    public Investigador findInvestigador(int id) {
        for(Investigador investigador : this.investigadores) {
            if (investigador.getId() == id) {
                return investigador;
            }
        }

        return null;
    }

    // Este metodo não está implementado corretamente, pois a classe UNIAG não tem uma lista de visitantes
    // Mas esta presente na classe seguindo o Diagrama UML
    public Visitante findVisitante(int id) {
        return null;
    }

    public InvColaborador findInvColaborador(int id) {
        for(InvColaborador invColaborador : this.invColaboradores) {
            if (invColaborador.getId() == id) {
                return invColaborador;
            }
        }

        return null;
    }
}