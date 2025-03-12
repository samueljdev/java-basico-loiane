package Aula20;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    String visibilidadeDefault; // modificadores de acesso default
    public String visibilidadePublic; // modificadores de acesso public
    private String visibilidadePrivate;
    protected String visibilidadeProtected;

    public Pessoa() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getVisibilidadePrivate() {
        return visibilidadePrivate = "modificadores de acesso Private, o atributo só pode ser acessado somente pela própria classe via metodos getts e setts";
    }

    public void setVisibilidadePrivate(String visibilidadePrivate) {
        this.visibilidadePrivate = visibilidadePrivate;
    }

    public String getVisibilidadeProtected() {
        return visibilidadeProtected = "modificadores de acesso Protected pode acessado por todas as classes dentro pacotes/diretorios do projeto inteiro";
    }

    public void setVisibilidadeProtected(String visibilidadeProtected) {
        this.visibilidadeProtected = visibilidadeProtected;
    }
}
