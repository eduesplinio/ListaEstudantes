import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceEstudante {

    private Scanner scanner;
    private ControladorEstudante controladorEstudante;

    public InterfaceEstudante() {
        scanner = new Scanner(System.in);
        controladorEstudante = new ControladorEstudante();
    }

    private int obterOpcao() {
        System.out.println("1 - Incluir");
        System.out.println("2 - Localizar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Listar");
        System.out.println("0 - Sair");
        System.out.print("Opcao: ");
        return scanner.nextInt();
    }

    private void incluirEstudante() {
        int matricula;
        String nome;
        String email;
        int telefone;
        String enderecoCompleto;

        System.out.print("Matricula: ");
        matricula = scanner.nextInt();

        System.out.print("Nome: ");
        nome = scanner.next();

        System.out.print("Email: ");
        email = scanner.next();

        System.out.print("Telefone: ");
        telefone = scanner.nextInt();

        System.out.print("Endereço Completo: ");
        enderecoCompleto = scanner.next();

        Estudante estudante = new Estudante(matricula, nome, email, telefone, enderecoCompleto);
        controladorEstudante.incluirEstudante(estudante);
    }

    private void localizarEstudante() {
        String nome;

        System.out.print("Informe o nome do estudante: ");
        nome = scanner.next();

        Estudante estudante = controladorEstudante.localizarEstudantePorNome(nome);
        if (estudante != null) {
            System.out.println("Estudante\n" +
                    "Nome: " + estudante.obterNome() + "\n" +
                    "Matricula: " + estudante.obterMatricula() + "\n" +
                    "Email: " + estudante.obterEmail() + "\n" +
                    "Telefone: " + estudante.obterTelefone() + "\n" +
                    "Endereço Completo: " + estudante.obterEnderecoCompleto());
        } else {
            System.out.println("Estudante não encontrado.");
        }
    }

    private void excluirEstudante() {
        int matricula;

        System.out.print("Informe a matrícula do estudante: ");
        matricula = scanner.nextInt();

        Estudante estudante = controladorEstudante.localizarEstudantePorMatricula(matricula);
        if (estudante != null) {
            controladorEstudante.excluirEstudante(estudante);
            System.out.println("Estudante excluído.");
        } else {
            System.out.println("Estudante não encontrado.");
        }
    }

    private void listarEstudantes() {
        ArrayList<Estudante> estudantes = controladorEstudante.obterEstudantes();

        if (estudantes.isEmpty()) {
            System.out.println("Nenhum estudante cadastrado.");
        } else {
            System.out.println("Lista de Estudantes:");
            for (Estudante estudante : estudantes) {
                System.out.println("Nome: " + estudante.obterNome());
                System.out.println("Matricula: " + estudante.obterMatricula());
                System.out.println("Email: " + estudante.obterEmail());
                System.out.println("Telefone: " + estudante.obterTelefone());
                System.out.println("Endereço Completo: " + estudante.obterEnderecoCompleto());
                System.out.println("------------------------------");
            }
        }
    }

    public void executar() {
        int opcao = 0;
        do {
            opcao = obterOpcao();
            switch (opcao) {
                case 1:
                    incluirEstudante();
                    break;
                case 2:
                    localizarEstudante();
                    break;
                case 3:
                    excluirEstudante();
                    break;
                case 4:
                    listarEstudantes();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Escolha uma opção válida.");
            }
        } while (opcao != 0);
    }

    public static void main(String[] args) {
        InterfaceEstudante interfaceEstudante = new InterfaceEstudante();
        interfaceEstudante.executar();
    }
}
