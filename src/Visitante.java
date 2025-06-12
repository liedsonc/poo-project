public class Visitante extends MembroInvestigador{
    public Visitante(int id, String nome) {
        super(id, nome);
    }

    @Override
    public void print() {
        // metodo para imprimir os detalhes do visitante
        System.out.println("Visitante ID: " + getId() + ", Nome: " + getNome());
    }
}
