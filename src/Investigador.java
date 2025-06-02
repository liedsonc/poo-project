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
}
