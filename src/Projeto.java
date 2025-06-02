import java.util.ArrayList;

public class Projeto {
    private int id;
    private String titulo;
    private double financiamento;
    private ArrayList<Investigador> investigadores;

    // Construtor da classe Projeto
    public Projeto(int id, double financiamento) {
        this.id = id;
        this.financiamento = financiamento;
        this.investigadores = new ArrayList<>();
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
}
