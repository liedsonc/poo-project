import java.util.ArrayList;

public class InvColaborador extends MembroInvestigador{
    private ArrayList<Projeto> projetos;

    // Construtor da classe InvColaborador
    public InvColaborador(int i, String n) {
        super(i, n);
        this.projetos = new ArrayList<>();
    }

}

