public class TesteUNIAG {
    public static void main(String[] args) {
        // Criação de um investigador}
        UNIAG uniag = new UNIAG();
        uniag.addInvestigador(1, "João Silva");
        System.out.println(uniag.getInvestigadores());

        Investigador inv1 = new Investigador(1, "João Silva");
        Investigador inv2 = new Investigador(2, "Pedro Silva");
        inv1.adicionarInvSaldo(1000.0);

        // Criação de um projeto
        Projeto proj1 = new Projeto(101, 5000.0, "Projeto de Pesquisa A");
        proj1.associarInvestigador(inv1);
        proj1.associarInvestigador(inv2);
        proj1.distribuirVerbaPorInvestigador();
        // Imprimir detalhes do investigador
        inv1.print();
        System.out.println("-------------------");
        // Imprimir detalhes do projeto
        proj1.printProjeto();
        System.out.println("-------------------");
        // Criação de um investigador colaborador
        InvColaborador invColab1 = new InvColaborador(2, "Maria Costa");
        proj1.associarInvColaborador(invColab1);
        // Imprimir detalhes do investigador colaborador
        invColab1.print();
        System.out.println("-------------------");
        // Associar o investigador colaborador ao projeto
        proj1.associarInvColaborador(invColab1);
        // Imprimir detalhes do projeto novamente para verificar a associação
        proj1.printProjeto();
        System.out.println("-------------------");


    }
}
