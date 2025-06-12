import java.util.Scanner;

public class TesteUNIAGTerminal {
    private static final UNIAG uniag = new UNIAG();
    private static final Scanner scanner = new Scanner(System.in);
    private static final AcoesMenu acoesMenu = new AcoesMenu(uniag, scanner);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n===== Menu Uniag =====");
            System.out.println("1. Gerir Investigadores");
            System.out.println("2. Gerir Investigadores Colaboradores");
            System.out.println("3. Gerir Projetos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    acoesMenu.menuInvestigadores();
                    break;
                case 2:
                    acoesMenu.menuColaboradores();
                    break;
                case 3:
                    acoesMenu.menuProjetos();
                    break;
                case 0:
                    System.out.println("A sair...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }
}