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
    // Métodos para adicionar entidades
    public boolean addProjeto(int id, double fin) {
        // FIXME: Can I add the title as well?
        Projeto projeto = new Projeto(id, fin);
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
    // FIXME: Does it make sanse to have a method to add visitantes?
    // Since visitantes do not directly related to UNIAG
//    public boolean addVisitante(int id, String nome) {
//        Visitante visitante = new Visitante(id, nome);
//        return this.
//    }

    public boolean associarMembroProjeto(int idMembro, int idProjeto) {
        // Método para associar um membro a um projeto
        // Verifica se o membro é um Investigador ou InvColaborador
        for (Investigador investigador : investigadores) {
            if (investigador.getId() == idMembro) {
                for (Projeto projeto : projetos) {
                    if (projeto.getId() == idProjeto) {
                        return investigador.associarProjeto(projeto);
                    }
                }
            }
        }
        for (InvColaborador invColaborador : invColaboradores) {
            if (invColaborador.getId() == idMembro) {
                for (Projeto projeto : projetos) {
                    if (projeto.getId() == idProjeto) {
                        return invColaborador.associarProjeto(projeto);
                    }
                }
            }
        }
        return false;
    }

    public boolean distribuirVerbaPorInvestigador(int idProj) {

        return true;
    }


}
