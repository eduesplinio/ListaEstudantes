public class Estudante {
    private int matricula;
    private String nome;
    private String email;
    private int telefone;
    private String enderecoCompleto;

    public Estudante(int matricula, String nome, String email, int telefone, String enderecoCompleto) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.enderecoCompleto = enderecoCompleto;
    }

    public int obterMatricula() {
        return matricula;
    }

    public String obterNome() {
        return nome;
    }

    public String obterEmail() {
        return email;
    }

    public int obterTelefone() {
        return telefone;
    }

    public String obterEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void atualizarMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void atualizarNome(String nome) {
        this.nome = nome;
    }

    public void atualizarEmail(String email) {
        this.email = email;
    }

    public void atualizarTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void atualizarEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }
}
