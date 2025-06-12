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
    // Método para associar um projeto ao membro investigador
    // Metodo deve ser sobrescrito nas subclasses
    public boolean associarProjeto(Projeto p) {
        return false;
    }

    public void print() {
        // Método para imprimir os detalhes do membro investigador
        System.out.println("ID: " + id + ", Nome: " + nome);
    }
}

