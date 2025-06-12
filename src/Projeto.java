import java.util.ArrayList;

public class Projeto {
    private int id;
    private String titulo;
    private double financiamento;
    private ArrayList<Investigador> investigadores;
    private ArrayList<InvColaborador> invColaboradores;

    // Construtor da classe Projeto
    public Projeto(int id, double financiamento, String titulo) {
        this.id = id;
        this.financiamento = financiamento;
        this.investigadores = new ArrayList<>();
        this.invColaboradores = new ArrayList<>();
        // Depois de consultar o Professor, foi decido que o título do projeto é válido
        this.titulo = titulo;
    }
    // Getters
    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public double getFinanciamento() {
        return financiamento;
    }
    public ArrayList<Investigador> getInvestigadores() {
        return investigadores;
    }

    public boolean associarInvestigador(Investigador investigador) {
        if (!investigadores.contains(investigador)) {
            investigadores.add(investigador);
            investigador.associarProjeto(this);
            return true;
        }
        return false;
    }

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
