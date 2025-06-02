public class MembroInvestigador {
    //Variáveis de instância
    private int id;
    private String nome;

    // Construtor da classe MembroInvestigador
    public MembroInvestigador(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    // Getters
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean associarProjeto(Projeto p) {
        // TODO: Implementar a lógica de associação de um projeto
        // Somente os investigadores e Investigadores Colaboradores podem associar projetos
        // can i create the method in the parent class and then override it in the child classes?
        return false;
    }
    public void print() {
        // Método para imprimir os detalhes do membro investigador
        System.out.println("ID: " + id + ", Nome: " + nome);
    }
}

