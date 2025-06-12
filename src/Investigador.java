import java.util.ArrayList;
public class Investigador extends MembroInvestigador{
    private ArrayList<Projeto> projetos;
    private double saldo;

    // Construtor da classe Investigador
    public Investigador(int id, String nome) {
        super(id, nome);
        this.projetos = new ArrayList<>();
        this.saldo = 0.0;
    }

    // Getters
    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }
    public double getSaldo() {
        return saldo;
    }
    // Setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean associarProjeto(Projeto p) {
        if (!projetos.contains(p)) {
            projetos.add(p);
            p.associarInvestigador(this);
            return true;
        }
        return false;
    }

    public boolean adicionarInvSaldo(double val) {
        if (val > 0) {
            this.saldo += val;
            return true;
        }
        return false;
    }

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
