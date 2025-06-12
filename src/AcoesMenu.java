import java.util.Scanner;

/**
 * Classe Para gerir as ações do menu da aplicação UNIAG.
 * @author Liedson Correia
 * @author Deisylene Rocha
 * @version 1.0
 */
public class AcoesMenu {
    private final UNIAG uniag;
    private final Scanner scanner;

    public AcoesMenu(UNIAG uniag, Scanner scanner) {
        this.uniag = uniag;
        this.scanner = scanner;
    }

    public void menuInvestigadores() {
        int opcao;
        do {
            System.out.println("\n--- Gerir Investigadores ---");
            System.out.println("1. Adicionar Investigador");
            System.out.println("2. Associar Investigador a Projeto");
            System.out.println("3. Listar Investigadores");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    int novoId = uniag.getInvestigadores().size() + 1;
                    uniag.addInvestigador(novoId, nome);
                    System.out.println("Investigador adicionado com ID automático.");
                    break;
                case 2:
                    associarInvestigadorAProjeto();
                    break;
                case 3:
                    System.out.println("\n--- Lista de Investigadores ---");
                    for (Investigador inv : uniag.getInvestigadores()) {
                        inv.print();
                        System.out.println("___________________________");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }

    public void menuColaboradores() {
        int opcao;
        do {
            System.out.println("\n--- Gerir Investigadores Colaboradores ---");
            System.out.println("1. Adicionar Colaborador");
            System.out.println("2. Associar Colaborador a Projeto");
            System.out.println("3. Listar Colaboradores");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    int novoId = uniag.getInvColaboradores().size() + 1;
                    uniag.addInvColaborador(novoId, nome);
                    System.out.println("Colaborador adicionado com ID automático.");
                    break;
                case 2:
                    associarColaboradorAProjeto();
                    break;
                case 3:
                    System.out.println("\n--- Lista de Colaboradores ---");
                    for (InvColaborador colab : uniag.getInvColaboradores()) {
                        colab.print();
                        System.out.println("___________________________");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }

    public void menuProjetos() {
        int opcao;
        do {
            System.out.println("\n--- Gerir Projetos ---");
            System.out.println("1. Adicionar Projeto");
            System.out.println("2. Listar Projetos");
            System.out.println("3. Associar Investigador a Projeto");
            System.out.println("4. Associar Colaborador a Projeto");
            System.out.println("5. Distribuir Verba por Investigadores");
            System.out.println("6. Criar Visitante (sem associação)");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Financiamento: ");
                    double fin = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    int novoId = uniag.getProjetos().size() + 1;
                    uniag.addProjeto(novoId, fin, titulo);
                    System.out.println("Projeto adicionado com ID automático.");
                    break;
                case 2:
                    System.out.println("\n--- Lista de Projetos ---");
                    for (Projeto p : uniag.getProjetos()) {
                        p.printProjeto();
                    }
                    break;
                case 3:
                    associarInvestigadorAProjeto();
                    break;
                case 4:
                    associarColaboradorAProjeto();
                    break;
                case 5:
                    listarProjetos();
                    System.out.print("Selecione o ID do Projeto para distribuir verba: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Projeto p = uniag.findProjeto(id);
                    if (p != null) {
                        p.distribuirVerbaPorInvestigador();
                        System.out.println("Verba distribuída.");
                    } else {
                        System.out.println("Projeto não encontrado.");
                    }
                    break;
                case 6:
                    System.out.print("Nome do Visitante: ");
                    String nome = scanner.nextLine();
                    Visitante visitante = new Visitante(0, nome);
                    visitante.print();
                    System.out.println("Visitante criado (não armazenado).");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }

    private void associarInvestigadorAProjeto() {
        System.out.println("\nLista de Investigadores:");
        for (Investigador inv : uniag.getInvestigadores()) {
            System.out.println("ID: " + inv.getId() + " Nome: " + inv.getNome());
        }
        System.out.print("Selecione o ID do Investigador: ");
        int idInv = scanner.nextInt();
        scanner.nextLine();

        listarProjetos();
        System.out.print("Selecione o ID do Projeto: ");
        int idProj = scanner.nextInt();
        scanner.nextLine();

        boolean sucesso = uniag.associarMembroProjeto(idInv, idProj);
        if (sucesso) {
            System.out.println("Associação realizada com sucesso.");
        } else {
            System.out.println("Erro ao associar Investigador ao Projeto.");
        }
    }

    private void associarColaboradorAProjeto() {
        System.out.println("\nLista de Colaboradores:");
        for (InvColaborador colab : uniag.getInvColaboradores()) {
            System.out.println("ID: " + colab.getId() + " Nome: " + colab.getNome());
        }
        System.out.print("Selecione o ID do Colaborador: ");
        int idColab = scanner.nextInt();
        scanner.nextLine();

        listarProjetos();
        System.out.print("Selecione o ID do Projeto: ");
        int idProj = scanner.nextInt();
        scanner.nextLine();

        Projeto projeto = uniag.findProjeto(idProj);
        InvColaborador colab = uniag.findInvColaborador(idColab);
        boolean sucesso = projeto.associarInvColaborador(colab);
        if (sucesso) {
            System.out.println("Associação realizada com sucesso.");
        } else {
            System.out.println("Erro ao associar Colaborador ao Projeto.");
        }
    }

    private void listarProjetos() {
        System.out.println("\nLista de Projetos:");
        for (Projeto proj : uniag.getProjetos()) {
            System.out.println("ID: " + proj.getId() + " Título: " + proj.getTitulo());
        }
    }
}