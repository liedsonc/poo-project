/**
 * Classe Visitante, que representa um membro visitante.
 * @author Liedson Correia
 * @author Deisylene Rocha
 * @version 1.0
 */


public class Visitante extends MembroInvestigador{

    /**
     * Construtor da classe Visitante
     * @param id ID do visitante
     * @param nome Nome do visitante
     */
    public Visitante(int id, String nome) {
        super(id, nome);
    }

    /**
     * Mostra os detalhes do visitante
     */
    @Override
    public void print() {
        // metodo para imprimir os detalhes do visitante
        System.out.println("Visitante ID: " + getId() + ", Nome: " + getNome());
    }
}
